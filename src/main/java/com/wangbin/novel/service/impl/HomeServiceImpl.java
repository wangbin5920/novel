package com.wangbin.novel.service.impl;

import com.wangbin.novel.core.common.resp.RestResp;
import com.wangbin.novel.manager.cache.FriendLinkCacheManager;
import com.wangbin.novel.dto.resp.HomeBookRespDto;
import com.wangbin.novel.dto.resp.HomeFriendLinkRespDto;
import com.wangbin.novel.manager.cache.HomeBookCacheManager;
import com.wangbin.novel.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 首页模块 服务实现类
 *
 * @author wangbin
 * @date 2023/5/13
 */
@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {

    private final HomeBookCacheManager homeBookCacheManager;
    private final FriendLinkCacheManager friendLinkCacheManager;

    @Override
    public RestResp<List<HomeBookRespDto>> listHomeBooks() {
        return RestResp.ok(homeBookCacheManager.listHomeBooks());
    }

    @Override
    public RestResp<List<HomeFriendLinkRespDto>> listHomeFriendLinks() {
        return RestResp.ok(friendLinkCacheManager.listFriendLinks());
    }
}
