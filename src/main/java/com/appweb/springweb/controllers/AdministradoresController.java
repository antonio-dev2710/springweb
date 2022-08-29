package com.appweb.springweb.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministradoresController {
    @GetMapping("/administrador")
    public String index(){
        return "administrador/index" ;  
    }
    

    
}
