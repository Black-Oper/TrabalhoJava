package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonLutador;
import classes.pokemon.listaataques.Ataque;

public class Machop extends PokemonLutador implements IPokemon{

    public Machop() {
        super("Machop", new Ataque("Ataque", 5), 5, 5, 7, 7);
    }

    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 28) {
            System.out.println("Machop evoluiu para Machoke!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Machoke());
        }
    }

}