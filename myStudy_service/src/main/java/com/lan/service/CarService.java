package com.lan.service;

import com.lan.pojo.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarList();

    boolean addCar(Car carInfo);
}
