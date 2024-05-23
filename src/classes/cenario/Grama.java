package classes.cenario;

public class Grama extends Objetos {

    private String sprite;

    public Grama(String sprite) {
        super( true);
        this.sprite = sprite;
    }

    @Override
    public String getSprite() {
        return sprite;
    }
}

