package com.liftoff.registrations.models.forms;

import com.liftoff.registrations.models.Course;
import com.liftoff.registrations.models.Register;

import javax.validation.constraints.NotNull;

public class AddRegisterCourse {
    private Iterable<Course> courses;
    private Register register;

    @NotNull
    private int registerId;

    @NotNull
    private int courseId;

    public AddRegisterCourse() {}

    public AddRegisterCourse(Iterable<Course> course, Register register) {
        this.courses= course;
        this.register = register;
    }

    public void getCourses(Iterable<Course> courses) {
        this.courses = courses;
    }


    public void setCourses(Iterable<Course> courses) {
        this.courses = courses;
    }


    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public int getRegisterId() {
        return registerId;
    }

    public void setRegisterId(int registerId) {
        this.registerId = registerId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
