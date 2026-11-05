package com.br.nexus.entities;

import java.lang.annotation.Inherited;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;

    @Column(unique = true)
    private String email;

    private String senha;

    public Cliente(String nome, String emai, String senha){




    }
}