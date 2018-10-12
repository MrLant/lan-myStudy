package com.lan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lan.pojo.Car;
import com.lan.service.CarService;
import com.lan.utils.CommonResult;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class CarController {
    @Reference
    CarService carService;

    @GetMapping("/carList")
    public CommonResult carList() {
        List<Car> carList = carService.getCarList();
        if (carList != null && carList.size() > 0) {
            return CommonResult.build(200, "查询车辆信息成功!!!", carList);
        } else {
            return CommonResult.build(400, "查询车辆信息失败!!!");
        }
    }

    @PostMapping("/addCar")
    public CommonResult addCar(@RequestParam String car_no, @RequestParam String name) {
        Car carInfo = new Car();
        carInfo.setCar_no(car_no);
        carInfo.setName(name);
        boolean flag = carService.addCar(carInfo);
        if (flag) {
            return CommonResult.build(200, "车辆信息添加成功!!!");
        } else {
            return CommonResult.build(400, "车辆信息添加失败!!!");
        }
    }


}
