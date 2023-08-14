package com.app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name= "Car_Specs")
public class Car_Specs extends BaseEntity {
    @OneToOne
    @JoinColumn(name = "car_id")
    private Cars car;

    private String color;
    private String engine;
    private int horsepower;
    private String dimensions;

    // Constructors, getters, setters, and other methods
}