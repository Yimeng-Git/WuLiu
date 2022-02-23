package com.example.wuliu.dao;

import com.example.wuliu.entity.Waybill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Waybill)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-23 16:35:46
 */
@Mapper
public interface WaybillDao {

    /**
     * 通过ID查询单条数据
     *
     * @param tntnumber 主键
     * @return 实例对象
     */
    Waybill queryById(Integer tntnumber);

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
     * @param waybill 实例对象
     * @return 影响行数
     */
    int update(Waybill waybill);

    /**
     * 通过主键删除数据
     *
     * @param tntnumber 主键
     * @return 影响行数
     */
    int deleteById(Integer tntnumber);

    /**
     * 查询全部
     *
     * @param tntnumber 主键
     * @return 影响行数
     */
    List<Waybill> getAll();
}

