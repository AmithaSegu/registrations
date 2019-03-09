package com.liftoff.registrations.models.forms;

import com.liftoff.registrations.models.Course;
import com.liftoff.registrations.models.Register;

import javax.validation.constraints.NotNull;
import java.util.List;

public class AddRegisterCourse {
    private Course courses;
    private List<Register> register;

    @NotNull
    private int registerId;

    @NotNull
    private int courseId;

    public AddRegisterCourse() {}

    public AddRegisterCourse(Course courses, List<Register> register) {
        this.courses = courses;
        this.register = register;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    public List<Register> getRegister() {
        return register;
    }

    public void setRegister(List<Register> register) {
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

    public void Course(Register item){
        register.add(item);
    }
}