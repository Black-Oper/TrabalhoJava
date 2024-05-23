package classes.cenario;

public class Porta extends Objetos{

    private String sprite;
    private int jposx;
    private int jposy;

    public Porta(int jposx, int jposy) {
        super(true);
        this.sprite = "\u001B[47m"  + "🟫" + "\u001B[0m";
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
