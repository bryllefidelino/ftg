package com.dxc.ftg.model;

import jakarta.persistence.*;

@Entity
@Table(name = "couriers")
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Courier_ID;

    @Column(name = "Courier_Fname")
    private String Courier_Fname;

    @Column(name = "Courier_Lname")
    private String Courier_Lname;

    @Column(name = "Courier_Email")
    private String Courier_Email;

    @Column(name = "Courier_password")
    private String Courier_password;

    @Column(name = "Courier_Number")
    private String Courier_Number;

    @Column(name = "Courier_Vehicle")
    private String Courier_Vehicle;

    public Courier() {
        // Default constructor
    }

    public Courier(String fname, String lname, String email, String password, String number, String vehicle) {
        this.Courier_Fname = fname;
        this.Courier_Lname = lname;
        this.Courier_Email = email;
        this.Courier_password = password;
        this.Courier_Number = number;
        this.Courier_Vehicle = vehicle;
    }

    // Getters and Setters

    public int getCourier_ID() {
        return Courier_ID;
    }

    public void setCourier_ID(int courier_ID) {
        this.Courier_ID = courier_ID;
    }

    public String getCourier_Fname() {
        return Courier_Fname;
    }

    public void setCourier_Fname(String courier_Fname) {
        this.Courier_Fname = courier_Fname;
    }

    public String getCourier_Lname() {
        return Courier_Lname;
    }

    public void setCourier_Lname(String courier_Lname) {
        this.Courier_Lname = courier_Lname;
    }

    public String getCourier_Email() {
        return Courier_Email;
    }

    public void setCourier_Email(String courier_Email) {
        this.Courier_Email = courier_Email;
    }

    public String getCourier_password() {
        return Courier_password;
    }

    public void setCourier_password(String courier_password) {
        this.Courier_password = courier_password;
    }

    public String getCourier_Number() {
        return Courier_Number;
    }

    public void setCourier_Number(String courier_Number) {
        this.Courier_Number = courier_Number;
    }

    public String getCourier_Vehicle() {
        return Courier_Vehicle;
    }

    public void setCourier_Vehicle(String courier_Vehicle) {
        this.Courier_Vehicle = courier_Vehicle;
    }
}