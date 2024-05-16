package Classes;

public abstract class Objetos extends Elemento{

    private int posx;
    private int posy;
    private boolean andavel;

    public Objetos(int posx, int posy, boolean andavel) {
        this.posx = posx;
        this.posy = posy;
        this.andavel = andavel;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public boolean isAndavel() {
        return andavel;
    }
}
