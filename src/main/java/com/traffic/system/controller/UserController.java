package com.traffic.system.controller;

import com.traffic.system.entities.User;
import com.traffic.system.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        userService.registerUser(user);
        model.addAttribute("message", "User registered successfully!");
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute User user, Model model) {
        User loggedUser = userService.loginUser(user.getUsername(), user.getPassword());
        if (loggedUser != null) {
            model.addAttribute("message", "Logged in successfully!");
            model.addAttribute("isLoggedIn", true);
            return "dashboard";
        } else {
            model.addAttribute("error", "Invalid username or password.");
            model.addAttribute("isLoggedIn", false);
        }
        return "index";
    }

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        return "dashboard";
    }
}
