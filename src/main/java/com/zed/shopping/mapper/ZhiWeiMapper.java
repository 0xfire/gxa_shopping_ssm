package com.zed.shopping.mapper;

import com.zed.shopping.pojo.BuMen;
import com.zed.shopping.pojo.ZhiWei;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * (ZhiWei)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-12 12:03:49
 */
public interface ZhiWeiMapper {

    List<ZhiWei> chaXunFenYe(Map<String, Object> map);

    int chaXunGeShu(@Param("mingCheng") String mingCheng);

    void shanChuZhiWeiById(@Param("id") String id);

    void xinZeng(ZhiWei zhiWei);

    void gengXinById(ZhiWei zhiWei);
}