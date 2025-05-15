package com.example.welcomeapp.controller;

import com.example.welcomeapp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private final List<User> userList = new ArrayList<>();

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("users", userList);
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user, Model model) {
        userList.add(user);
        model.addAttribute("user", new User()); // Reset form
        model.addAttribute("users", userList); // Update user list
        return "form";
    }
}
