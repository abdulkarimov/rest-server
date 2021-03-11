package com.itstep.restserver.controller;
import com.itstep.restserver.entity.DbCar;
import com.itstep.restserver.model.Car;
import com.itstep.restserver.service.CarService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("api")

public class CarController {
    @Autowired
    private CarService service;

    @GetMapping("/getAllCar")
    public List<DbCar> getCars() {
        return service.getAllCar();
    }

    @GetMapping("/car/{id}")
    @SneakyThrows
    public Car getCarbById(@PathVariable Integer id) {
        var car = new Car();
        DbCar dbCar = service.getCar(id);
        car.setId(dbCar.getId());
        car.setModel(dbCar.getModel());
        car.setMaxSpeed(dbCar.getMaxSpeed());

        return car;
    }
    @PutMapping("/addCar")
    public void saveCar(@RequestBody DbCar car)
    {
        service.saveCar(car);
    }
    @DeleteMapping("/car/{id}")
    public void deleteCarById(@PathVariable Integer id)
    {
             service.deleteCarByID(id);
    }



}
