package com.example.wuliu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 车辆(Car)实体类
 *
 * @author makejava
 * @since 2022-03-27 15:41:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Serializable {
    private static final long serialVersionUID = 146124969725259010L;
    /**
     * 所属地区
     */
    private String area;
    /**
     * 目的地
     */
    private String destination;
    /**
     * 主键
     */
    private Integer cid;
    /**
     * 车辆编号
     */
    private String carnum;
    /**
     * 车辆状态（0:空闲中，1:运输中）
     */
    private String status;

}

