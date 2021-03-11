package com.itstep.restserver.entity;

import lombok.*;

import javax.persistence.*;

@Data
//@AllArgsConstructor lombok конструктор с параметром

@Entity
@Table(name = "cars")
public class DbCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String model;

    @Column(name = "max_speed")
    private Integer maxSpeed;


}
