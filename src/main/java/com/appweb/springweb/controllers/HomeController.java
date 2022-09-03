package com.appweb.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model){
        //paramentro model pode enviar dados pra o template
        model.addAttribute("nome", "Antonio");
    return "home/index" ;   
    }

    
}
    

