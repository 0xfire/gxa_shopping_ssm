package com.zed.shopping.service;

import com.zed.shopping.pojo.User;
import com.zed.shopping.pojo.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User selectUser(){
        return userMapper.selectByPrimaryKey(1);
    }
}
