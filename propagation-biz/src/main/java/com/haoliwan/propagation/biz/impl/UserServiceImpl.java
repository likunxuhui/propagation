package com.haoliwan.propagation.biz.impl;

import com.haoliwan.propagation.biz.UserService;
import com.haoliwan.propagation.domain.entity.User;
import com.haoliwan.propagation.domain.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    @Transactional
    public User addUser(User user) {
        int flag = userMapper.insert(user);
        String thread = Thread.currentThread().getName();
        return userMapper.selectByPrimaryKey(user.getId());
    }
}
