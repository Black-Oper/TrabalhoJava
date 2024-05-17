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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<String> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<String> ataques) {
        this.ataques = ataques;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    
}
