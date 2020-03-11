package com.dk.service;

import com.dk.pojo.CarType;

import java.util.List;

/**
 * @ProjectName: springboot_user_demo
 * @Package: com.dk.service
 * @ClassName: CarTypeService
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/3/4 9:36
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/3/4 9:36
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface CarTypeService {
    List<CarType> getCarType();

    void addCarType(CarType carType);

    CarType getCarTypeByTid(Integer tid);

    void updateCarType(CarType carType);

    void deleteCarType(Integer tid);
}
