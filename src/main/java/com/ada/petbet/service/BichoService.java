package com.ada.petbet.service;

import com.ada.petbet.entity.Bicho;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BichoService {

    Bicho add (Bicho bicho);
    List<Bicho> getBichos();
    Bicho update (Bicho bicho);

    void delete (Long id);

    Optional<Bicho> getById(Integer id) throws Throwable;


}
