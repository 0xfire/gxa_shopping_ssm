package com.zed.shopping.controller;

import com.zed.shopping.pojo.ZhiWei;
import com.zed.shopping.service.ZhiWeiService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (ZhiWei)表控制层
 *
 * @author makejava
 * @since 2020-05-12 12:03:49
 */
@RestController
@RequestMapping("/zhiwei")
public class ZhiWeiController {
    /**
     * 服务对象
     */
    @Resource
    private ZhiWeiService zhiWeiService;


    @RequestMapping(value = "/chaXunZhiWeiFenYe", method = RequestMethod.GET)
    public Map<String, Object> chaXunZhiWeiFenYe(@RequestParam(name = "yeMa") int yeMa, String zhiWeiMingCheng) {

        return this.zhiWeiService.chaXunFenYe(yeMa, zhiWeiMingCheng);
    }

    @RequestMapping(value = "/shanChuZhiWeiById", method = RequestMethod.POST)
    public Map<String, Object> shanChuZhiWeiById(@RequestParam(name = "id") String id) {
        System.out.println(id);
        return this.zhiWeiService.shanChuZhiWeiById(id);
    }
}