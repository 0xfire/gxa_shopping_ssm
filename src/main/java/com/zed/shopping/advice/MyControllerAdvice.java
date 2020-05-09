package com.zed.shopping.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: thinknovo
 * Date: 2020/05/09
 * Description:  全局时监控的异常捕获管理  全解耦
 * Version: V1.0
 */
@RestControllerAdvice
public class MyControllerAdvice {
    @ExceptionHandler(NumberFormatException.class)
    public Map<String, Object> myException01() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "500");
        map.put("msg","MyControllerAdvice 对不起，用户输入的内容不是非法的数字");
        return map;
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public Map<String, Object> myException02() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "500");
        map.put("msg","MyControllerAdvice 对不起，数组下标超出");
        return map;
    }
}
