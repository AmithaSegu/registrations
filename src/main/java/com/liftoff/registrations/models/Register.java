package com.liftoff.registrations.models;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class Register {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, max = 50, message = "Enter name")
    private String name;

    @NotNull
    private String address;

    @NotNull
    private String city;

    @NotNull
    private String state;

    @NotNull
    private int zipcode;

    @NotNull
    private String dob;

    @NotNull
    private int cardnumber;

//    @OneToOne
//    private List<Course> course;
    @OneToMany
    @JoinColumn(name="course_id")
    private List<Course> course=new ArrayList<>();


    public Register(int id, String name, String address, String city,String state,int zipcode, String dob, int cardnumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.zipcode = zipcode;
        this.dob = dob;
        this.cardnumber = cardnumber;
        this.state=state;
    }

    public Register() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState(){return state;}

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public List<Course> getCourse() {
        return course;
    }


}

