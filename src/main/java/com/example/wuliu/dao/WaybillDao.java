package com.example.wuliu.dao;

import com.example.wuliu.entity.Waybill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * (Waybill)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-27 15:41:59
 */
@Mapper
public interface WaybillDao {

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
     * @return 影响行数
     */
    int insert(Waybill waybill);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Waybill> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Waybill> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Waybill> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Waybill> entities);

    /**
     * 修改数据
     *
     * @param waybill 实例
     * @return 影响行数
     */
    int arrive(ArrayList list);

    int update(String tntnumber);

    /**
     * 通过主键删除数据
     *
     * @param wid 主键
     * @return 影响行数
     */
    int deleteById(String tntnumber);

    /**
     * 查询全部
     *
     * @param wid 主键
     * @return 影响行数
     */
    List<Waybill> getAll();

    /*
     * @Author yym
     * @Description //TODO 查询所有订单
     * @Date  2022/4/30 15:44
     * @Param [waybill]
     */
    List<Waybill> queryAll(Waybill waybill);
}

