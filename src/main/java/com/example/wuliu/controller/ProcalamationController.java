package com.example.wuliu.controller;

import com.example.wuliu.entity.Procalamation;
import com.example.wuliu.service.ProcalamationService;
import com.example.wuliu.util.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Procalamation)表控制层
 *
 * @author makejava
 * @since 2022-03-27 15:41:53
 */
@RestController
@RequestMapping("/procalamation")
public class ProcalamationController {
    /**
     * 服务对象
     */
    @Resource
    private ProcalamationService procalamationService;

    /**
     * 通过主键查询单条数据
     *
     * @param pid 主键
     * @return 单条数据
     */
    @GetMapping("/edit/{pid}")
    public R queryById(@PathVariable Integer pid) {
        return R.ok().setData(this.procalamationService.queryById(pid));
    }

    /*
     * @Author yym
     * @Description //TODO 查询最新的公告
     * @Date  2022/4/4 11:03
     * @Param []
     */
    @GetMapping("/newNotice")
    public R newNotice() {
        return R.ok().setData(this.procalamationService.newNotice());
    }

    /**
     * 新增数据
     *
     * @param procalamation 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public R add(@RequestBody Procalamation procalamation) {
        return R.ok().setData(this.procalamationService.insert(procalamation));
    }

    /**
     * 编辑数据
     *
     * @param procalamation 实体
     * @return 编辑结果
     */
    @PutMapping("/update")
    public R edit(@RequestBody Procalamation procalamation) {
        return R.ok().setData(this.procalamationService.update(procalamation));
    }

    /**
     * 删除数据
     *
     * @param pid 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{pid}")
    public R deleteById(@PathVariable Integer pid) {
        return R.ok().setData(this.procalamationService.deleteById(pid));
    }

    /*
     * @Author yym
     * @Description //TODO  查询所有公告
     * @Date  2022/4/16 20:04
     * @Param [pageNum, pageSize, Procalamation]
     */
    @GetMapping("/getAll")
    public R getAll(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                    @RequestParam(value = "pageSize") Integer pageSize, Procalamation Procalamation) {
        return R.ok().setData(this.procalamationService.getALl(pageNum, pageSize, Procalamation));
    }

}

