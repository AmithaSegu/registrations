package com.liftoff.registrations.controllers;


import com.liftoff.registrations.models.Course;
import com.liftoff.registrations.models.Register;
import com.liftoff.registrations.models.data.CourseDao;
import com.liftoff.registrations.models.data.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("report")
public class ReportController {

    @Autowired
    private RegisterDao registerDao;

    @Autowired
    private CourseDao courseDao;

    @RequestMapping(value="",method=RequestMethod.GET)
    public String listreport(Model model, Course course){
        model.addAttribute("title","Report");
        courseDao.findAll();
        model.addAttribute("courses",courseDao.findAll());
        return "report/main";
    }


    @RequestMapping(value="all",method= RequestMethod.GET)
    public String allregister(Model model, Course course, Register register){
        model.addAttribute("title","All Registered");
        model.addAttribute("register",registerDao.findAll());
        return "report/listregister";
    }

    @RequestMapping(value="bycourse/{id}" ,method=RequestMethod.GET)
    public String bycourse(Model model, @PathVariable int id, Register register){
        Course course=courseDao.findById(id).get();
        model.addAttribute("course",courseDao.findById(id).get());
        model.addAttribute("register",course.getRegister());
        return "report/listbycourse";
    }
}

