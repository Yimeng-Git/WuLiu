package com.example.wuliu.service.impl;

import com.example.wuliu.dao.WaybillDao;
import com.example.wuliu.entity.Waybill;
import com.example.wuliu.service.WaybillService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
     * @param tntnumber 订单号
     * @return 实例对象
     */
    @Override
    public Waybill queryByNumber(String tntnumber) {
        return this.waybillDao.queryByNumber(tntnumber);
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
//    @Override
//    public Waybill update(Waybill waybill) {
//        this.waybillDao.update(waybill);
//        return this.queryById(waybill.getWid());
//    }

    /**
     * 通过主键删除数据
     *
     * @param tntnumber 订单号
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String tntnumber) {
        return this.waybillDao.deleteById(tntnumber) > 0;
    }

    @Override
    public PageInfo<Waybill> queryAll(Integer pageNum, Integer pageSize, Waybill waybill) {
        PageHelper.startPage(pageNum, pageSize);
        List<Waybill> waybillList = waybillDao.queryAll(waybill);
        PageInfo<Waybill> pageInfo = new PageInfo<Waybill>(waybillList);
        System.out.println(pageInfo);
        return pageInfo;
    }

    /*
     * @Author yym
     * @Description //TODO 修改订单状态
     * @Date  2022/4/10 15:23
     * @Param [tntnumber]
     */
    @Override
    public boolean update(String tntnumber) {
        System.out.println(tntnumber);
        return waybillDao.update(tntnumber) > 0;
    }
}
