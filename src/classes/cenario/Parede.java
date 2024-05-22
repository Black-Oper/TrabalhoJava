package classes.cenario;

public class Parede extends Objetos{
    private String sprite;

    public Parede(int posx, int posy, String sprite) {
        super(posx, posy, false);
        this.sprite = sprite;
    }

    @Override
    public String getSprite() {
        return sprite;
    }
}
