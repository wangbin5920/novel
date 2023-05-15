package com.wangbin.novel.service;

import com.wangbin.novel.core.common.resp.RestResp;
import com.wangbin.novel.dto.resp.HomeBookRespDto;
import com.wangbin.novel.dto.resp.HomeFriendLinkRespDto;

import java.util.List;

/**
 * 首页模块 服务类
 *
 * @author wangbin
 * @date 2023/5/13
 */
public interface HomeService {

    /**
     * 查询首页小说推荐列表
     *
     * @return 首页小说推荐列表的 rest 响应结果
     */
    RestResp<List<HomeBookRespDto>> listHomeBooks();

    /**
     * 首页友情链接列表查询
     *
     * @return 友情链接列表
     */
    RestResp<List<HomeFriendLinkRespDto>> listHomeFriendLinks();
}
