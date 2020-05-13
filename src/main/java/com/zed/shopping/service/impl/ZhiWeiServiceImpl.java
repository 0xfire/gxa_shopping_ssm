package com.zed.shopping.service.impl;

import com.zed.shopping.pojo.ZhiWei;
import com.zed.shopping.mapper.ZhiWeiMapper;
import com.zed.shopping.service.ZhiWeiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ZhiWei)表服务实现类
 *
 * @author makejava
 * @since 2020-05-12 12:03:49
 */
@Service("zhiWeiService")
public class ZhiWeiServiceImpl implements ZhiWeiService {
    @Resource
    private ZhiWeiMapper zhiWeiMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ZhiWei queryById(String id) {
        return this.zhiWeiMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ZhiWei> queryAllByLimit(int offset, int limit) {
        return this.zhiWeiMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param zhiWei 实例对象
     * @return 实例对象
     */
    @Override
    public ZhiWei insert(ZhiWei zhiWei) {
        this.zhiWeiMapper.insert(zhiWei);
        return zhiWei;
    }

    /**
     * 修改数据
     *
     * @param zhiWei 实例对象
     * @return 实例对象
     */
    @Override
    public ZhiWei update(ZhiWei zhiWei) {
        this.zhiWeiMapper.update(zhiWei);
        return this.queryById(zhiWei.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.zhiWeiMapper.deleteById(id) > 0;
    }
}