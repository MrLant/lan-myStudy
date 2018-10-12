package com.lan.dao;

import com.lan.pojo.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarDao {
    List<Car> getCarList();

    int addCar(Car carInfo);

    void delCar(@Param("car_no") String car_no);
}
