package com.example.wuliu.service;

import com.example.wuliu.entity.Procalamation;

/**
 * (Procalamation)表服务接口
 *
 * @author makejava
 * @since 2022-02-23 16:24:24
 */
public interface ProcalamationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Procalamation queryById(Integer id);

    /**
     * 新增数据
     *
     * @param procalamation 实例对象
     * @return 实例对象
     */
    Procalamation insert(Procalamation procalamation);

    /**
     * 修改数据
     *
     * @param procalamation 实例对象
     * @return 实例对象
     */
    Procalamation update(Procalamation procalamation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
