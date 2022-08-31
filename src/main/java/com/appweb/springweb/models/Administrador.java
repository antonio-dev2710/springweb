package com.appweb.springweb.models;

import javax.persistence.*;

import org.hibernate.annotations.Type;


@Entity
@Table(name="administradores")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
   private Integer id;

   @Column(name="nome",length=100,nullable=false)
   private String nome;

   @Column(name="email",length=180,nullable=false)
   private String email;
   
   @Column(name="senha",length=255,nullable=false)
   private String senha;
    @Column(name="observacao")
    @Type(type="text")
   private String observacao;

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getSenha() {
    return senha.substring(0,3)+"***" ;
}

public void setSenha(String senha) {
    this.senha = senha;
}
    
}
