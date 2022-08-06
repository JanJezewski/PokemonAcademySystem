package com.PokemonAcademy.PokemonAcademy.repository;


import com.PokemonAcademy.PokemonAcademy.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

    default Pokemon fetchPokemon(String code) {
        RestTemplate restTemplate = new RestTemplate();
        Pokemon pokemon = restTemplate.getForObject(
                String.format(
                        "https://pokeapi.co/api/v2/pokemon/21/",
                        code),
                Pokemon.class
        );
        return pokemon;

    }

    List<Pokemon> findAllByName(String pokemonName);
}
