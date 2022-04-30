package com.example.wuliu.service;

import com.example.wuliu.entity.User;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2022-03-27 15:41:58
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    boolean insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    boolean update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /*
     * @Author yym
     * @Description //TODO 登录
     * @Date  2022/3/27 16:29
     * @Param [username, password]
     */
    String adminLogin(String username, String password);

}
