package com.example.wuliu.controller;

import com.example.wuliu.entity.Area;
import com.example.wuliu.service.AreaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Area)表控制层
 *
 * @author makejava
 * @since 2022-02-23 16:53:04
 */
@RestController
@RequestMapping("area")
public class AreaController {
    /**
     * 服务对象
     */
    @Resource
    private AreaService areaService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Area> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.areaService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param area 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Area> add(Area area) {
        return ResponseEntity.ok(this.areaService.insert(area));
    }

    /**
     * 编辑数据
     *
     * @param area 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Area> edit(Area area) {
        return ResponseEntity.ok(this.areaService.update(area));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.areaService.deleteById(id));
    }

}

