package classes.personagem;

import java.io.Serializable;
import java.util.*;

import classes.pokemon.Pokemon;

public class Jogador extends Personagem implements Serializable {

    private final String sprite = "🧢";
    private List<Pokemon> pokemonList;

    public Jogador(int posx, int posy) {
        super(posx, posy);
        this.pokemonList = new ArrayList<>();
    }

    @Override
    public String getSprite() {
        return this.sprite;
    }

    public List<Pokemon> getPokemon() {
        return pokemonList;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemonList = pokemon;
    }
}