package classes.pokemon.pokemonList;

import classes.personagem.Jogador;
import classes.pokemon.PokemonEletrico;
import classes.pokemon.listaataques.Ataque;

public class Pikachu extends PokemonEletrico {

    public Pikachu() {
        super("Pikachu", new Ataque("Bola Elétrica", 7), 12, 10, 9, 9);
    }

    public void evoluir(Jogador jogador) {
        if (this.getNivel() == 36) {
            System.out.println("Pikachu evoluiu para Raichu!");
            jogador.getPokemon().remove(this);
            jogador.getPokemon().add(new Raichu());
        }
    }

}
