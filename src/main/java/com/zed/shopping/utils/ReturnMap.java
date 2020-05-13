package com.zed.shopping.utils;

import java.util.HashMap;
import java.util.Map;

public class ReturnMap {
    /**
     * 初始化一个HashMap.并且传递对应的状态码和返回信息
     *
     * @param code 状态码
     * @param msg  信息
     * @return 返回HashMap对象
     */
    public Map<String, Object> getMap(int code, String msg) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", code);
        map.put("msg", msg);
        return map;
    }
}
