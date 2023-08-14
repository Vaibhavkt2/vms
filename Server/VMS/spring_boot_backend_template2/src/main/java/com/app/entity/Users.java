package com.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Table(name= "Users")
public class Users extends BaseEntity {
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private UserRoles userRoles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Car_Bookings> bookings;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Fianance> finances;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Insurance> insurances;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Test_Drive> testDrives;

    // Constructors, getters, setters, and other methods
}
