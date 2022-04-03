package com.example.wuliu.controller;

import com.example.wuliu.entity.Traninfo;
import com.example.wuliu.service.TraninfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Traninfo)表控制层
 *
 * @author makejava
 * @since 2022-03-27 15:41:55
 */
@RestController
@RequestMapping("traninfo")
public class TraninfoController {
    /**
     * 服务对象
     */
    @Resource
    private TraninfoService traninfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Traninfo> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.traninfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param traninfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Traninfo> add(Traninfo traninfo) {
        return ResponseEntity.ok(this.traninfoService.insert(traninfo));
    }

    /**
     * 编辑数据
     *
     * @param traninfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Traninfo> edit(Traninfo traninfo) {
        return ResponseEntity.ok(this.traninfoService.update(traninfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.traninfoService.deleteById(id));
    }

}

