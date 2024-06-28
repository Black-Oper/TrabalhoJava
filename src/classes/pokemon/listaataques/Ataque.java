package classes.pokemon.listaataques;

import classes.personagem.Jogador;
import classes.pokemon.Pokemon;

public class Ataque {
    private String nome;
    private int dano;

    public Ataque(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void atacar(Pokemon jogadorPokemon, Pokemon inimigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }
}
