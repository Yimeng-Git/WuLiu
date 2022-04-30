package com.example.wuliu.controller;

import com.example.wuliu.entity.Car;
import com.example.wuliu.service.CarService;
import com.example.wuliu.util.R;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 车辆(Car)表控制层
 *
 * @author makejava
 * @since 2022-03-27 15:41:51
 */
@RestController
@RequestMapping("/car")
public class CarController {
    /**
     * 服务对象
     */
    @Resource
    private CarService carService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Car> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.carService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param car 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public R add(@RequestBody Car car) {
        return R.ok().setData(this.carService.insert(car));
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
     * @param cid 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{cid}")
    public R deleteById(@PathVariable Integer cid) {
        return R.ok().setData(this.carService.deleteById(cid));
    }

    @GetMapping("/findAll")
    public R fandAll(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                     @RequestParam(value = "pageSize") Integer pageSize, Car car) {
        return R.ok().setData(this.carService.queryAll(pageNum, pageSize, car));
    }

    @GetMapping("/all")
    public R All() {
        return R.ok().setData(this.carService.All());
    }
}

