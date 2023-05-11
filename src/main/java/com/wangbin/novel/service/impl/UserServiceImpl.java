package com.wangbin.novel.service.impl;

import com.wangbin.novel.dao.entity.User;
import com.wangbin.novel.dao.mapper.UserMapper;
import com.wangbin.novel.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author wangbin
 * @since 2023/05/12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
