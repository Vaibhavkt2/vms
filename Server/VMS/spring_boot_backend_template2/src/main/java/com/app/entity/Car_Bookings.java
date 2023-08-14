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
@Table(name= "Car_Bookings")
public class Car_Bookings extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Cars car;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    private Date bookingDate;
    private Date startDate;
    private Date endDate;

    // Constructors, getters, setters, and other methods
}
