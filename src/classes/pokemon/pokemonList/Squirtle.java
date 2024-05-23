package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonAgua;

public class Squirtle extends PokemonAgua{

    public Squirtle() {
        super("Squirtle", "Water Gun", 5, 10, 10, 10);
    }

    public void evoluir(Jogador jogador){
        if(this.getNivel() == 16){
            System.out.println("Squirtle evoluiu para Wartortle!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Wartortle());
        }
    }
    
}
