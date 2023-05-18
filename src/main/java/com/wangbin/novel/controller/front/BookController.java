package com.wangbin.novel.controller.front;

import com.wangbin.novel.core.common.resp.RestResp;
import com.wangbin.novel.core.constant.ApiRouterConsts;
import com.wangbin.novel.dto.resp.BookCategoryRespDto;
import com.wangbin.novel.dto.resp.BookChapterAboutRespDto;
import com.wangbin.novel.dto.resp.BookInfoRespDto;
import com.wangbin.novel.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 前台门户-小说模块 API 控制器
 *
 * @author wangbin
 * @date 2022/5/14
 */
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_BOOK_URL_PREFIX)
@RequiredArgsConstructor
public class BookController {


    private final BookService bookService;

    /**
     * 小说分类列表查询接口
     */
    @GetMapping("category/list")
    public RestResp<List<BookCategoryRespDto>> listCategory(Integer workDirection) {
        return bookService.listCategory(workDirection);
    }


    /**
     * 小说信息查询接口
     */
    @GetMapping("{id}")
    public RestResp<BookInfoRespDto> getBookById(@PathVariable("id") Long bookId) {
        return bookService.getBookById(bookId);
    }


    /**
     * 增加小说点击量接口
     */
    @PostMapping("visit")
    public RestResp<Void> addVisitCount(Long bookId) {
        return bookService.addVisitCount(bookId);
    }


    /**
     * 小说最新章节相关信息查询接口
     */
    @GetMapping("last_chapter/about")
    public RestResp<BookChapterAboutRespDto> getLastChapterAbout(Long bookId) {
        return bookService.getLastChapterAbout(bookId);
    }

}
