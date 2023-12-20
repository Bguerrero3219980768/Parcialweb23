package com.example.Parcialweb23.controller;

import com.example.ParcialWeb23.entities.Pokemon;
import com.example.ParcialWeb23.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping("/all")
    public List<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }

    @GetMapping("/{tipo}")
    public ResponseEntity<Pokemon> getPokemonByType(@PathVariable Integer tipo) {
        Optional<Pokemon> pokemon = pokemonRepository.findByTipoPokemon(tipo);

        return pokemon.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Puedes agregar otros métodos según sea necesario

}
