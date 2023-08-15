package com.ada.petbet.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

    @JsonManagedReference
    @OneToMany(targetEntity = Aposta.class, mappedBy = "apostador", cascade = CascadeType.ALL)
    private List<Aposta> apostaList;

    public Apostador() {
    }

}
