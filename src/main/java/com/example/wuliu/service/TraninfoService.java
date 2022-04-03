package com.example.wuliu.service;

import com.example.wuliu.entity.Traninfo;

/**
 * (Traninfo)表服务接口
 *
 * @author makejava
 * @since 2022-03-27 15:41:56
 */
public interface TraninfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Traninfo queryById(Integer id);

    /**
     * 新增数据
     *
     * @param traninfo 实例对象
     * @return 实例对象
     */
    Traninfo insert(Traninfo traninfo);

    /**
     * 修改数据
     *
     * @param traninfo 实例对象
     * @return 实例对象
     */
    Traninfo update(Traninfo traninfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
