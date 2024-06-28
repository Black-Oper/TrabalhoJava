package classes.pokemon.listaataques;

import classes.pokemon.Pokemon;

public class RazorLeaf extends Ataque{

    public RazorLeaf() {
        super("Razor Leaf", 5);
    }

    @Override
    public void atacar(Pokemon jogadorPokemon, Pokemon inimigo) {
        System.out.println(jogadorPokemon.getNome() + " usou " + this.getNome());
        if (inimigo.getTipo().equals("Água")) {
            inimigo.setHp(inimigo.getHp() - (this.getDano() * 2));
        } else if (inimigo.getTipo().equals("Fogo")) {
            inimigo.setHp(inimigo.getHp() - (this.getDano() / 2));
        } else {
            inimigo.setHp(inimigo.getHp() - this.getDano());
        }
    }
    
}
