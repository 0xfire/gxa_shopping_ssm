package com.zed.shopping.mapper;

import com.zed.shopping.pojo.BuMen;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (BuMen)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-11 10:21:52
 */
public interface BuMenMapper {

    /**
     * 查询所有的部门列表记录
     *
     * @return 返回list结构的列表，即是只有一条记录，或者没有记录，都会返回list对象
     */
    List<BuMen> chaXunFenYe(Map<String, Object> map);

    /**
     * 通过一个部门的模糊名称，完成一次模糊查找，并返回总个数，为了计算分页
     * @param mingCheng  名称
     * @return  返回总个数
     */
    int chaXunGeShu(@Param("mingCheng") String mingCheng);
}