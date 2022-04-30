package com.example.wuliu.controller;

import com.example.wuliu.entity.Traninfo;
import com.example.wuliu.service.TraninfoService;
import com.example.wuliu.util.R;
import com.example.wuliu.vo.traninfoVO;
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
    @GetMapping("/findAll")
    public R fandAll(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                     @RequestParam(value = "pageSize") Integer pageSize, Traninfo traninfo) {
        return R.ok().setData(this.traninfoService.queryAll(pageNum, pageSize, traninfo));
    }

    /**
     * 新增数据
     *
     * @param traninfo 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public R add(@RequestBody Traninfo traninfo) {
        return R.ok().setData(this.traninfoService.insert(traninfo));
    }

    /**
     * 编辑数据
     *
     * @param tntnumber,carnum
     * @return 编辑结果
     */
    @PutMapping("/success")
    public R edit(@RequestBody traninfoVO traninfoVo) {
        return R.ok().setData(this.traninfoService.update(traninfoVo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{tntnumber}")
    public ResponseEntity<Boolean> deleteById(@PathVariable String tntnumber) {
        return ResponseEntity.ok(this.traninfoService.deleteById(tntnumber));
    }

}

