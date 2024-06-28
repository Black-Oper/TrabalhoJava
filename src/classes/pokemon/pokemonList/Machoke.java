package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonLutador;
import classes.pokemon.listaataques.Ataque;

public class Machoke extends PokemonLutador implements IPokemon{
 
    public Machoke() {
        super("Machoke", new Ataque("Ataque", 7), 28, 10, 10, 10);
    }

    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 36) {
            System.out.println("Machoke evoluiu para Machamp!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Machamp());
        }
    }

}
