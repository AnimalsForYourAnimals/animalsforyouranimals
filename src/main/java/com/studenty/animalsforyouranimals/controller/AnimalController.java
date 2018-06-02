package com.studenty.animalsforyouranimals.controller;

import com.studenty.animalsforyouranimals.model.Animal;
import com.studenty.animalsforyouranimals.service.HibernateSearchService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Sławomir Wójcik on 2018-05-31.
 */
@Controller
public class AnimalController {
    //@Autowired
   // private HibernateSearchService searchservice;

    //@Autowired
    //private Animal animal;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String search(@RequestParam(value = "search", required = false) String q, Model model) {
        List<Animal> searchResults = null;
        try {
           // animal.addAnimals();
          //  searchResults = searchservice.fuzzySearch(q);

        } catch (Exception ex) {
        }
        //model.addAttribute("search", searchResults);
        return "index";

    }
}
