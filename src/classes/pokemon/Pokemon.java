package classes.pokemon;

import classes.personagem.Jogador;
import classes.pokemon.listaataques.Ataque;

import java.io.Serializable;

public abstract class Pokemon implements Serializable {
    private String nome;
    private String tipo;
    private Ataque ataque;
    private int nivel;
    private int velocidade;
    private int hp;
    private int hpMax;
    private String fraqueza;
    private int forca;

    public Pokemon(String nome, String tipo, Ataque ataque, int nivel, int velocidade, int hp, String fraqueza, int hpMax) {
        this.nome = nome;
        this.tipo = tipo;
        this.ataque = ataque;
        this.hpMax = hpMax;
        this.nivel = nivel;
        this.velocidade = velocidade;
        this.hp = hp;
        this.fraqueza = fraqueza;
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

    public Ataque getAtaque() {
        return ataque;
    }

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
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

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public void subirNivel() {
        this.nivel++;
        this.hp *= 1.1;
        this.velocidade *= 1.1;
        this.forca *= 1.1;
    }

    public void evoluir(Jogador jogador) {
        // evoluir pokemon
    }

    public String nomeColor(){
        return "\u001B[33m" + nome + "\u001B[0m";
    }
}