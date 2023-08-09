package com.ada.petbet.controller;

import com.ada.petbet.entity.Aposta;
import com.ada.petbet.entity.Apostador;
import com.ada.petbet.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/aposta")
public class ApostaController {

    @Autowired
    GenericService<Aposta> apostaService;

    @GetMapping(value = "/lista")
    public ResponseEntity<List<Aposta>> getAposta() {
        return new ResponseEntity<>(apostaService.getGenerics(), OK);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Aposta> add(@RequestBody Aposta aposta) {
        return new ResponseEntity<>(apostaService.add(aposta), CREATED);
    }

}
