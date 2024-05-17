package classes.cenario;

public class Caminho extends Objetos{

    private String sprite;

    public Caminho(int posx, int posy) {
        super(posx, posy, true);
        this.sprite = "⬛";
    }

    @Override
    public String getSprite() {
        return sprite;
    }
}
