package com.example.wuliu.dao;

import com.example.wuliu.entity.Procalamation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Procalamation)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-23 16:24:24
 */
@Mapper
public interface ProcalamationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Procalamation queryById(Integer id);

    /**
     * 新增数据
     *
     * @param procalamation 实例对象
     * @return 影响行数
     */
    int insert(Procalamation procalamation);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Procalamation> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Procalamation> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Procalamation> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Procalamation> entities);

    /**
     * 修改数据
     *
     * @param procalamation 实例对象
     * @return 影响行数
     */
    int update(Procalamation procalamation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 查询全部
     *
     * @param id 主键
     * @return 影响行数
     */
    List<Procalamation> getAll();
}

