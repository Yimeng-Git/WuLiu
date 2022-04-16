package com.example.wuliu.service;

import com.example.wuliu.entity.Procalamation;
import com.github.pagehelper.PageInfo;

/**
 * (Procalamation)表服务接口
 *
 * @author makejava
 * @since 2022-03-27 15:41:55
 */
public interface ProcalamationService {

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    Procalamation queryById(Integer pid);

    /**
     * 新增数据
     *
     * @param procalamation 实例对象
     * @return 实例对象
     */
    boolean insert(Procalamation procalamation);

    /**
     * 修改数据
     *
     * @param procalamation 实例对象
     * @return 实例对象
     */
    boolean update(Procalamation procalamation);

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pid);

    /*
     * @Author yym
     * @Description //TODO 查询最新的公告
     * @Date  2022/4/16 20:05
     * @Param []
     */
    Procalamation newNotice();

    /*
     * @Author yym
     * @Description //TODO 分页查所有
     * @Date  2022/4/16 20:06
     * @Param [pageNum, pageSize, procalamation]
     */
    PageInfo<Procalamation> getALl(Integer pageNum, Integer pageSize, Procalamation procalamation);
}
