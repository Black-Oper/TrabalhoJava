package classes.pokemon;

import java.util.List;

import classes.pokemon.listaataques.Ataque;

public class PokemonVoador extends Pokemon{

    public PokemonVoador(String nome, Ataque ataque, int nivel, int velocidade, int hp, int hpMax) {
        super(nome, "Voador", ataque, nivel, velocidade, hp, "Eletrico", hpMax);
    }
}