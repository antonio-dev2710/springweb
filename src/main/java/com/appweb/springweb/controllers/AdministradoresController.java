package com.appweb.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.appweb.springweb.models.Administrador;
import com.appweb.springweb.repositorio.AdministradoresRepositorio;



@Controller
public class AdministradoresController {
    @Autowired
    private AdministradoresRepositorio repo;
    @GetMapping("/administrador")
    public String index(Model model){
                                            //utilizar um cast para fzr a converção
        List<Administrador> administradores=(List<Administrador>) repo.findAll();

        //paramentro model pode enviar dados pra o template
        model.addAttribute("administradores", administradores);
        return "administrador/index" ;  
    }
    

    
}
