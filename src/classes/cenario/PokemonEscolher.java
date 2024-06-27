package classes.cenario;

import java.util.Scanner;

import classes.pokemon.Pokemon;

public class PokemonEscolher extends Objetos{

    Scanner leitor = new Scanner(System.in);

    private String sprite;
    private Pokemon pokemon;
    private int key;

    public PokemonEscolher(int posx, int posy, String sprite, Pokemon pokemon) {
        super(true);
        this.sprite = sprite;
        this.pokemon = pokemon;
    }

    @Override
    public String getSprite() {
        return sprite;
    }

    public int escolherPokemon() {
        System.out.println("Deseja escolher o pokemon " + pokemon.getNome() + "?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int escolha = leitor.nextInt();

        return escolha;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    @Override
    public int getKey() {
        return key;
    }
    
}
