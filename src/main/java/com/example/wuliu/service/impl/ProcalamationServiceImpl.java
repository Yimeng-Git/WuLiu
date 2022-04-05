package com.example.wuliu.service.impl;

import com.example.wuliu.dao.ProcalamationDao;
import com.example.wuliu.entity.Procalamation;
import com.example.wuliu.service.ProcalamationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Procalamation)表服务实现类
 *
 * @author makejava
 * @since 2022-03-27 15:41:55
 */
@Service("procalamationService")
public class ProcalamationServiceImpl implements ProcalamationService {
    @Resource
    private ProcalamationDao procalamationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    @Override
    public Procalamation queryById(Integer pid) {
        return this.procalamationDao.queryById(pid);
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
        return this.queryById(procalamation.getPid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pid) {
        return this.procalamationDao.deleteById(pid) > 0;
    }

    @Override
    public Procalamation newNotice() {

        return this.procalamationDao.newNotice();
    }

    @Override
    public List<Procalamation> getALl() {
        return this.procalamationDao.getAll();
    }

}
