package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User getUserById(Long id) {
        LambdaQueryWrapper<User> lqw1=new LambdaQueryWrapper<User>();
        lqw1.eq(User::getId,id);
        User user=userMapper.selectOne(lqw1);
        return user;
    }


}
