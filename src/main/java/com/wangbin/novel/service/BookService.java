package com.wangbin.novel.service;

import com.wangbin.novel.core.common.resp.RestResp;
import com.wangbin.novel.dto.resp.BookCategoryRespDto;
import com.wangbin.novel.dto.resp.BookChapterAboutRespDto;
import com.wangbin.novel.dto.resp.BookInfoRespDto;

import java.util.List;

/**
 * 小说模块 服务类
 *
 * @author wangbin
 * @date 2022/5/14
 */
public interface BookService {

    /**
     * 小说分类列表查询
     *
     * @param workDirection 作品方向;0-男频 1-女频
     * @return 分类列表
     */
    RestResp<List<BookCategoryRespDto>> listCategory(Integer workDirection);



    /**
     * 小说信息查询
     *
     * @param bookId 小说ID
     * @return 小说信息
     */
    RestResp<BookInfoRespDto> getBookById(Long bookId);


    /**
     * 增加小说点击量
     *
     * @param bookId 小说ID
     * @return 成功状态
     */
    RestResp<Void> addVisitCount(Long bookId);

    /**
     * 小说最新章节相关信息查询
     *
     * @param bookId 小说ID
     * @return 章节相关联的信息
     */
    RestResp<BookChapterAboutRespDto> getLastChapterAbout(Long bookId);

}
