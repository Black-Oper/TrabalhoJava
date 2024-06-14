package classes.pokemon;

import classes.pokemon.listaataques.Ataque;

public class PokemonAgua extends Pokemon{

    public PokemonAgua(String nome, Ataque ataque, int nivel, int velocidade, int hp, int forca) {
        super(nome, "Agua", ataque, nivel, velocidade, hp, "Planta", forca);
    }
}