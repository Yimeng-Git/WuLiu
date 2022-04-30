package com.example.wuliu.service.impl;

import com.example.wuliu.dao.UserDao;
import com.example.wuliu.entity.User;
import com.example.wuliu.service.UserService;
import com.example.wuliu.util.JwtUtils;
import com.example.wuliu.util.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-03-27 15:41:58
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(User user) {
        return this.userDao.insert(user) > 0;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(User user) {

        return this.userDao.update(user) > 0;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userDao.deleteById(id) > 0;
    }

    /*
     * @Author yym
     * @Description //TODO 登录
     * @Date  2022/3/27 16:29
     * @Param [username, password]
     */
    @Override
    public String adminLogin(String username, String password) {
        try {
            User user = new User();
            if (StringUtil.isNotEmpty(username) && StringUtil.isNotEmpty(password)) {
                user.setUsername(username);
                user.setPassword(password);
            }
            //2.查询结果为空，则直接返回null
            User user1 = userDao.selectOne(user);
            if (user1 == null) {
                return null;
            }
            //数据库匹配，查询该id
            int id = user1.getId();
            //查询成功，则生成token
            String token = JwtUtils.Sign(username, String.valueOf(id));
            return token;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
