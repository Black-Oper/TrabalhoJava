package classes.pokemon;

import classes.pokemon.listaataques.Ataque;

public class PokemonEletrico extends Pokemon{

    public PokemonEletrico(String nome, Ataque ataque, int nivel, int velocidade, int hp, int forca) {
        super(nome, "Eletrico", ataque, nivel, velocidade, hp, "Terra", forca);
    }
    
}