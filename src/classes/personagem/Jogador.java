package classes.personagem;

import java.io.Serializable;
import java.util.*;

import classes.item.Mochila;
import classes.pokemon.Pokemon;

public class Jogador extends Personagem {

    private final String sprite = "🧢";
    private List<Pokemon> pokemonList;
    private Mochila mochila;

    public Jogador(int posx, int posy) {
        super(posx, posy);
        this.pokemonList = new ArrayList<>();
        this.mochila = new Mochila();
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

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }
}