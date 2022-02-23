package com.example.wuliu.service;


import com.example.wuliu.entity.Car;

/**
 * 车辆(Car)表服务接口
 *
 * @author makejava
 * @since 2022-02-23 15:58:55
 */
public interface CarService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Car queryById(String id);

    /**
     * 新增数据
     *
     * @param car 实例对象
     * @return 实例对象
     */
    Car insert(Car car);

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
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}
