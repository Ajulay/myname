package com.ajulay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {



    @RequestMapping(value = "/hello", method=RequestMethod.GET)
    public String hello(Model uiModel){
        uiModel.addAttribute("name", "Me");
        return "home";

    }

}
