package com.example.wuliu.service.impl;
import com.example.wuliu.dao.ProcalamationDao;
import com.example.wuliu.entity.Procalamation;
import com.example.wuliu.service.ProcalamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Procalamation)表服务实现类
 *
 * @author makejava
 * @since 2022-02-23 16:24:24
 */
@Service("procalamationService")
public class ProcalamationServiceImpl implements ProcalamationService {
    @Autowired
    private ProcalamationDao procalamationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Procalamation queryById(Integer id) {
        return this.procalamationDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param procalamation 实例对象
     * @return 实例对象
     */
    @Override
    public Procalamation insert(Procalamation procalamation) {
        this.procalamationDao.insert(procalamation);
        return procalamation;
    }

    /**
     * 修改数据
     *
     * @param procalamation 实例对象
     * @return 实例对象
     */
    @Override
    public Procalamation update(Procalamation procalamation) {
        this.procalamationDao.update(procalamation);
        return this.queryById(procalamation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.procalamationDao.deleteById(id) > 0;
    }
}
