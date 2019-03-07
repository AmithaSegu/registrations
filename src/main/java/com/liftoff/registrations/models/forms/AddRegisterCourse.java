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

    public AddRegisterCourse(Iterable<Course> courses, Register register) {
        this.courses = courses;
        this.register = register;
    }

    public Iterable<Course> getCourses() {
        return courses;
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
