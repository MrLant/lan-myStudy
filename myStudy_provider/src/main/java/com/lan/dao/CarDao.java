package com.lan.dao;

import com.lan.pojo.Car;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarDao {
    List<Car> getCarList();

    int addCar(Car carInfo);
}
