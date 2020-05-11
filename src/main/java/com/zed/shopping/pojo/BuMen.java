package com.zed.shopping.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.io.Serializable;

/**
 * (BuMen)实体类
 *
 * @author makejava
 * @since 2020-05-11 10:21:52
 */
@ApiModel(value = "BuMen",description = "部门对象模型")
public class BuMen implements Serializable {
    private static final long serialVersionUID = 768192258934758207L;

    @ApiModelProperty(name = "id",notes = "主键",dataType = "String",required = false)
    private String id;

    @ApiModelProperty(name = "bumenmingcheng",notes = "部门名称",dataType = "String",required = true)
    private String bumenmingcheng;

    @ApiModelProperty(name = "chenglishijian",notes = "成立时间，一定要求前端页面传递\"2018-06-06\"格式，如果传递的是\"2018-6-6\"格式将抛出错误",dataType = "String",required = true)
    @DateTimeFormat(pattern="yyyy-MM-dd")   // 一定大小写，注意这样的格式转换，可以把前端的字符串时间转换为Date对象，但是一定要求前端页面传递"2018-06-06"格式，如果传递的是"2018-6-6"格式将抛出错误
    @JsonFormat(pattern="yyyy-MM-dd")      //  一定大小写，返回json数据，默认返回时间戳，通过JsonFormat转换格式
    private Date chenglishijian;

    @ApiModelProperty(name = "bumenmiaoshu",notes = "部门描述",dataType = "String",required = true)
    private String bumenmiaoshu;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBumenmingcheng() {
        return bumenmingcheng;
    }

    public void setBumenmingcheng(String bumenmingcheng) {
        this.bumenmingcheng = bumenmingcheng;
    }

    public Date getChenglishijian() {
        return chenglishijian;
    }

    public void setChenglishijian(Date chenglishijian) {
        this.chenglishijian = chenglishijian;
    }

    public String getBumenmiaoshu() {
        return bumenmiaoshu;
    }

    public void setBumenmiaoshu(String bumenmiaoshu) {
        this.bumenmiaoshu = bumenmiaoshu;
    }

}