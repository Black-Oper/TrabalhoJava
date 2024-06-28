package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonVoador;
import classes.pokemon.listaataques.Ataque;

public class Pidgey extends PokemonVoador implements IPokemon{

    public Pidgey() {
        super("Pidgey", new Ataque("Investida", 5), 5, 8, 7, 7);
    }

    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 18) {
            System.out.println("Pidgey evoluiu para Pidgotto!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Pidgotto());
        }
    }

}
