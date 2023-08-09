package com.ada.petbet.controller;

import com.ada.petbet.entity.Apostador;
import com.ada.petbet.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/apostador")
public class ApostadorController {

    @Autowired
    GenericService<Apostador> apostadorService;

    @GetMapping(value = "/lista")
    public ResponseEntity<List<Apostador>> getApostadores() {
        return new ResponseEntity<>(apostadorService.getGenerics(), OK);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Apostador> add(@RequestBody Apostador apostador) {
        return new ResponseEntity<>(apostadorService.add(apostador), CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Apostador> update(@RequestBody Apostador apostador) {
        return new ResponseEntity<>(apostadorService.update(apostador), CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        apostadorService.delete(id);
    }
}
