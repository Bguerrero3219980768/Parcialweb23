package com.example.Parcialweb23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Parcialweb23.entities.Entrenador;

import java.util.List;
import java.util.Optional;

public interface EntrenadorRepository extends JpaRepository<Entrenador, String> {
    public Optional<Entrenador> findByUuid(String uuid);


}
