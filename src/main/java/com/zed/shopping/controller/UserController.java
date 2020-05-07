package com.zed.shopping.controller;

import com.zed.shopping.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/user")
    public Map<String,Object> selectUser(){
        Map<String,Object> map=new HashMap<>();
        map.put("code","200");
        map.put("user",userService.selectUser());
        return map;
    }
}
