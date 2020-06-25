package com.brainstation.demo.socialmedia.TravelWorld.controller;

import com.brainstation.demo.socialmedia.TravelWorld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List getUsers(){
        return userService.findAllUser();
    }



    @GetMapping("/register")
    public String showRegistrationPage(Model model) {

        return "user/add";
    }

}
