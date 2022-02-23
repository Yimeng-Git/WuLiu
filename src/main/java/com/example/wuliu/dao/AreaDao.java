package com.example.wuliu.dao;

import com.example.wuliu.entity.Area;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Area)表数据库访问层
 *
 * @author makejava
 * @since 2022-02-23 16:53:04
 */
@Mapper
public interface AreaDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Area queryById(Integer id);

    /**
     * 新增数据
     *
     * @param area 实例对象
     * @return 影响行数
     */
    int insert(Area area);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Area> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Area> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Area> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Area> entities);

    /**
     * 修改数据
     *
     * @param area 实例对象
     * @return 影响行数
     */
    int update(Area area);

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
    List<Area> getAll();
}

