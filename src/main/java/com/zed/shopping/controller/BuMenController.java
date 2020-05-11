package com.zed.shopping.controller;

import com.zed.shopping.pojo.BuMen;
import com.zed.shopping.service.BuMenService;
import com.zed.shopping.service.impl.BuMenServiceImpl;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (BuMen)表控制层
 *
 * @author makejava
 * @since 2020-05-11 10:21:52
 */
@RestController
@RequestMapping(value = "/bumen")
@Api(value = "部门管理",tags = "部门管理接口API")
@ApiResponses({
        @ApiResponse(code=400,message="请求参数不完整或者错误"),
        @ApiResponse(code=404,message="找不到页面"),
        @ApiResponse(code=406,message="页面地址和接口名冲突"),
        @ApiResponse(code=415,message="请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code=500,message="后台服务错误")
})
public class BuMenController {

    @Resource
    private BuMenServiceImpl buMenService;

    @RequestMapping(value = "/chaXunFenYe", method = RequestMethod.GET)
    @ApiOperation(value = "部门查询分页接口",notes = "部门查询分页接口",httpMethod = "get")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "yeMa",value = "页码",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "buMenMingCheng",value = "部门名称",paramType = "query",dataType = "String",required = false)
    })
    public Map<String, Object> chaXunFenYe(@RequestParam(name = "yeMa") int yeMa, String buMenMingCheng) {
        System.out.println("yeMa=" + yeMa);
        System.out.println("buMenMingCheng=" + buMenMingCheng);
        return this.buMenService.chaXunFenYe(yeMa, buMenMingCheng);
    }

    @RequestMapping(value = "/xinZeng", method = RequestMethod.POST)
    @ApiOperation(value = "新增单一部门对象的接口",notes = "新增单一部门对象的接口",httpMethod = "post")
    public Map<String, Object> xinZeng(@RequestBody @ApiParam(name = "buMen",value = "部门名称",required = true) BuMen buMen) {

        return buMenService.xinZeng(buMen);
    }

    @RequestMapping(value = "/gengXinById", method = RequestMethod.POST)
    @ApiOperation(value = "新增单一部门对象的接口",notes = "新增单一部门对象的接口",httpMethod = "post")
    public Map<String, Object> gengXinById(@RequestBody @ApiParam(name = "buMen",value = "更新byId",required = true) BuMen buMen) {

        return buMenService.gengXinById(buMen);
    }
}