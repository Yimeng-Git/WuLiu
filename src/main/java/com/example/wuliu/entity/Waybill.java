package com.example.wuliu.entity;

import java.io.Serializable;

/**
 * (Waybill)实体类
 *
 * @author makejava
 * @since 2022-02-23 16:35:46
 */
public class Waybill implements Serializable {
    private static final long serialVersionUID = 554151070262899365L;
    /**
     * 主键
     */
    private Integer tntnumber;
    /**
     * 寄件人姓名
     */
    private String senname;
    /**
     * 寄件人地址
     */
    private String senaddress;
    /**
     * 寄件人邮编
     */
    private String senzipcode;
    /**
     * 寄件人手机号
     */
    private String senphonenum;
    /**
     * 物品名称
     */
    private String goodsname;
    /**
     * 收件人姓名
     */
    private String rename;
    /**
     * 收件人手机号
     */
    private String recphonenum;
    /**
     * 收件人地址
     */
    private String recaddress;
    /**
     * 收件人地址邮编
     */
    private String reczipcode;
    /**
     * 派送车辆编号
     */
    private String carnum;
    /**
     * 到达状态
     */
    private String arrive;


    public Integer getTntnumber() {
        return tntnumber;
    }

    public void setTntnumber(Integer tntnumber) {
        this.tntnumber = tntnumber;
    }

    public String getSenname() {
        return senname;
    }

    public void setSenname(String senname) {
        this.senname = senname;
    }

    public String getSenaddress() {
        return senaddress;
    }

    public void setSenaddress(String senaddress) {
        this.senaddress = senaddress;
    }

    public String getSenzipcode() {
        return senzipcode;
    }

    public void setSenzipcode(String senzipcode) {
        this.senzipcode = senzipcode;
    }

    public String getSenphonenum() {
        return senphonenum;
    }

    public void setSenphonenum(String senphonenum) {
        this.senphonenum = senphonenum;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename;
    }

    public String getRecphonenum() {
        return recphonenum;
    }

    public void setRecphonenum(String recphonenum) {
        this.recphonenum = recphonenum;
    }

    public String getRecaddress() {
        return recaddress;
    }

    public void setRecaddress(String recaddress) {
        this.recaddress = recaddress;
    }

    public String getReczipcode() {
        return reczipcode;
    }

    public void setReczipcode(String reczipcode) {
        this.reczipcode = reczipcode;
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

}

