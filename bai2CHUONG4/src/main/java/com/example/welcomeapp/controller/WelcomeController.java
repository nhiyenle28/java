package com.example.welcomeapp.controller;

import com.example.welcomeapp.model.WelcomeMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String showWelcomePage(Model model) {
        WelcomeMessage welcome = new WelcomeMessage("Chào mừng bạn đến với website!");
        model.addAttribute("welcome", welcome);
        return "welcome";
    }
}
