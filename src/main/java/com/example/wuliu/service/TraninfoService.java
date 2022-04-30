package com.example.wuliu.service;

import com.example.wuliu.entity.Traninfo;
import com.example.wuliu.vo.traninfoVO;
import com.github.pagehelper.PageInfo;

/**
 * (Traninfo)表服务接口
 *
 * @author makejava
 * @since 2022-03-27 15:41:56
 */
public interface TraninfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Traninfo queryById(Integer id);

    /**
     * 新增数据
     *
     * @param traninfo 实例对象
     * @return 实例对象
     */
    boolean insert(Traninfo traninfo);

    /**
     * 修改数据
     *
     * @param traninfoVo 实例对象
     * @return 实例对象
     */
    boolean update(traninfoVO traninfoVo);

    /**
     * 通过主键删除数据
     *
     * @param tntnumber 订单号
     * @return 是否成功
     */
    boolean deleteById(String tntnumber);

    PageInfo<Traninfo> queryAll(Integer pageNum, Integer pageSize, Traninfo traninfo);
}
