package classes.pokemon.listaataques;

import classes.pokemon.Pokemon;

public class WaterGun extends Ataque{

    public WaterGun() {
        super("Water Gun", 5);
    }

    @Override
    public void atacar(Pokemon jogadorPokemon, Pokemon inimigo) {
        System.out.println(jogadorPokemon.getNome() + " usou " + this.getNome());
        if (inimigo.getTipo().equals("Fogo")) {
            inimigo.setHp(inimigo.getHp() - (this.getDano() * 2));
        } else if (inimigo.getTipo().equals("Planta")) {
            inimigo.setHp(inimigo.getHp() - (this.getDano() / 2));
        } else {
            inimigo.setHp(inimigo.getHp() - this.getDano());
        }
    }
    
}
