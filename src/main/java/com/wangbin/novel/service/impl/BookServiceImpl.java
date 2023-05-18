package com.wangbin.novel.service.impl;

import com.wangbin.novel.core.common.resp.RestResp;
import com.wangbin.novel.dto.resp.BookCategoryRespDto;
import com.wangbin.novel.manager.cache.BookCategoryCacheManager;
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

    @Override
    public RestResp<List<BookCategoryRespDto>> listCategory(Integer workDirection) {
        return  RestResp.ok(bookCategoryCacheManager.listCategory(workDirection));
    }
}
