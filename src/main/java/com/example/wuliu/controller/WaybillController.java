package com.example.wuliu.controller;

import com.example.wuliu.entity.Waybill;
import com.example.wuliu.service.WaybillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Waybill)表控制层
 *
 * @author makejava
 * @since 2022-02-23 16:35:46
 */
@RestController
@RequestMapping("waybill")
public class WaybillController {
    /**
     * 服务对象
     */
    @Autowired
    private WaybillService waybillService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Waybill> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.waybillService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param waybill 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Waybill> add(Waybill waybill) {
        return ResponseEntity.ok(this.waybillService.insert(waybill));
    }

    /**
     * 编辑数据
     *
     * @param waybill 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Waybill> edit(Waybill waybill) {
        return ResponseEntity.ok(this.waybillService.update(waybill));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.waybillService.deleteById(id));
    }

}
