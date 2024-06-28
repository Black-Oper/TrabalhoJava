package classes.cenario;

public class Caminho2 extends Objetos{

    private String sprite;
<<<<<<< HEAD
=======
    private int key;
>>>>>>> main

    public Caminho2(){
        super(true);
        this.sprite = "\u001B[42m"  + "🟨" + "\u001B[0m";
    }

    @Override
    public String getSprite() {
        return sprite;
    }
<<<<<<< HEAD
=======

    @Override
    public int getKey() {
        return 1;
    }

>>>>>>> main
}
