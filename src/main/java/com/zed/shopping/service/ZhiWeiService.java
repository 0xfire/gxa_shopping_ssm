package com.zed.shopping.service;

import com.zed.shopping.pojo.ZhiWei;
import java.util.List;

/**
 * (ZhiWei)表服务接口
 *
 * @author makejava
 * @since 2020-05-12 12:03:49
 */
public interface ZhiWeiService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ZhiWei queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ZhiWei> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param zhiWei 实例对象
     * @return 实例对象
     */
    ZhiWei insert(ZhiWei zhiWei);

    /**
     * 修改数据
     *
     * @param zhiWei 实例对象
     * @return 实例对象
     */
    ZhiWei update(ZhiWei zhiWei);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}