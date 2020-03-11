package com.dk.service.impl;

import com.dk.mapper.CarTypeMapper;
import com.dk.pojo.CarType;
import com.dk.pojo.CarTypeExample;
import com.dk.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: springboot_user_demo
 * @Package: com.dk.service.impl
 * @ClassName: CarTypeServiceImpl
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/3/4 9:37
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/3/4 9:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class CarTypeServiceImpl implements CarTypeService {
    @Autowired
    private CarTypeMapper carTypeMapper;

    @Override
    public List<CarType> getCarType() {
        return carTypeMapper.selectByExample(new CarTypeExample());
    }

    @Override
    public void addCarType(CarType carType) {
        carTypeMapper.insertSelective(carType);
    }

    @Override
    public CarType getCarTypeByTid(Integer tid) {
        return carTypeMapper.selectByPrimaryKey(tid);
    }

    @Override
    public void updateCarType(CarType carType) {
        carTypeMapper.updateByPrimaryKeySelective(carType);
    }

    @Override
    public void deleteCarType(Integer tid) {
        carTypeMapper.deleteByPrimaryKey(tid);
    }
}
