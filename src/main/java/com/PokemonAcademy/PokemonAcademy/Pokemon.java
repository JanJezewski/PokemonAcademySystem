package com.PokemonAcademy.PokemonAcademy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Pokemon {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;
	private String PokemonName;
	private String URL;

	public Pokemon() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pokemon(Long id, String pokemonName, String URL) {
		this.id = id;
		PokemonName = pokemonName;
		this.URL = URL;
	}

	public String getPokemonNam() {
		return PokemonName;
	}

	public void setPokemonName(String pokemonName) {
		PokemonName = pokemonName;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pokemon that = (Pokemon) o;
		return Objects.equals(id, that.id) && Objects.equals(PokemonName, that.PokemonName) && Objects.equals(URL, that.URL);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, PokemonName, URL);
	}

	@Override
	public String toString() {
		return "PokemonAcademyApiApplication{" +
				"id=" + id +
				", PokemonName='" + PokemonName + '\'' +
				", URL='" + URL + '\'' +
				'}';
	}
}
enum Standard {
	NORMAL, EXCLUSIVE
}
