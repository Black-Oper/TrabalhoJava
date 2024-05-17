package classes.cenario;

public class Porta extends Objetos{

    private String sprite;
    private int jposx;
    private int jposy;

    public Porta(int posx, int posy, int jposx, int jposy) {
        super(posx, posy, true);
        this.sprite = "🟫";
        this.jposx = jposx;
        this.jposy = jposy;
    }

    @Override
    public String getSprite() {
        return sprite;
    }

    public int getJposx() {
        return jposx;
    }

    public int getJposy() {
        return jposy;
    }
}
