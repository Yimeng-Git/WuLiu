package com.example.wuliu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.Mapping;

import java.io.Serializable;

/**
 * (Area)实体类
 *
 * @author makejava
 * @since 2022-03-27 15:41:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Area implements Serializable {
    private static final long serialVersionUID = -36569284093903596L;

    private Integer id;

    private String name;
}

