package classes.cenario;

import java.util.List;

import classes.personagem.Jogador;
import classes.pokemon.Pokemon;

public class Curador extends Objetos{

    private String sprite;

    public Curador(String sprite) {
        super(true);
        this.sprite = sprite;
    }
    
    @Override
    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public void comoAssimDaOndeVemEssaMusica(Jogador jogador) {

        if (jogador.getPokemon().isEmpty()) {
            System.out.println("Você não tem pokemons para curar!");
            return;
        }

        for (int i = 0; i < jogador.getPokemon().size(); i++) {
            jogador.getPokemon().get(i).setHp(jogador.getPokemon().get(i).getHpMax());
        }
        System.out.println("Pokemons curados com sucesso!");
    }
}
