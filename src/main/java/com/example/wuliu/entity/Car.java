package com.example.wuliu.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 车辆(Car)实体类
 *
 * @author makejava
 * @since 2022-02-23 15:58:55
 */
public class Car implements Serializable {
    private static final long serialVersionUID = -36382880536017949L;
    /**
     * 主键
     */
    private String id;
    /**
     * 车辆编号
     */
    private String number;
    /**
     * 所属地区
     */
    private String area;
    /**
     * 目的地
     */
    private String destination;
    /**
     * 到达时间
     */
    private Date arrivetime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

}

