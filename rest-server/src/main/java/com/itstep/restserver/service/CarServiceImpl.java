package com.itstep.restserver.service;

import com.itstep.restserver.entity.DbCar;
import com.itstep.restserver.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Collection;
import java.util.List;

@Service
@Transactional

public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public DbCar getCar(Integer id) throws EntityNotFoundException {
        return carRepository.getOne(id);
    }

    @Override
    public Collection<DbCar> getAllCarByModel(String model) {
        return carRepository.findAllByModel(model);
    }

    @Override
    public List<DbCar> getAllCar() {
        return carRepository.findAll();

    }

    @Override
    public void saveCar(DbCar car) {
        carRepository.save(car);

    }

    @Override
    public void deleteCarByID(Integer id) {
        carRepository.deleteById(id);
    }

}
