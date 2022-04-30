package com.example.wuliu.controller;

import com.example.wuliu.entity.Waybill;
import com.example.wuliu.service.WaybillService;
import com.example.wuliu.util.R;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Waybill)表控制层
 *
 * @author makejava
 * @since 2022-03-27 15:41:59
 */
@RestController
@RequestMapping("waybill")
public class WaybillController {
    /**
     * 服务对象
     */
    @Resource
    private WaybillService waybillService;

    /**
     * 通过主键查询单条数据
     *
     * @param
     * @return 单条数据
     */
    @GetMapping("/number/{tntnumber}")
    public ResponseEntity<Waybill> queryById(@PathVariable("tntnumber") String tntnumber) {
        System.out.println(tntnumber);
        return ResponseEntity.ok(this.waybillService.queryByNumber(tntnumber));
    }

    /*
     * @Author yym
     * @Description //TODO 查询所有
     * @Date  2022/4/5 18:23
     * @Param []
     */
    @GetMapping("/findAll")
    public R fandAll(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                     @RequestParam(value = "pageSize") Integer pageSize, Waybill waybill) {
        return R.ok().setData(this.waybillService.queryAll(pageNum, pageSize, waybill));
    }


    /**
     * 新增数据
     *
     * @param waybill 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public R add(@RequestBody Waybill waybill) {
        return R.ok().setData(this.waybillService.insert(waybill));
    }

    /**
     * 编辑数据
     *
     * @param tntnumber 实体
     * @return 编辑结果
     */
    @PutMapping("/success/{tntnumber}")
    public R edit(@PathVariable String tntnumber) {

        return R.ok().setData(this.waybillService.update(tntnumber));
    }

    /**
     * 删除数据
     *
     * @param tntnumber 实体
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{tntnumber}")
    public R deleteById(@PathVariable String tntnumber) {

        return R.ok().setData(this.waybillService.deleteById(tntnumber));
    }

    @GetMapping("/all")
    public R All() {
        return R.ok().setData(this.waybillService.All());
    }
}

