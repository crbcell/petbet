package com.ada.petbet.impl;

import com.ada.petbet.entity.Apostador;
import com.ada.petbet.repository.ApostadorRepository;
import com.ada.petbet.service.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ApostadorServiceImpl implements GenericService<Apostador> {

    private ApostadorRepository apostadorRepository;

    @Override
    public Apostador add(Apostador apostador) {
        return apostadorRepository.save(apostador);
    }

    @Override
    public List<Apostador> getGenerics() {
        return apostadorRepository.findAll().stream().toList();
    }

    @Override
    public Apostador update(Apostador apostador) {
        return apostadorRepository.save(apostador);
    }

    @Override
    public void delete(Long id) {
        apostadorRepository.deleteById(id);
    }

    @Override
    public Optional<Apostador> getById(Integer id) throws Throwable {
        return Optional.empty();
    }

}
