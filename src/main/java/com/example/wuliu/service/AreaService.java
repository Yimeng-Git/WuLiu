package com.example.wuliu.service;

import com.example.wuliu.entity.Area;

/**
 * (Area)表服务接口
 *
 * @author makejava
 * @since 2022-02-23 16:53:05
 */
public interface AreaService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Area queryById(Integer id);

    /**
     * 新增数据
     *
     * @param area 实例对象
     * @return 实例对象
     */
    Area insert(Area area);

    /**
     * 修改数据
     *
     * @param area 实例对象
     * @return 实例对象
     */
    Area update(Area area);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
