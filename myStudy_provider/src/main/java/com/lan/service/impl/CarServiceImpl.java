package com.lan.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lan.dao.CarDao;
import com.lan.pojo.Car;
import com.lan.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final static Logger log = LoggerFactory.getLogger(CarServiceImpl.class);

    @Autowired
    CarDao carDao;

    @Override
    public List<Car> getCarList() {
        try {
            List<Car> carList = carDao.getCarList();
            return carList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addCar(Car carInfo) {
        try {
            Date ctime = new Date();
            carInfo.setCtime(ctime);
            carDao.addCar(carInfo);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delCar(String car_no) {
        try {
            carDao.delCar(car_no);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
