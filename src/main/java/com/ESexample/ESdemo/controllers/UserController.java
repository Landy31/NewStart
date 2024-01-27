package com.ESexample.ESdemo.controllers;

// UserController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.ESexample.ESdemo.model.User;
import com.ESexample.ESdemo.repository.UserRepository;
@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/register")
    public String processRegistration(User user) {
        userRepository.save(user);
        return "redirect:/register";
    }
}
