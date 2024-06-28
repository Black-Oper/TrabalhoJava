package classes.cenario;

public class PortaPreta extends Objetos{

    private String sprite;
    private int jposx;
    private int jposy;

    private int key;

    public PortaPreta(int jposx, int jposy) {
        super(true);
        this.sprite = "\u001B[40m" + "⬛" + "\u001B[0m";
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

    @Override
    public int getKey() {
        return 5;
    }

}
