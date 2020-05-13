package com.zed.shopping.service.impl;

import com.zed.shopping.pojo.BuMen;
import com.zed.shopping.pojo.ZhiWei;
import com.zed.shopping.mapper.ZhiWeiMapper;
import com.zed.shopping.service.ZhiWeiService;
import com.zed.shopping.utils.ReturnCode;
import com.zed.shopping.utils.ReturnMap;
import com.zed.shopping.utils.ReturnMsg;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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

    public Map<String, Object> chaXunFenYe(int yeMa, String zhiWeiMingCheng) {
        // 计算分页的起始点，数据库中的数据是从0下标开始的
        // 每页显示10条记录，第一页从0下标-9下标，第二页从10下标-19下标
        int qiShiDian = (yeMa - 1) * 10;
        // 查询部门总个数
        int zongGeShu = zhiWeiMapper.chaXunGeShu(zhiWeiMingCheng);
        // 计算总计页码
        int zongYeMa = (zongGeShu - 1) / 10 + 1;
        // 查询当前用户指定页码的分页数据
        Map<String, Object> map = new ReturnMap().
                getMap(ReturnCode.CHENG_GONG, ReturnMsg.BU_MEN_FEN_YE);
        // 添加分页的起始下标点
        map.put("qiShiDian", qiShiDian);
        // 判断用户是否传入了职位名称
        if (zhiWeiMingCheng != null && !zhiWeiMingCheng.equals("")) {
            map.put("mingCheng", zhiWeiMingCheng);
        }
        // 根据条件完成分页查询
        List<ZhiWei> zhiWeiList = zhiWeiMapper.chaXunFenYe(map);
        // 重用map对象，首先清除内部数据
        /*map.put("list",zhiWeiList);*/
        map.put("zhiWeiList", zhiWeiList);
        map.put("zongGeShu", zongGeShu);
        map.put("zongYeMa", zongYeMa);
        map.put("dangQianYeMa", yeMa);
        return map;
    }

    @Override
    public Map<String, Object> xinZeng(ZhiWei zhiWei) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        zhiWei.setId(uuid);
        zhiWeiMapper.xinZeng(zhiWei);
        Map<String, Object> map = new ReturnMap().
                getMap(ReturnCode.CHENG_GONG, ReturnMsg.Bu_MEN_XINZ_ENG);
        map.put("id", uuid);
        return map;
    }

    @Override
    public Map<String, Object> gengXinById(ZhiWei zhiWei) {
        zhiWeiMapper.gengXinById(zhiWei);
        Map<String, Object> map = new ReturnMap().
                getMap(ReturnCode.CHENG_GONG, ReturnMsg.BU_MEN_GENG_XIN);

        map.put("id", zhiWei.getId());
        return map;
    }

    @Override
    public Map<String, Object> shanChuZhiWeiById(String id) {
        zhiWeiMapper.shanChuZhiWeiById(id);
        Map<String, Object> map = new ReturnMap().
                getMap(ReturnCode.CHENG_GONG, ReturnMsg.ZHI_WEI_SHAN_CHU);

        map.put("id", id);
        return map;
    }
}