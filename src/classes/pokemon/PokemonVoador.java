package classes.pokemon;

import java.util.List;

public class PokemonVoador extends Pokemon{

    public PokemonVoador(String nome, String ataque, int nivel, int velocidade, int hp, int forca) {
        super(nome, "Voador", ataque, nivel, velocidade, hp, "Eletrico", forca);
    }
}