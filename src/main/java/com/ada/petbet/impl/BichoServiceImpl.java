package com.ada.petbet.impl;

import com.ada.petbet.entity.Bicho;
import com.ada.petbet.repository.BichoRepository;
import com.ada.petbet.service.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BichoServiceImpl implements GenericService<Bicho> {
    private BichoRepository bichoRepository;

    @Override
    public Bicho add(Bicho bicho) {
        return bichoRepository.save(bicho);
    }

    @Override
    public List<Bicho> getGenerics() {
        return bichoRepository.findAll().stream().toList();
    }

    @Override
    public Bicho update(Bicho bicho) {
        return bichoRepository.save(bicho);
    }

    @Override
    public void delete(Long id) {
        bichoRepository.deleteById(id);

    }

    @Override
    public Optional<Bicho> getById(Integer id) throws Throwable {
        return Optional.ofNullable(bichoRepository.findById(Long.valueOf(id)).orElseThrow(() -> new Exception("Bicho com problemas")));
    }
}
