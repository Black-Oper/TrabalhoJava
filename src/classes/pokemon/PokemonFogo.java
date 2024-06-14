package classes.pokemon;

import classes.pokemon.listaataques.Ataque;

public class PokemonFogo extends Pokemon {

    public PokemonFogo(String nome, Ataque ataque, int nivel, int velocidade, int hp, int forca) {
        super(nome, "Fogo", ataque, nivel, velocidade, hp, "Agua", forca);
    }
    
}