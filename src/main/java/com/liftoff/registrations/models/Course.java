package com.liftoff.registrations.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, max=25, message = "Please enter a valid course name")
    private String coursename;

    @NotNull
    @Size(message = "Please enter a valid start date")
    private Date startdate;

    @NotNull
    @Size(message = "Please enter a valid end date")
    private Date enddate;

    @NotNull
    //@Size(message = "Please enter a number of seat for this course")
    private int availability;

    @NotNull
    @Size(min=1, max=10)
    private float price;

    @NotNull
    private boolean register;

    public Course(int id, String coursename, Date startdate, Date enddate,int availability, boolean register) {
        this.id = id;
        this.coursename = coursename;
        this.startdate = startdate;
        this.enddate = enddate;
        this.availability = availability;
        this.price = price;
        this.register = register;
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

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
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

    public boolean isRegister() {
        return register;
    }

    public void setRegister(boolean register) {
        this.register = register;
    }
}
