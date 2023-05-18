package com.wangbin.novel.service;

import com.wangbin.novel.core.common.resp.RestResp;
import com.wangbin.novel.dto.resp.BookCategoryRespDto;
import com.wangbin.novel.manager.cache.BookCategoryCacheManager;

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
}
