package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonFogo;

public class Charmander extends PokemonFogo{

    public Charmander() {
        super("Charmander", "Ember", 5, 7, 8, 9);
    }

    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 16) {
            System.out.println("Charmander evoluiu para Charmeleon!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Charmeleon());
        }
    }

}
