package com.robinsingh.springmvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MVCSecurityController {

    @GetMapping("/")
    public String showHome(){
        return "hello";
    }

    @GetMapping("/showLoginForm")
    public String showLoginForm(){
        return "fancy-login";
    }

    @GetMapping("/leaders")
    public String showLeaders(){
        return "leaders";
    }

    @GetMapping("/systems")
    public String showSystems(){
        return "systems";
    }

    @GetMapping("/access-denied")
    public String showAccessDenied(){
        return "access-denied";
    }

}
