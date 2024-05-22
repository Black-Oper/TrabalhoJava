package classes.pokemon;

import java.util.List;

public class PokemonLutador extends Pokemon{

    private String fraqueza;

    public PokemonLutador(String nome, String tipo, List<String> ataques, int nivel, int velocidade, int hp) {
        super(nome, tipo, ataques, nivel, velocidade, hp);
        this.fraqueza = "Voador";
    }

}
