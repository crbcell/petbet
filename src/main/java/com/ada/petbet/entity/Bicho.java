package com.ada.petbet.entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_bicho")public class Bicho {

    @Id
    private Long id;

    @Column(name = "nome", length = 50)
    private String nome;

    public Long getId() {
        return id;
    }

    public Bicho setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Bicho setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Bicho() {
    }
}
