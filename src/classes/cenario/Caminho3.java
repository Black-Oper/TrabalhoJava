package classes.cenario;

public class Caminho3 extends Objetos{

    private String sprite;

    public Caminho3(){
        super(true);
        this.sprite = "\u001B[42m"  + "🟫" + "\u001B[0m";
    }

    @Override
    public String getSprite() {
        return sprite;
    }
}
