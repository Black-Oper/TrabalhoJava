package classes.cenario;

public class Caminho4 extends Objetos{

    private String sprite;
    private int key;

    public Caminho4(){
        super(true);
        this.sprite = "\u001B[42m"  + "⬜" + "\u001B[0m";
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
