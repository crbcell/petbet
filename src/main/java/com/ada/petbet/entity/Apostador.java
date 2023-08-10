package com.ada.petbet.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

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

    @OneToMany(targetEntity = Aposta.class, mappedBy = "apostador", fetch = FetchType.EAGER)
    private final List<Aposta> apostaList = new ArrayList<>();

    public Apostador() {
    }

}
