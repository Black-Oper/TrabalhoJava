package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonPlanta;
import classes.pokemon.listaataques.RazorLeaf;

public class Metapod extends PokemonPlanta {

    public Metapod() {
        super("Metapod", new RazorLeaf(), 7, 7, 10, 10);
    }

    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 10) {
            System.out.println("Metapod evoluiu para Butterfree!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Butterfree());
        }
    }
}
