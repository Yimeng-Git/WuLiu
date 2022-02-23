package com.example.wuliu.controller;

import com.example.wuliu.entity.Procalamation;
import com.example.wuliu.service.ProcalamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Procalamation)表控制层
 *
 * @author makejava
 * @since 2022-02-23 16:24:24
 */
@RestController
@RequestMapping("procalamation")
public class ProcalamationController {
    /**
     * 服务对象
     */
    @Autowired
    private ProcalamationService procalamationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Procalamation> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.procalamationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param procalamation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Procalamation> add(Procalamation procalamation) {
        return ResponseEntity.ok(this.procalamationService.insert(procalamation));
    }

    /**
     * 编辑数据
     *
     * @param procalamation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Procalamation> edit(Procalamation procalamation) {
        return ResponseEntity.ok(this.procalamationService.update(procalamation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.procalamationService.deleteById(id));
    }

}
