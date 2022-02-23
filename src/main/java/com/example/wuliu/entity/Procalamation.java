package com.example.wuliu.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Procalamation)实体类
 *
 * @author makejava
 * @since 2022-02-23 16:24:24
 */
public class Procalamation implements Serializable {
    private static final long serialVersionUID = 772790386528529181L;

    private Integer id;
    /**
     * 公告内容
     */
    private String content;
    /**
     * 公告标题
     */
    private String title;
    /**
     * 公告发布时间
     */
    private Date time;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}

