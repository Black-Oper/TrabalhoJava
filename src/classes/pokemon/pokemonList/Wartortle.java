package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonAgua;

public class Wartortle extends PokemonAgua{

    public Wartortle() {
        super("Wartortle", "Water Pulse", 16, 10, 10, 10);
    }

    public void evoluir(Jogador jogador){
        if(this.getNivel() == 36){
            System.out.println("Wartortle evoluiu para Blastoise!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Blastoise());
        }
    }
    
}
