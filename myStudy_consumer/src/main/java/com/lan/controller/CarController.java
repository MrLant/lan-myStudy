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

    /**
     * 获取汽车信息
     * @return
     */
    @GetMapping("/carList")
    public CommonResult carList() {
        List<Car> carList = carService.getCarList();
        if (carList != null && carList.size() > 0) {
            return CommonResult.build(200, "查询车辆信息成功!!!", carList);
        } else {
            return CommonResult.build(400, "暂无数据或查询车辆信息失败!!!");
        }
    }

    /**
     * 添加汽车信息
     * @param car_no
     * @param name
     * @return
     */
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

    /**
     * 删除汽车信息
     * @param car_no
     * @return
     */
    @GetMapping("/delCar/{car_no}")
    public CommonResult delCar(@PathVariable String car_no) {
        boolean flag = carService.delCar(car_no);
        if (flag) {
            return CommonResult.build(200, "车辆信息删除成功!!!");
        } else {
            return CommonResult.build(400, "车辆信息删除失败!!!");
        }
    }
}
