package com.zed.shopping.pojo;

import java.sql.Date;
import java.io.Serializable;

/**
 * (BuMen)实体类
 *
 * @author makejava
 * @since 2020-05-11 10:21:52
 */
public class BuMen implements Serializable {
    private static final long serialVersionUID = 946837895720073352L;
    
    private String id;
    
    private String bumenmingcheng;
    
    private Date chenglishijian;
    
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