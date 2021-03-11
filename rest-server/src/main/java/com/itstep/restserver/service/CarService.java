package com.itstep.restserver.service;

import com.itstep.restserver.entity.DbCar;

import java.util.Collection;
import java.util.List;
public interface CarService {
         DbCar getCar(Integer id);

        Collection<DbCar> getAllCarByModel (String model);

            List<DbCar> getAllCar();

    void saveCar(DbCar car);

    void deleteCarByID(Integer id);

}
