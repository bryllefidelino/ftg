package com.dxc.ftg.model;

import jakarta.persistence.*;

@Entity
@Table(name = "couriers")
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Courier_ID;
    @Column(name="Courier_Fname")
    private String Courier_Fname;
    @Column(name="Courier_Lname")
    private String Courier_Lname;
    @Column(name="Courier_Email")
    private String Courier_Email;
    @Column(name="Courier_password")
    private String Courier_password;
    @Column(name="Courier_Number")
    private String Courier_Number;
    @Column(name="Courier_Vehicle")
    private String Courier_Vehicle;

    public int getId(){
        return Courier_ID;
    }

    public void setId(int Courier_ID){
        this.Courier_ID = Courier_ID;
    }

    public String getCourier_Fname(){
        return Courier_Fname;
    }

    public void setCourier_Fname(String Courier_Fname){
        this.Courier_Fname = Courier_Fname;
    }

    public String getCourier_Lname(){
        return Courier_Lname;
    }

    public void setCourier_Lname(String Courier_Lname){
        this.Courier_Lname = Courier_Lname;
    }

    public String getCourier_Email(){
        return Courier_Email;
    }

    public void setCourier_Email(String Courier_Email){
        this.Courier_Email = Courier_Email;
    }

    public String getCourier_password(){
        return Courier_password;
    }

    public void setCourier_password(String Courier_password){
        this.Courier_password = Courier_password;
    }

    public String getCourier_Number(){
        return Courier_Number;
    }

    public void setCourier_Number(String Courier_Number){
        this.Courier_Number = Courier_Number;
    }

    public String getCourier_Vehicle(){
        return Courier_Vehicle;
    }

    public void setCourier_Vehicle(String Courier_Vehicle){
        this.Courier_Vehicle = Courier_Vehicle;
    }

}

