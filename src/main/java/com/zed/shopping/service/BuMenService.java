package com.zed.shopping.service;

import com.zed.shopping.pojo.BuMen;
import java.util.List;
import java.util.Map;

/**
 * (BuMen)表服务接口
 *
 * @author makejava
 * @since 2020-05-11 10:21:51
 */
public interface BuMenService {

    public Map<String, Object> chaXunFenYe(int yeMa, String mingCheng);
}