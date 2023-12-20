package com.example.Parcialweb23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Parcialweb23.entities.Entrenador;
import com.example.Parcialweb23.entities.Pokemon;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    public Optional<Pokemon> findByTipopokemon(Integer tipo_pokemon);
    public Optional<Pokemon> findByUuid(String uuid);
}
