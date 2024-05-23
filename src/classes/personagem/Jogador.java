package classes.personagem;

<<<<<<< Updated upstream
=======
import java.util.*;

import classes.pokemon.Pokemon;

>>>>>>> Stashed changes
public class Jogador extends Personagem{

    private String sprite;
    private List<Pokemon> pokemonList;

    public Jogador(int posx, int posy) {
        super(posx, posy);
        this.sprite = "🧢";
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