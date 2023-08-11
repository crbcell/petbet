package com.ada.petbet.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Table(name = "tb_apostador")
public class Apostador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String nome;
    private int idade;
    private String email;
    private String endereco;
    private String cep;

    @OneToMany(targetEntity = Aposta.class, mappedBy = "apostador", cascade = CascadeType.ALL)
    private Set<Aposta> apostaList = new HashSet<>();

    public Apostador() {
    }

    public Set<Aposta> getApostaList() {
        return apostaList;
    }

    public Apostador setApostaList(Set<Aposta> apostaList) {
        this.apostaList = apostaList;
        return this;
    }
}
