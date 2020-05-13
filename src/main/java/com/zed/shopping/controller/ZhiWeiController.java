package com.zed.shopping.controller;

import com.zed.shopping.pojo.ZhiWei;
import com.zed.shopping.service.ZhiWeiService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ZhiWei)表控制层
 *
 * @author makejava
 * @since 2020-05-12 12:03:49
 */
@RestController
@RequestMapping("zhiWei")
public class ZhiWeiController {
    /**
     * 服务对象
     */
    @Resource
    private ZhiWeiService zhiWeiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ZhiWei selectOne(String id) {
        return this.zhiWeiService.queryById(id);
    }

}