package classes.cenario;

import java.util.List;

import classes.pokemon.Pokemon;

public class Treinador extends Objetos{

    private String sprite;
    private List<Pokemon> pokemons;

    public Treinador(List<Pokemon> pokemons, String sprite) {
        super(true);
        this.pokemons = pokemons;
        this.sprite = sprite;
    }

    public List<Pokemon> getPokemon() {
        return pokemons;
    }

    @Override
    public String getSprite() {
        return sprite;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }
}
