package com.example.wuliu.service;

import com.example.wuliu.entity.Procalamation;

/**
 * (Procalamation)表服务接口
 *
 * @author makejava
 * @since 2022-03-27 15:41:55
 */
public interface ProcalamationService {

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    Procalamation queryById(Integer pid);

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
     * @param pid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pid);

}
