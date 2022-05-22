package com.example.wuliu.service.impl;

import com.example.wuliu.dao.CarDao;
import com.example.wuliu.dao.TraninfoDao;
import com.example.wuliu.dao.WaybillDao;
import com.example.wuliu.entity.Car;
import com.example.wuliu.entity.Traninfo;
import com.example.wuliu.entity.Waybill;
import com.example.wuliu.service.TraninfoService;
import com.example.wuliu.vo.traninfoVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @Resource
    private WaybillDao waybillDao;
    @Resource
    private CarDao carDao;

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
    public boolean insert(Traninfo traninfo) {
        Waybill waybill = waybillDao.queryByNumber(traninfo.getTntnumber());
        Car car = new Car();
        car.setCarnum(traninfo.getCarnum());
        car.setDestination(waybill.getRecaddress());
        carDao.go(car);
        traninfo.setStartTime(new Date());
        traninfo.setStatus("0");
        return this.traninfoDao.insert(traninfo) > 0;
    }

    /**
     * 修改数据
     *
     * @param traninfoVo 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(traninfoVO traninfoVo) {
        carDao.update(traninfoVo.getCarnum());
        List<Traninfo> list = traninfoDao.getWay(traninfoVo.getCarnum());
        ArrayList<String> strings = new ArrayList<>();
        for (Traninfo waybill : list) {
            strings.add(waybill.getTntnumber());
        }
        int i = this.waybillDao.arrive(strings);
        if (i > 0) {
            this.traninfoDao.go(strings);
        }
        return i > 0;
    }

    /**
     * 通过主键删除数据
     *
     * @param tntnumber 订单号
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String tntnumber) {
        return this.traninfoDao.deleteById(tntnumber) > 0;
    }

    @Override
    public PageInfo<Traninfo> queryAll(Integer pageNum, Integer pageSize, Traninfo traninfo) {
        PageHelper.startPage(pageNum, pageSize);
        List<Traninfo> traninfoList = traninfoDao.queryAll(traninfo);
        PageInfo<Traninfo> pageInfo = new PageInfo<Traninfo>(traninfoList);
        System.out.println(pageInfo);
        return pageInfo;
    }
}
