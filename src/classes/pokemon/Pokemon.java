package classes.pokemon;

public abstract class Pokemon {
    private String nome;
    private String tipo;
    private String ataque;
    private int nivel;
    private int velocidade;
    private int hp;
    private String fraqueza;
    private int forca;

    public Pokemon(String nome, String tipo, String ataque, int nivel, int velocidade, int hp, String fraqueza, int forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.ataque = ataque;
        this.forca = forca;
        this.nivel = nivel;
        this.velocidade = velocidade;
        this.hp = hp;
        this.fraqueza = fraqueza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void subirNivel() {
        this.nivel++;
        this.hp *= 1.1;
        this.velocidade *= 1.1;
        this.forca *= 1.1;
    }
}