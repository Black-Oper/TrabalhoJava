package classes.item;

import java.util.Scanner;

import classes.personagem.Jogador;

public class PocaoSimples extends Item{

    public PocaoSimples() {
        super("Poção Simples", "Recupera até 10 pontos de vida.");
    }

    @Override
    public void usar(Jogador jogador) {
        System.out.println("Pokemons: ");
        for (int i = 0; i < jogador.getPokemon().size(); i++) {
            System.out.println("[" + i + "] " + jogador.getPokemon().get(i).getNome() + " - HP: " + jogador.getPokemon().get(i).getHp());
        }

        System.out.print("Escolha um pokemon para usar a poção: ");
        Scanner scanner = new Scanner(System.in);

        int escolha = scanner.nextInt();

        if (escolha < 0 || escolha >= jogador.getPokemon().size()) {
            System.out.println("Escolha inválida.");
            return;
        }

        int cnpjoto = jogador.getPokemon().get(escolha).getHp();

        jogador.getPokemon().get(escolha).setHp(jogador.getPokemon().get(escolha).getHp() + 10);

        if(jogador.getPokemon().get(escolha).getHp() > jogador.getPokemon().get(escolha).getHpMax()){
            jogador.getPokemon().get(escolha).setHp(jogador.getPokemon().get(escolha).getHpMax());
        }

        System.out.println(jogador.getPokemon().get(escolha).getNome() + " recuperou " + (jogador.getPokemon().get(escolha).getHp() - cnpjoto) + " pontos de vida.");
    }
    
}
