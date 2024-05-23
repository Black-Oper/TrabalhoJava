package classes.pokemon.pokemonList;

import java.util.List;

import classes.personagem.Jogador;
import classes.pokemon.PokemonPlanta;

public class Bulbassaur extends PokemonPlanta{

    public Bulbassaur() {
        super("Bulbassaur", "Razor Leaf", 5, 5, 10, 7);
    }
    
    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 16) {
            System.out.println("Bulbassaur evoluiu para Ivysaur!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Ivysaur());
        }
    }
}
