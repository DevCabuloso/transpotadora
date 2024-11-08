package com.transportadora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  // Anotação que marca a classe como uma entidade JPA
public class Motorista {

    @Id  // A anotação define a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Define o tipo de geração do ID
    private Long id;

    private String nome;
    private String CNH;

    // Construtores, getters e setters
    public Motorista() {}

    public Motorista(String nome, String CNH) {
        this.nome = nome;
        this.CNH = CNH;

    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

}