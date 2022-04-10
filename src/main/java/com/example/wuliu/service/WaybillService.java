package com.example.wuliu.service;

import com.example.wuliu.entity.Waybill;
import com.github.pagehelper.PageInfo;

/**
 * (Waybill)表服务接口
 *
 * @author makejava
 * @since 2022-03-27 15:42:00
 */
public interface WaybillService {

    /**
     * 通过ID查询单条数据
     *
     * @param tntnumber 订单号
     * @return 实例对象
     */
    Waybill queryByNumber(String tntnumber);

    /**
     * 新增数据
     *
     * @param waybill 实例对象
     * @return 实例对象
     */
    Waybill insert(Waybill waybill);

    /**
     * 修改数据
     *
     * @param waybill 实例对象
     * @return 实例对象
     */
//    Waybill update(Waybill waybill);

    /**
     * 通过主键删除数据
     *
     * @param wid 主键
     * @return 是否成功
     */
    boolean deleteById(String tntnumber);

    PageInfo<Waybill> queryAll(Integer pageNum, Integer pageSize, Waybill waybill);

    /*
     * @Author yym
     * @Description //TODO 修改订单状态
     * @Date  2022/4/10 15:21
     * @Param [tntnumber]
     */
    boolean update(String tntnumber);
}
