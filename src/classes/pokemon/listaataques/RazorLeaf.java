package classes.pokemon.listaataques;

import classes.personagem.Jogador;
import classes.pokemon.Pokemon;

public class RazorLeaf extends Ataque{

    public RazorLeaf() {
        super("Razor Leaf", 5);
    }

    public void atacar(Jogador jogador, Pokemon inimigo) {
        System.out.println(jogador.getPokemon().get(0).getNome() + " usou " + this.getNome());
        if (inimigo.getTipo().equals("Água")) {
            inimigo.setHp(inimigo.getHp() - (this.getDano() * 2));
        } else {
            inimigo.setHp(inimigo.getHp() - this.getDano());
        }
    }
    
}
