package com.example.wuliu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Waybill)实体类
 *
 * @author makejava
 * @since 2022-03-27 15:41:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Waybill implements Serializable {
    private static final long serialVersionUID = 296710784806404315L;
    /**
     * 订单号
     */
    private String tntnumber;
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
    /**
     * wid
     */
    private Integer wid;
    /**
     * 运单状态码（0:待运输，1:正在运输）
     */
    private String status;
}

