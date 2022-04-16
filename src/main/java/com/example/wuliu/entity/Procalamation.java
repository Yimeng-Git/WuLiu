package com.example.wuliu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (Procalamation)实体类
 *
 * @author makejava
 * @since 2022-03-27 15:41:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Procalamation implements Serializable {
    private static final long serialVersionUID = 571680450670560708L;
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
    private Date protime;

    private Integer pid;

}

