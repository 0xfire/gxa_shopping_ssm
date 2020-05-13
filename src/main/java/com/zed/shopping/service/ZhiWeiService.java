package com.zed.shopping.service;

import com.zed.shopping.pojo.ZhiWei;

import java.util.List;
import java.util.Map;

/**
 * (ZhiWei)表服务接口
 *
 * @author makejava
 * @since 2020-05-12 12:03:49
 */
public interface ZhiWeiService {


    Map<String, Object> chaXunFenYe(int yeMa, String zhiWeiMingCheng);

    Map<String, Object> xinZeng(ZhiWei zhiWei);

    Map<String, Object> gengXinById(ZhiWei zhiWei);

    Map<String, Object> shanChuZhiWeiById(String id);
}