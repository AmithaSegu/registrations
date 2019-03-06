package com.liftoff.registrations.controllers;

import com.liftoff.registrations.models.Register;
import com.liftoff.registrations.models.data.CourseDao;
import com.liftoff.registrations.models.data.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayregisterform(Model model) {
        model.addAttribute("title", "Register");
        model.addAttribute(new Register());
        return "register/index";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
        public String processregisterform (@ModelAttribute @Valid Register register, Errors errors, Model model){
            if (errors.hasErrors()) {
                return "register/index";
            }
            registerDao.save(register);
            model.addAttribute("title", "Welcome");
            return "register/welcome";
        }
    }
