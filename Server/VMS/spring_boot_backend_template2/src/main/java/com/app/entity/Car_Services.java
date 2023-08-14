package com.app.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name= "Car_Services")
public class Car_Services extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Cars car;

    private Date serviceDate;
    private String description;

    // Constructors, getters, setters, and other methods
}
