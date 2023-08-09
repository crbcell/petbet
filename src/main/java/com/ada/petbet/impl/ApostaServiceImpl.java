package com.ada.petbet.impl;

import com.ada.petbet.entity.Aposta;
import com.ada.petbet.repository.ApostaRepository;
import com.ada.petbet.service.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ApostaServiceImpl implements GenericService<Aposta> {

    private ApostaRepository apostaRepository;

    @Override
    public Aposta add(Aposta aposta) {
        return apostaRepository.save(aposta);
    }

    @Override
    public List<Aposta> getGenerics() {
        return apostaRepository.findAll().stream().toList();
    }

    @Override
    public Aposta update(Aposta aposta) {
        return apostaRepository.save(aposta);
    }

    @Override
    public void delete(Long id) {
        apostaRepository.deleteById(id);
    }

    @Override
    public Optional<Aposta> getById(Integer id) throws Throwable {
        return Optional.empty();
    }
}
