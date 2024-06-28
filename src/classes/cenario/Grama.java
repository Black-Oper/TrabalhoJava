package classes.cenario;

public class Grama extends Objetos {

    private String sprite;
    private int key;

    public Grama(String sprite) {
        super( true);
        this.sprite = sprite;
    }

    @Override
    public String getSprite() {
        return sprite;
    }

    @Override
    public int getKey() {
        return 1;
    }

}

