package com.zed.shopping.service.impl;

import com.zed.shopping.pojo.BuMen;
import com.zed.shopping.mapper.BuMenMapper;
import com.zed.shopping.service.BuMenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (BuMen)表服务实现类
 *
 * @author makejava
 * @since 2020-05-11 10:21:52
 */
@Service("buMenService")
public class BuMenServiceImpl implements BuMenService {
    @Resource
    private BuMenMapper buMenMapper;
    /**
     * 查询所有的部门列表记录
     *
     * @return 返回一个map接口的数据，此数据中有三个参数1.code 代表处理状态 2.msg 代表处理信息  3.list  代表返回数据
     */
    public Map<String, Object> chaXunFenYe(int yeMa, String mingCheng) {
        // 计算分页的起始点，数据库中的数据是从0下标开始的
        // 每页显示10条记录，第一页从0下标-9下标，第二页从10下标-19下标
        int qiShiDian = (yeMa - 1) * 10;
        // 查询部门总个数
        int zongGeShu = buMenMapper.chaXunGeShu(mingCheng);
        // 计算总计页码
        int zongYeMa = (zongGeShu - 1) / 10 + 1;
        // 查询当前用户指定页码的分页数据
        Map<String, Object> map = new HashMap<>();
        // 添加分页的起始下标点
        map.put("qiShiDian", qiShiDian);
        // 判断用户是否传入了职位名称
        if(mingCheng != null && !mingCheng.equals("")) {
            map.put("mingCheng", mingCheng);
        }
        // 根据条件完成分页查询
        List<BuMen> buMenList = buMenMapper.chaXunFenYe(map);
        // 重用map对象，首先清除内部数据
        map.clear();
        map.put("code", "200");
        map.put("msg", "查询部门列表成功");
        map.put("list",buMenList);
        map.put("buMenList",buMenList);
        map.put("zongGeShu",zongGeShu);
        map.put("zongYeMa",zongYeMa);
        map.put("dangQianYeMa",yeMa);
        return map;
    }
}