package classes.pokemon;

import classes.pokemon.listaataques.Ataque;

public class PokemonLutador extends Pokemon{

    public PokemonLutador(String nome, Ataque ataque, int nivel, int velocidade, int hp, int forca) {
        super(nome, "Lutador", ataque, nivel, velocidade, hp, "Voador", forca);
    }
}