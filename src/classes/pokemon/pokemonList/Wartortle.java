package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonAgua;
import classes.pokemon.listaataques.WaterGun;

public class Wartortle extends PokemonAgua{

    public Wartortle() {
        super("Wartortle", new WaterGun(), 16, 10, 10, 10);
    }

    public void evoluir(Jogador jogador){
        if(this.getNivel() == 36){
            System.out.println("Wartortle evoluiu para Blastoise!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Blastoise());
        }
    }
    
}
