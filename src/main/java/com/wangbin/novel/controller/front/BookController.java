package com.wangbin.novel.controller.front;

import com.wangbin.novel.core.common.resp.RestResp;
import com.wangbin.novel.core.constant.ApiRouterConsts;
import com.wangbin.novel.dto.resp.BookCategoryRespDto;
import com.wangbin.novel.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
