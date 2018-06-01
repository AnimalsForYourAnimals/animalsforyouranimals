package com.studenty.animalsforyouranimals.Controller;

import com.studenty.animalsforyouranimals.controller.LoginController;
import com.studenty.animalsforyouranimals.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.ModelAndView;

@AutoConfigureRestDocs
public class LoginControllerTest {

    @Autowired
    private UserService userService;

    private ModelAndView mav;
    private MockMvc mockMvc;

    @Test
    public void loginViewName(){
        LoginController loginController = new LoginController();
        mav = loginController.login();
        Assert.assertEquals("login", mav.getViewName());

    }
}
