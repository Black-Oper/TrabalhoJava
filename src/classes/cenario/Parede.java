package classes.cenario;

public class Parede extends Objetos{
    private String sprite;

    public Parede(String sprite) {
        super(false);
        this.sprite = sprite;
    }

    @Override
    public String getSprite() {
        return sprite;
    }
}
