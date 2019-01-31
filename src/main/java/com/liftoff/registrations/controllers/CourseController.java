package com.liftoff.registrations.controllers;

import com.liftoff.registrations.models.Course;
import com.liftoff.registrations.models.data.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseDao courseDao;

    @RequestMapping(value = "")
    public String index(Model model){
        model.addAttribute("title","List Courses");
        model.addAttribute("courses", courseDao.findAll());
        return "course/index";
    }


    @RequestMapping(value="add",method= RequestMethod.GET)
    public String displayaddcourse(Model model){
        model.addAttribute("title","Add New Course");
        model.addAttribute(new Course());
        return "course/add";
    }

    @RequestMapping(value="add")
    public String processaddcourse(Model model, @ModelAttribute @Valid Course course, Errors errors){
        model.addAttribute("title","Add New Course");
        if(errors.hasErrors()){
            return "course/add";
        }
        courseDao.save(course);
        return "course/index";
    }
}
