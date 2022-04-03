package com.example.wuliu.service.impl;

import com.example.wuliu.entity.Waybill;
import com.example.wuliu.dao.WaybillDao;
import com.example.wuliu.service.WaybillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Waybill)表服务实现类
 *
 * @author makejava
 * @since 2022-03-27 15:42:00
 */
@Service("waybillService")
public class WaybillServiceImpl implements WaybillService {
    @Resource
    private WaybillDao waybillDao;

    /**
     * 通过ID查询单条数据
     *
     * @param wid 主键
     * @return 实例对象
     */
    @Override
    public Waybill queryById(Integer wid) {
        return this.waybillDao.queryById(wid);
    }

    /**
     * 新增数据
     *
     * @param waybill 实例对象
     * @return 实例对象
     */
    @Override
    public Waybill insert(Waybill waybill) {
        this.waybillDao.insert(waybill);
        return waybill;
    }

    /**
     * 修改数据
     *
     * @param waybill 实例对象
     * @return 实例对象
     */
    @Override
    public Waybill update(Waybill waybill) {
        this.waybillDao.update(waybill);
        return this.queryById(waybill.getWid());
    }

    /**
     * 通过主键删除数据
     *
     * @param wid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer wid) {
        return this.waybillDao.deleteById(wid) > 0;
    }
}
