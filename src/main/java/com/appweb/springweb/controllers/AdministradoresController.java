package com.appweb.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.appweb.springweb.models.Administrador;
import com.appweb.springweb.repositorio.AdministradoresRepositorio;

@Controller
public class AdministradoresController {
    @Autowired
    private AdministradoresRepositorio repo;


   
    

    @GetMapping("/administradores")
    public String index(Model model) {
        // utilizar um cast para fzr a converção
        List<Administrador> administradores = (List<Administrador>) repo.findAll();

        // paramentro model pode enviar dados pra o template
        model.addAttribute("administradores", administradores);
        return "administradores/index";
    }

    @GetMapping("/administradores/novo")
    public String novo() {
        // paramentro model pode enviar dados pra o template

        return "administradores/novo";
    }

    @PostMapping("/administradores/criar")
    public String criar(Administrador administrador) {
        repo.save(administrador);
        return "redirect:/administradores";
    }

    @GetMapping("/administradores/{id}/excluir")
    public String excluirAdminostrador(@PathVariable Integer id) {
        repo.deleteById(id);
        return "redirect:/administradores";
    }
   
}

