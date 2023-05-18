package com.wangbin.novel.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wangbin.novel.core.common.resp.RestResp;
import com.wangbin.novel.core.constant.DatabaseConsts;
import com.wangbin.novel.dao.entity.BookChapter;
import com.wangbin.novel.dao.mapper.BookChapterMapper;
import com.wangbin.novel.dao.mapper.BookInfoMapper;
import com.wangbin.novel.dto.resp.BookCategoryRespDto;
import com.wangbin.novel.dto.resp.BookChapterAboutRespDto;
import com.wangbin.novel.dto.resp.BookChapterRespDto;
import com.wangbin.novel.dto.resp.BookInfoRespDto;
import com.wangbin.novel.manager.cache.BookCategoryCacheManager;
import com.wangbin.novel.manager.cache.BookChapterCacheManager;
import com.wangbin.novel.manager.cache.BookContentCacheManager;
import com.wangbin.novel.manager.cache.BookInfoCacheManager;
import com.wangbin.novel.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小说模块 服务实现类
 *
 * @author wangbin
 * @date 2022/5/14
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class BookServiceImpl implements BookService {

    private final BookCategoryCacheManager bookCategoryCacheManager;
    private final BookInfoCacheManager bookInfoCacheManager;
    private final BookContentCacheManager bookContentCacheManager;
    private final BookChapterCacheManager bookChapterCacheManager;
    private final BookInfoMapper bookInfoMapper;

    private final BookChapterMapper bookChapterMapper;

    @Override
    public RestResp<List<BookCategoryRespDto>> listCategory(Integer workDirection) {
        return RestResp.ok(bookCategoryCacheManager.listCategory(workDirection));
    }

    @Override
    public RestResp<BookInfoRespDto> getBookById(Long bookId) {
        return RestResp.ok(bookInfoCacheManager.getBookInfo(bookId));
    }

    @Override
    public RestResp<Void> addVisitCount(Long bookId) {
        bookInfoMapper.addVisitCount(bookId);
        return RestResp.ok();
    }

    @Override
    public RestResp<BookChapterAboutRespDto> getLastChapterAbout(Long bookId) {
        // 查询小说信息
        BookInfoRespDto bookInfo = bookInfoCacheManager.getBookInfo(bookId);

        // 查询最新章节信息
        BookChapterRespDto bookChapter = bookChapterCacheManager.getChapter(
                bookInfo.getLastChapterId());

        // 查询章节内容
        String content = bookContentCacheManager.getBookContent(bookInfo.getLastChapterId());

        // 查询章节总数
        QueryWrapper<BookChapter> chapterQueryWrapper = new QueryWrapper<>();
        chapterQueryWrapper.eq(DatabaseConsts.BookChapterTable.COLUMN_BOOK_ID, bookId);
        Long chapterTotal = bookChapterMapper.selectCount(chapterQueryWrapper);

        // 组装数据并返回
        return RestResp.ok(BookChapterAboutRespDto.builder()
                .chapterInfo(bookChapter)
                .chapterTotal(chapterTotal)
                .contentSummary(content.substring(0, 30))
                .build());
    }
}
