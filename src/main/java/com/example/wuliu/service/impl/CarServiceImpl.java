package com.example.wuliu.service.impl;

import com.example.wuliu.dao.CarDao;
import com.example.wuliu.entity.Car;
import com.example.wuliu.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 车辆(Car)表服务实现类
 *
 * @author makejava
 * @since 2022-02-23 15:58:55
 */
@Service("carService")
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Car queryById(String id) {
        return this.carDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param car 实例对象
     * @return 实例对象
     */
    @Override
    public Car insert(Car car) {
        this.carDao.insert(car);
        return car;
    }

    /**
     * 修改数据
     *
     * @param car 实例对象
     * @return 实例对象
     */
    @Override
    public Car update(Car car) {
        this.carDao.update(car);
        return this.queryById(car.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.carDao.deleteById(id) > 0;
    }
}
