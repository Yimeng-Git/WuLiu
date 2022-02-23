package com.example.wuliu.service.impl;

import com.example.wuliu.entity.Waybill;
import com.example.wuliu.dao.WaybillDao;
import com.example.wuliu.service.WaybillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Waybill)表服务实现类
 *
 * @author makejava
 * @since 2022-02-23 16:35:46
 */
@Service("waybillService")
public class WaybillServiceImpl implements WaybillService {
    @Autowired
    private WaybillDao waybillDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tntnumber 主键
     * @return 实例对象
     */
    @Override
    public Waybill queryById(Integer tntnumber) {
        return this.waybillDao.queryById(tntnumber);
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
        return this.queryById(waybill.getTntnumber());
    }

    /**
     * 通过主键删除数据
     *
     * @param tntnumber 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tntnumber) {
        return this.waybillDao.deleteById(tntnumber) > 0;
    }
}
