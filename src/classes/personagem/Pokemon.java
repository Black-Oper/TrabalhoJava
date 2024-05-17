package classes.personagem;

import java.util.List;

public abstract class Pokemon {
    private String nome;
    private String tipo;
    private List<String> ataques;
    private int nivel;
    private int hp;

    public Pokemon(String nome, String tipo, List<String> ataques, int nivel, int hp) {
        this.nome = nome;
        this.tipo = tipo;
        this.ataques = ataques;
        this.nivel = nivel;
        this.hp = hp;
    }
}
