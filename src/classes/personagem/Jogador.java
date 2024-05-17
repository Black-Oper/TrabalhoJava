package classes.personagem;

public class Jogador extends Personagem{

    private String sprite;

    public Jogador(int posx, int posy) {
        super(posx, posy);
        this.sprite = "🧢";
    }

    @Override
    public String getSprite() {
        return this.sprite;
    }
}
