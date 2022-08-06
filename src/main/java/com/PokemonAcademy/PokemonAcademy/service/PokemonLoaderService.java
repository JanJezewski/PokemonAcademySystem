package com.PokemonAcademy.PokemonAcademy.service;

import com.PokemonAcademy.PokemonAcademy.Pokemon;
import com.PokemonAcademy.PokemonAcademy.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonLoaderService {

    private final PokemonRepository pokemonRepository;

    @Autowired
    public PokemonLoaderService(PokemonRepository pokemonRepository, PokemonRepository pokemonRepository1) {

        this.pokemonRepository = pokemonRepository;
    }

Pokemon getById(Long id){

}
    List<Pokemon>getByName(String PokemonName) {return this.pokemonRepository.findAllByName(PokemonName);}


    Pokemon addPokemon(Pokemon pokemon) {
        this.pokemonRepository.findAllByName(pokemon.setPokemonName(String pokemonName)).orElseThrow(()-> {
            {
                throw new IllegalArgumentException("NoPokemonFoundException") {
                }
                return (Pokemon) this.pokemonRepository.save(pokemon);
            }
        }

    }
}
