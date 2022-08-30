package com.appweb.springweb.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.appweb.springweb.models.Administrador;



public interface AdministradoresRepositorio extends CrudRepository<Administrador, Integer> {
    
}
