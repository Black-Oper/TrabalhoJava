package classes.pokemon;

import classes.pokemon.listaataques.Ataque;

public class PokemonAgua extends Pokemon{

    public PokemonAgua(String nome, Ataque ataque, int nivel, int velocidade, int hp, int hpMax) {
        super(nome, "Agua", ataque, nivel, velocidade, hp, "Planta", hpMax);
    }

    @Override
    public String nomeColor(){
        return "\u001B[34m";
    }

}