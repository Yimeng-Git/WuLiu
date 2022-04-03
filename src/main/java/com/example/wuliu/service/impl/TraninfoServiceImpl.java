package com.example.wuliu.service.impl;

import com.example.wuliu.entity.Traninfo;
import com.example.wuliu.dao.TraninfoDao;
import com.example.wuliu.service.TraninfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Traninfo)表服务实现类
 *
 * @author makejava
 * @since 2022-03-27 15:41:57
 */
@Service("traninfoService")
public class TraninfoServiceImpl implements TraninfoService {
    @Resource
    private TraninfoDao traninfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Traninfo queryById(Integer id) {
        return this.traninfoDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param traninfo 实例对象
     * @return 实例对象
     */
    @Override
    public Traninfo insert(Traninfo traninfo) {
        this.traninfoDao.insert(traninfo);
        return traninfo;
    }

    /**
     * 修改数据
     *
     * @param traninfo 实例对象
     * @return 实例对象
     */
    @Override
    public Traninfo update(Traninfo traninfo) {
        this.traninfoDao.update(traninfo);
        return this.queryById(traninfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.traninfoDao.deleteById(id) > 0;
    }
}
