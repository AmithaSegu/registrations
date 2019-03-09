package com.liftoff.registrations.controllers;

import com.liftoff.registrations.models.Course;
import com.liftoff.registrations.models.Register;
import com.liftoff.registrations.models.data.CourseDao;
import com.liftoff.registrations.models.data.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("register")
public class RegisterController {

    @Autowired
    private RegisterDao registerDao;

    @Autowired
    private CourseDao courseDao;

//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public String displayregisterform(Model model) {
//        model.addAttribute("title", "Register");
//        model.addAttribute(new Register());
//        return "register/index";
//    }

//    @RequestMapping(value = "{id}", method = RequestMethod.GET)
//    public String displayregisterform(Model model, @PathVariable int id) {
//        model.addAttribute("title", "Register");
//        model.addAttribute(new Register());
//        Course course=courseDao.findById(id).get();
//        model.addAttribute("course",course);
//        return "register/index";
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.POST)
//    public String processregisterform (Model model,@ModelAttribute @Valid Register newregister,@ModelAttribute Course course, Errors errors,@PathVariable int id){
//        if (errors.hasErrors()) {
//            return "register/index";
//        }
//        course=courseDao.findById(id).get();
//        newregister.setCourse(course);
//        registerDao.save(newregister);
////        AddRegisterCourse form = new AddRegisterCourse(course,newregister);
//        model.addAttribute("title", "Welcome");
//        return "register/welcome" ;
//    }

    @RequestMapping(value = "add/{id}", method = RequestMethod.GET)
    public String displayregisterform(Model model,@PathVariable int id) {
        model.addAttribute("title", "Register");
        model.addAttribute(new Register());
        model.addAttribute("course", courseDao.findAll());
        Course course=courseDao.findById(id).get();
        model.addAttribute("course",course);
        return "register/index";
    }
//    @RequestMapping(value = "add", method = RequestMethod.POST)
//    public String processregisterform (@ModelAttribute @Valid Register newRegister, Errors errors, @RequestParam int CourseId, Model model){
//        if (errors.hasErrors()) {
//            return "register/index";
//        }
//        Course course=courseDao.findById(CourseId).get();
//        newRegister.setCourse(course);
//        registerDao.save(newRegister);
//        model.addAttribute("title", "Welcome");
//        return "register/welcome" ;
//    }
    @RequestMapping(value = "add/{id}", method = RequestMethod.POST)
    public String processregisterform (@ModelAttribute @Valid Register newRegister, Errors errors,  Model model,@PathVariable int id){
        if (errors.hasErrors()) {
//            model.addAttribute("courses", courseDao.findAll());
            return "register/index";
        }
//        Course selectedCourse=courseDao.findById(id).get();
        newRegister.setCourse(courseDao.findById(id).get());
        registerDao.save(newRegister);
        model.addAttribute("title", "Welcome");
        return "register/welcome" ;
    }


}

