package com.example.wuliu.service.impl;

import com.example.wuliu.dao.CarDao;
import com.example.wuliu.dao.TraninfoDao;
import com.example.wuliu.entity.Car;
import com.example.wuliu.service.CarService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
    @Resource
    private TraninfoDao traninfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    @Override
    public Car queryById(Integer cid) {
        return this.carDao.queryById(cid);
    }

    /**
     * 新增数据
     *
     * @param car 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Car car) {
        car.setStatus("0");
        return this.carDao.insert(car) > 0;
    }

    /**
     * 修改数据
     *
     * @param car 实例对象
     * @return 实例对象
     */
    @Override
    public Car update(Car car) {
        return this.queryById(car.getCid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cid) {
        Car car = carDao.queryById(cid);
        traninfoDao.deleteById(car.getCarnum());
        return this.carDao.deleteById(cid) > 0;
    }

    @Override
    public PageInfo queryAll(Integer pageNum, Integer pageSize, Car car) {
        PageHelper.startPage(pageNum, pageSize);
        List<Car> carList = carDao.getAll(car);
        for (Car car1 : carList) {
            switch (car1.getStatus()) {
                case "0":
                    car1.setStatus("空闲中");
                    break;
                case "1":
                    car1.setStatus("运输中");
                    break;
            }
        }
        PageInfo pageInfo = new PageInfo(carList);
        return pageInfo;
    }

    @Override
    public List<Car> All() {
        Car car = new Car();
        List<Car> carList = carDao.getAll(car);
        return carList;
    }
}
