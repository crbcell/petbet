package com.ada.petbet.service;

import com.ada.petbet.entity.Bicho;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GenericService<T> {

    T add (T t);
    List<T> getGenerics();
    T update (T t);
    void delete (Long id);

    Optional<T> getById(Integer id) throws Throwable;
}
