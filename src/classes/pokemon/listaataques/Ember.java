package classes.pokemon.listaataques;

import classes.pokemon.Pokemon;

public class Ember extends Ataque{

    public Ember() {
        super("Ember", 5);
    }

    @Override
    public void atacar(Pokemon jogadorPokemon, Pokemon inimigo) {
        System.out.println(jogadorPokemon.getNome() + " usou " + this.getNome());
        if (inimigo.getTipo().equals("Planta")) {
            inimigo.setHp(inimigo.getHp() - (this.getDano() * 2));
        } else if (inimigo.getTipo().equals("Agua")) {
            inimigo.setHp(inimigo.getHp() - (this.getDano() / 2));
        } else {
            inimigo.setHp(inimigo.getHp() - this.getDano());
        }
    }
    
}
