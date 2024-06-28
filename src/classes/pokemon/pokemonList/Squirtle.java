package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonAgua;
import classes.pokemon.listaataques.WaterGun;

public class Squirtle extends PokemonAgua implements IPokemon{

    public Squirtle() {
        super("Squirtle", new WaterGun(), 5, 10, 10, 10);
    }

    public void evoluir(Jogador jogador){
        if(this.getNivel() == 16){
            System.out.println("Squirtle evoluiu para Wartortle!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Wartortle());
        }
    }
    
}
