package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonFogo;

public class Charmeleon extends PokemonFogo{

    public Charmeleon() {
        super("Charmeleon", "Fire Fang", 16, 8, 11, 11);
    }

    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 36) {
            System.out.println("Charmeleon evoluiu para Charizard!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Charizard());
        }
    }
}
