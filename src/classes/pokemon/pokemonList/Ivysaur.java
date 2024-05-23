package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonPlanta;

public class Ivysaur extends PokemonPlanta{

    public Ivysaur() {
        super("Ivysaur", "Seed Bomb", 1, 7, 12, 9);
    }
    
    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 32) {
            System.out.println("Ivysaur evoluiu para Venusaur!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Venusaur());
        }
    }
}
