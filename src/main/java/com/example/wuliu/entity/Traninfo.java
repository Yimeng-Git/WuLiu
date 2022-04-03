package com.example.wuliu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (Traninfo)实体类
 *
 * @author makejava
 * @since 2022-03-27 15:41:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Traninfo implements Serializable {
    private static final long serialVersionUID = -96042406938691681L;

    private Integer id;
    /**
     * 开始时间
     */
    private Date starttime;
    /**
     * 订单号
     */
    private String tntnumber;
    /**
     * 车辆编号
     */
    private String carnum;
    /**
     * 预计到达时间
     */
    private Date arrivetime;


}

