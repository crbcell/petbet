package com.ada.petbet.repository;

import com.ada.petbet.entity.Aposta;
import com.ada.petbet.entity.Bicho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApostaRepository extends JpaRepository<Aposta, Long> {
}
