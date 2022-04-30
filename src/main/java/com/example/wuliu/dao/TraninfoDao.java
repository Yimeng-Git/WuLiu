package com.example.wuliu.dao;

import com.example.wuliu.entity.Traninfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * (Traninfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-27 15:41:55
 */
@Mapper
public interface TraninfoDao {

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
     * @return 影响行数
     */
    int insert(Traninfo traninfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Traninfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Traninfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Traninfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Traninfo> entities);

    /**
     * 修改数据
     *
     * @param traninfo 实例对象
     * @return 影响行数
     */
    int update(String tntnumber);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String tntnumber);

    /**
     * 查询全部
     *
     * @param id 主键
     * @return 影响行数
     */
    List<Traninfo> getAll();

    List<Traninfo> queryAll(Traninfo traninfo);

    int go(ArrayList list);

    List<Traninfo> getWay(String carnum);

}

