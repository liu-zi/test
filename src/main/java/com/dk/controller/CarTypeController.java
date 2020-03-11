package com.dk.controller;

import com.alibaba.fastjson.JSONObject;
import com.dk.pojo.CarType;
import com.dk.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: springboot_user_demo
 * @Package: com.dk.controller
 * @ClassName: CarTypeController
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/3/4 9:33
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/3/4 9:33
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@RequestMapping("carType")
public class CarTypeController {
    @Autowired
    private CarTypeService carTypeService;

    @RequestMapping("toList")
    public String toCarType() {
        return "car/list";
    }

    @RequestMapping("getCarType")
    @ResponseBody
    public List<CarType> getCarType() {
        List<CarType> carTypeList = carTypeService.getCarType();
        System.out.println(JSONObject.toJSONString(carTypeList));
        return carTypeList;
    }

    @RequestMapping("addPage")
    public String addPage() {
        return "car/add";
    }

    @RequestMapping("addCarType")
    @ResponseBody
    public boolean addCarType(CarType carType) {
        carTypeService.addCarType(carType);
        return true;
    }

    @RequestMapping("updatePage")
    @Transactional
    public String updatePage(Integer tid, Model model) {
        CarType carType = carTypeService.getCarTypeByTid(tid);
        model.addAttribute("carType", carType);
        return "car/update";
    }

    @RequestMapping("updateCarType")
    @ResponseBody
    public boolean updateCarType(CarType carType) {
        carTypeService.updateCarType(carType);
        return true;
    }

    @RequestMapping("deleteCarType")
    @ResponseBody
    public boolean deleteCarType(Integer tid) {
        carTypeService.deleteCarType(tid);
        return true;
    }
}
