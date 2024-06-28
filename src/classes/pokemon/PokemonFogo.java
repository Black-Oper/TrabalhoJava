package classes.pokemon;

import classes.pokemon.listaataques.Ataque;

public class PokemonFogo extends Pokemon {

    public PokemonFogo(String nome, Ataque ataque, int nivel, int velocidade, int hp, int hpMax) {
        super(nome, "Fogo", ataque, nivel, velocidade, hp, "Agua", hpMax);
    }

    @Override
    public String nomeColor(){
        return "\u001B[31m";
    }
}