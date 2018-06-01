package com.studenty.animalsforyouranimals.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.studenty.animalsforyouranimals.model.User;
import com.studenty.animalsforyouranimals.service.UserService;

@Controller
public class AdminController {

    @Autowired
    private UserService userService;


    @RequestMapping(value="admin/home", method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("userName", "Witaj " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        modelAndView.addObject("adminMessage","Strona dostępna tylko dla administratorów");
        modelAndView.setViewName("admin/home");
        return modelAndView;
    }

    @RequestMapping(value="/contact", method = RequestMethod.GET)
    public ModelAndView contact(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contact");
        return modelAndView;
    }

    @RequestMapping(value={"/admin/advertisement"}, method = RequestMethod.GET)
    public ModelAndView advertisement(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.setViewName("admin/advertisement");
        return modelAndView;
    }

    @RequestMapping(value={"/admin/AnimalAD"}, method = RequestMethod.GET)
    public ModelAndView animalAd(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.setViewName("admin/AnimalAD");
        return modelAndView;
    }

    @RequestMapping(value={"/admin/addAnimalPage"}, method = RequestMethod.GET)
    public ModelAndView addAnimapPage(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.setViewName("admin/addAnimalPage");
        return modelAndView;
    }

    @RequestMapping(value={"/admin/addAdvertisement"}, method = RequestMethod.GET)
    public void addAdvertisement(){
        System.out.print("dodano");
    }

    @RequestMapping(value={"/admin/users"}, method = RequestMethod.GET)
    public ModelAndView users(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/users");
        return modelAndView;
    }

}

