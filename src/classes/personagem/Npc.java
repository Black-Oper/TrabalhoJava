package classes.personagem;

import classes.cenario.Objetos;

public class Npc extends Objetos {

    private String sprite;

    public Npc() {
        super(false);
        this.sprite = "😁";
    }

    @Override
    public String getSprite() {
        return this.sprite;
    }
}
