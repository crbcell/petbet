package com.ada.petbet.repository;

import com.ada.petbet.entity.Bicho;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BichoRepository extends JpaRepository<Bicho, Long> {
}
