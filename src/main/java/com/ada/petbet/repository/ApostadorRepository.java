package com.ada.petbet.repository;

import com.ada.petbet.entity.Apostador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApostadorRepository extends JpaRepository<Apostador, Long> {
}
