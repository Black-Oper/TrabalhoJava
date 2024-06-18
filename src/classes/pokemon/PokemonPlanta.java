package classes.pokemon;

import java.util.List;

import classes.pokemon.listaataques.Ataque;

public class PokemonPlanta extends Pokemon {

    public PokemonPlanta(String nome, Ataque ataque, int nivel, int velocidade, int hp, int hpMax) {
        super(nome, "Planta", ataque, nivel, velocidade, hp, "Fogo", hpMax);
    }
    
}