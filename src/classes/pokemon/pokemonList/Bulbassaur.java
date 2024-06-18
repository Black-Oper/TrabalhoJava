package classes.pokemon.pokemonList;

import java.util.List;

import classes.personagem.Jogador;
import classes.pokemon.PokemonPlanta;
import classes.pokemon.listaataques.RazorLeaf;

public class Bulbassaur extends PokemonPlanta{

    public Bulbassaur() {
        super("Bulbassaur", new RazorLeaf(), 5, 5, 10, 10);
    }
    
    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 16) {
            System.out.println("Bulbassaur evoluiu para Ivysaur!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Ivysaur());
        }
    }
}
