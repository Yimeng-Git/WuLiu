package com.example.wuliu.entity;

import java.io.Serializable;

/**
 * (Area)实体类
 *
 * @author makejava
 * @since 2022-02-23 16:53:04
 */
public class Area implements Serializable {
    private static final long serialVersionUID = -52122251790076516L;

    private Integer id;

    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

