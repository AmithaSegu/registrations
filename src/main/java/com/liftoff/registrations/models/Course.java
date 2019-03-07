package com.liftoff.registrations.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
//    @Size(min=1, max=25, message = "Please enter a valid course name")
    private String coursename;

    @NotNull
//    @Size(message = "Please enter a valid start date")
    private String startdate;

    @NotNull
//    @Size(message = "Please enter a valid end date")
    private String enddate;

    @NotNull
//    @Size(message = "Please enter a number of seat for this course")
    private int availability;

    @NotNull
//    @Size(min=1, max=10)
    private float price;

//    @NotNull
//    private boolean registered;

//    @ManyToMany(mappedBy = "courses")
//    private List<Register> register;

    @OneToMany
    @JoinColumn(name="course_id")
    private List<Register> register=new ArrayList<>();

    public Course(int id, String coursename, String startdate, String enddate,int availability,int price) {
        this.id = id;
        this.coursename = coursename;
        this.startdate = startdate;
        this.enddate = enddate;
        this.availability = availability;
        this.price = price;
        //this.registered = registered;
    }

    public Course() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

//    public boolean isRegistered() {
//        return registered;
//    }
//
//    public void setRegistered(boolean registered) {
//        this.registered = registered;
//    }
    public List<Register> getRegister() {
        return register;
    }

}