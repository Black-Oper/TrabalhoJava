package classes.personagem;

import classes.cenario.Elemento;


public abstract class Personagem extends Elemento {
    
    private int posx;
    private int posy;

    public Personagem(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
}