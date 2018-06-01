package com.studenty.animalsforyouranimals.Controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.studenty.animalsforyouranimals.controller.AdminController;
import com.studenty.animalsforyouranimals.model.User;
import com.studenty.animalsforyouranimals.service.UserService;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.ModelAndView;


@AutoConfigureRestDocs
public class AdminControllerTest {

    @Rule
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation();

    @Autowired
    private UserService userService;

    private ModelAndView mav;
    private MockMvc mockMvc;

    /*@Before
    public void setUp(){

        mockMvc = MockMvcBuilders.standaloneSetup(adminController)
                .apply(documentationConfiguration(this.restDocumentation))
                .build();
    }*/

    @Test
    public void usersViewName(){
        AdminController adminController = new AdminController();
        mav = adminController.users();
        Assert.assertEquals("admin/users", mav.getViewName());
    }

    @Test
    public void homeViewName(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());

        AdminController adminController = new AdminController();
        mav = adminController.home();
        Assert.assertEquals("admin/home", mav.getViewName());
    }
    @Test
    public void contactViewName(){
        AdminController adminController = new AdminController();
        mav = adminController.contact();
        Assert.assertEquals("contact", mav.getViewName());
    }

    /*@Test
    public void advertisementViewName(){
        AdminController adminController = new AdminController();
        ModelAndView mav = adminController.advertisement();
        Assert.assertEquals("admin/advertisement", mav.getViewName());
    }*/
}
