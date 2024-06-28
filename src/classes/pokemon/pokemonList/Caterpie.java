package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonPlanta;
import classes.pokemon.listaataques.RazorLeaf;

public class Caterpie extends PokemonPlanta implements IPokemon{

    public Caterpie() {
        super("Caterpie", new RazorLeaf(), 5, 5, 7, 7);
    }

    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 7) {
            System.out.println("Caterpie evoluiu para Metapod!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Metapod());
        }
    }

}
