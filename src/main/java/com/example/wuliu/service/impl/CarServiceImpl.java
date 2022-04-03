package com.example.wuliu.service.impl;

import com.example.wuliu.entity.Car;
import com.example.wuliu.dao.CarDao;
import com.example.wuliu.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 车辆(Car)表服务实现类
 *
 * @author makejava
 * @since 2022-03-27 15:41:53
 */
@Service("carService")
public class CarServiceImpl implements CarService {
    @Resource
    private CarDao carDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    @Override
    public Car queryById(String cid) {
        return this.carDao.queryById(cid);
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
        return this.queryById(car.getCid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String cid) {
        return this.carDao.deleteById(cid) > 0;
    }
}
