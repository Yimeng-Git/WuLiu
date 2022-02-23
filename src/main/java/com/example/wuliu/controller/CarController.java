package com.example.wuliu.controller;

import com.example.wuliu.entity.Car;

import com.example.wuliu.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 车辆(Car)表控制层
 *
 * @author makejava
 * @since 2022-02-23 15:58:55
 */
@RestController
@RequestMapping("car")
public class CarController {
    /**
     * 服务对象
     */
    @Autowired
    private CarService carService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Car> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.carService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param car 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Car> add(Car car) {
        return ResponseEntity.ok(this.carService.insert(car));
    }

    /**
     * 编辑数据
     *
     * @param car 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Car> edit(Car car) {
        return ResponseEntity.ok(this.carService.update(car));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.carService.deleteById(id));
    }

}

