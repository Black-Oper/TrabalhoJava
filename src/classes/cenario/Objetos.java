package classes.cenario;

public abstract class Objetos extends Elemento{

    private boolean andavel;

    public Objetos(boolean andavel) {
        this.andavel = andavel;
    }

    public boolean isAndavel() {
        return andavel;
    }
}
