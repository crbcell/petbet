package com.ada.petbet.controller;

import com.ada.petbet.entity.Bicho;
import com.ada.petbet.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/bicho")
public class BichoController {

    @Autowired
    GenericService<Bicho> bichoService;


    @GetMapping(value = "/lista", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Bicho>> getBichos()
    {
        return new ResponseEntity<>(bichoService.getGenerics(), OK);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Bicho> add(@RequestBody Bicho bicho) {
        return new ResponseEntity<>(bichoService.add(bicho), CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Bicho> update(@RequestBody Bicho bicho) {
        return new ResponseEntity<>(bichoService.update(bicho), CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        bichoService.delete(id);
    }

}
