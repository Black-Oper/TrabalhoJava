package classes.cenario;

public class Chao extends Objetos {

    private String sprite;
    private int key;

    public Chao(String sprite, int key) {
        super(true);
        this.sprite = sprite;
        this.key = key;
    }

    @Override
    public String getSprite() {
        return sprite;
    }

    @Override
    public int getKey() {
        return key;
    }

}
