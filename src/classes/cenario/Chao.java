package classes.cenario;

public class Chao extends Objetos {

    private String sprite;

    public Chao(String sprite) {
        super(true);
        this.sprite = sprite;
    }

    @Override
    public String getSprite() {
        return sprite;
    }
}
