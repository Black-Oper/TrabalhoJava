package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonVoador;
import classes.pokemon.listaataques.Ataque;

public class Pidgotto extends PokemonVoador {

    public Pidgotto() {
        super("Pidgotto", new Ataque("Investida", 7), 18, 11, 9, 9);
    }

    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 18) {
            System.out.println("Pidgotto evoluiu para Pidgeot!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Pidgeot());
        }
    }

}
