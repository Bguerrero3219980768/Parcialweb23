package com.example.Parcialweb23.controller;

import com.example.ParcialWeb23.entities.Entrenador;
import com.example.ParcialWeb23.entities.Pokemon;
import com.example.ParcialWeb23.repositories.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entrenador")
public class EntrenadorController {

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    @GetMapping("/all")
    public List<Entrenador> getAllEntrenadores() {
        return entrenadorRepository.findAll();
    }

    @GetMapping("/login/{email}")
    public ResponseEntity<Entrenador> getEntrenadorByEmail(@PathVariable String email) {
        Optional<Entrenador> entrenador = entrenadorRepository.findById(email);

        return entrenador.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{uuid}/pokemon")
    public ResponseEntity<List<Pokemon>> getPokemonByEntrenadorUuid(@PathVariable String uuid) {
        Optional<Entrenador> entrenador = entrenadorRepository.findByUuid(uuid);

        return entrenador.map(e -> ResponseEntity.ok(e.getPokemones()))
                .orElse(ResponseEntity.notFound().build());
    }

    // Puedes agregar otros métodos según sea necesario

}
