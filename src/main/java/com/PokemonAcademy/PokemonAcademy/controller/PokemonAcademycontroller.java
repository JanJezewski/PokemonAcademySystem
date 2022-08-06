package com.PokemonAcademy.PokemonAcademy.controller;

import com.PokemonAcademy.PokemonAcademy.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Pokemon")

public class PokemonAcademycontroller {
    @GetMapping("/{id}")
    Pokemon getById(@PathVariable Long id) {
        JpaRepository pokemonService = null;
        return (Pokemon) pokemonService.getReferenceById(id);
    }

}
