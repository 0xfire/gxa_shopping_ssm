package com.zed.shopping.controller;

import com.zed.shopping.pojo.User;
import com.zed.shopping.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-05-09 17:05:26
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    @GetMapping("test")
    public Map<String,String> test(){
        Map<String,String> map = new HashMap<>();
        map.put("aaa","bbb");
        System.out.println("中文");
        return map;
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

}