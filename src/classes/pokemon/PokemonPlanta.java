package classes.pokemon;

import java.util.List;

public class PokemonPlanta extends Pokemon {

    private String fraqueza;

    public PokemonPlanta(String nome, String tipo, List<String> ataques, int velocidade, int nivel, int hp) {
        super(nome, tipo, ataques, nivel, velocidade, hp);
        this.fraqueza = "Fogo";
    }
    
}
