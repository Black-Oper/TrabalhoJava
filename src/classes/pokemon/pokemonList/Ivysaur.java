package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonPlanta;
import classes.pokemon.listaataques.RazorLeaf;

public class Ivysaur extends PokemonPlanta{

    public Ivysaur() {
        super("Ivysaur", new RazorLeaf(), 1, 7, 12, 9);
    }
    
    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 32) {
            System.out.println("Ivysaur evoluiu para Venusaur!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Venusaur());
        }
    }
}
