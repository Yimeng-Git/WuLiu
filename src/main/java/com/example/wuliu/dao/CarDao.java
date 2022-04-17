package com.example.wuliu.dao;

import com.example.wuliu.entity.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 车辆(Car)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-27 15:41:52
 */
@Mapper
public interface CarDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Car queryById(Integer cid);

    /**
     * 新增数据
     *
     * @param car 实例对象
     * @return 影响行数
     */
    int insert(Car car);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Car> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Car> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Car> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Car> entities);

    /**
     * 修改数据
     *
     * @param car 实例对象
     * @return 影响行数
     */
    int update(Car car);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 影响行数
     */
    int deleteById(Integer cid);

    /**
     * 查询全部
     *
     * @param cid 主键
     * @return 影响行数
     */
    List<Car> getAll(Car car);
}

