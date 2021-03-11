package com.itstep.restserver.repository;

import com.itstep.restserver.entity.DbCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CarRepository extends JpaRepository<DbCar, Integer> {
        Collection<DbCar> findAllByModel(String model);
}
