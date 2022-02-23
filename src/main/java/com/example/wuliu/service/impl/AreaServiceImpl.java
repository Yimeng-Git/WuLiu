package com.example.wuliu.service.impl;

import com.example.wuliu.entity.Area;
import com.example.wuliu.dao.AreaDao;
import com.example.wuliu.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Area)表服务实现类
 *
 * @author makejava
 * @since 2022-02-23 16:53:05
 */
@Service("areaService")
public class AreaServiceImpl implements AreaService {
    @Resource
    private AreaDao areaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Area queryById(Integer id) {
        return this.areaDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param area 实例对象
     * @return 实例对象
     */
    @Override
    public Area insert(Area area) {
        this.areaDao.insert(area);
        return area;
    }

    /**
     * 修改数据
     *
     * @param area 实例对象
     * @return 实例对象
     */
    @Override
    public Area update(Area area) {
        this.areaDao.update(area);
        return this.queryById(area.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.areaDao.deleteById(id) > 0;
    }
}
