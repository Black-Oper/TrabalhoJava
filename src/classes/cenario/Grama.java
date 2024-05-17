package classes.cenario;

public class Grama extends Objetos {

    private String sprite;

    public Grama(int posx, int posy) {
        super(posx, posy, true);
        this.sprite = "🌾";
    }

    @Override
    public String getSprite() {
        return sprite;
    }
}
