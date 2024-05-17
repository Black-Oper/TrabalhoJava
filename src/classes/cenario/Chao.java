package classes.cenario;

public class Chao extends Objetos {

    private String sprite;

    public Chao(int posx, int posy, String sprite) {
        super(posx, posy, true);
        this.sprite = sprite;
    }

    @Override
    public String getSprite() {
        return sprite;
    }
}
