package classes.pokemon;

public class PokemonLutador extends Pokemon{

    public PokemonLutador(String nome, String ataque, int nivel, int velocidade, int hp, int forca) {
        super(nome, "Lutador", ataque, nivel, velocidade, hp, "Voador", forca);
    }
}