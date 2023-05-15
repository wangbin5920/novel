package com.wangbin.novel.controller.front;

import com.wangbin.novel.core.constant.ApiRouterConsts;
import com.wangbin.novel.core.common.resp.RestResp;
import com.wangbin.novel.dto.resp.HomeBookRespDto;
import com.wangbin.novel.dto.resp.HomeFriendLinkRespDto;
import com.wangbin.novel.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 首页模块 API 接口
 *
 * @author xiongxiaoyang
 * @date 2022/5/12
 */
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_HOME_URL_PREFIX)
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    /**
     * 首页小说推荐查询接口
     */
    @GetMapping("/books")
    public RestResp<List<HomeBookRespDto>> listHomeBooks() {
        return homeService.listHomeBooks();
    }


    /**
     * 首页友情链接列表查询接口
     *
     * @Operation(summary = "首页友情链接列表查询接口")
     */
    @GetMapping("friend_Link/list")
    public RestResp<List<HomeFriendLinkRespDto>> listHomeFriendLinks() {
        return homeService.listHomeFriendLinks();
    }
}
