package com.example.wuliu.service.impl;

import com.example.wuliu.dao.ProcalamationDao;
import com.example.wuliu.entity.Procalamation;
import com.example.wuliu.service.ProcalamationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
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
    public boolean insert(Procalamation procalamation) {
        Date date = new Date();
        procalamation.setProtime(date);
        return this.procalamationDao.insert(procalamation) > 0;
    }

    /**
     * 修改数据
     *
     * @param procalamation 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(Procalamation procalamation) {
        return this.procalamationDao.update(procalamation) > 0;
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

    /*
     * @Author yym
     * @Description //TODO 查询最新的公告
     * @Date  2022/4/16 20:05
     * @Param []
     */
    @Override
    public Procalamation newNotice() {

        return this.procalamationDao.newNotice();
    }

    /*
     * @Author yym
     * @Description //TODO 分页查所有
     * @Date  2022/4/16 20:06
     * @Param [pageNum, pageSize, procalamation]
     */
    @Override
    public PageInfo<Procalamation> getALl(Integer pageNum, Integer pageSize, Procalamation procalamation) {
        PageHelper.startPage(pageNum, pageSize);
        List<Procalamation> procalamationList = procalamationDao.getAll(procalamation);
        PageInfo<Procalamation> pageInfo = new PageInfo<>(procalamationList);
        return pageInfo;
    }

}
