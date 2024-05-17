package classes.personagem;

import classes.cenario.Objetos;

public class Npc extends Objetos {

    private String sprite;

    public Npc(int posx, int posy) {
        super(posx, posy, false);
        this.sprite = "😁";
    }

    @Override
    public String getSprite() {
        return this.sprite;
    }
}
