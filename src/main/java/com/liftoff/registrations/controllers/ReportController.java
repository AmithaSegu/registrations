package com.liftoff.registrations.controllers;

import com.liftoff.registrations.models.Course;
import com.liftoff.registrations.models.Register;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("report")
public class ReportController {
    @RequestMapping(value="",method=RequestMethod.POST)
    public String listreport(Model model){
        model.addAttribute("title","Report");
        Course course=courseDao.findAll();
        model.addAttribute("course",course);
        return "report/main";
    }


    @RequestMapping(value="all",method= RequestMethod.POST)
    public String allregister(Model model){
        model.addAttribute("title","All Registered");
        Register newRegister=registerDao.findAll();
        model.addAttribute("allcourseregister",newRegister);
        return "report/listregister";
    }

    @RequestMapping(value="bycourse/{id}" method=RequestMethod.POST)
    public String bycourse(Model model, @PathVariable int id){
        Course course=courseDao.findById(id).get();
        Register register=registerDao.findAllBy(course).get();
        model.addAttribute("regbycourse",register);
        return "report/listregister";
    }
}
