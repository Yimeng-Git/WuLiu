package com.example.wuliu.service;

import com.example.wuliu.entity.Car;
import com.github.pagehelper.PageInfo;

/**
 * 车辆(Car)表服务接口
 *
 * @author makejava
 * @since 2022-03-27 15:41:53
 */
public interface CarService {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Car queryById(Integer cid);

    /**
     * 新增数据
     *
     * @param car 实例对象
     * @return 实例对象
     */
    boolean insert(Car car);

    /**
     * 修改数据
     *
     * @param car 实例对象
     * @return 实例对象
     */
    Car update(Car car);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cid);

    PageInfo queryAll(Integer pageNum, Integer pageSize, Car car);
}
