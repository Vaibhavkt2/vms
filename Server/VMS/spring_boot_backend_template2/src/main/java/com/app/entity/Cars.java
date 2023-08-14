package com.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name= "Cars")
	public class Cars extends BaseEntity {
	    private String brand;
	    private String model;
	    private int year;
	    private double price;
	    private double mileage;
	    private String fuelType;
	    private String transmissionType;
	    private String description;
	    private String imageUrl;

	  //  @Autowired
		@OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	    private List<Car_Bookings> bookings;

	    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	    private List<Fianance> finances;

	    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	    private List<Insurance> insurances;

	    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	    private List<Car_Services> services;

	    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
	    private Car_Specs specifications;

	    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	    private List<Test_Drive> testDrives;

	    // Constructors, getters, setters, and other methods
	    
	    
	    
	}
	

