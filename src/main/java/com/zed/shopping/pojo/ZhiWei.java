package com.zed.shopping.pojo;

import java.io.Serializable;

/**
 * (ZhiWei)实体类
 *
 * @author makejava
 * @since 2020-05-12 12:03:49
 */
public class ZhiWei implements Serializable {
    private static final long serialVersionUID = 991864919781930872L;
    
    private String id;
    
    private String zhiweimingcheng;
    
    private String zhiweimiaoshu;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZhiweimingcheng() {
        return zhiweimingcheng;
    }

    public void setZhiweimingcheng(String zhiweimingcheng) {
        this.zhiweimingcheng = zhiweimingcheng;
    }

    public String getZhiweimiaoshu() {
        return zhiweimiaoshu;
    }

    public void setZhiweimiaoshu(String zhiweimiaoshu) {
        this.zhiweimiaoshu = zhiweimiaoshu;
    }

}