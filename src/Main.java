import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

<<<<<<< Updated upstream
=======
import classes.cenario.Chao;
import classes.cenario.PokemonEscolher;
>>>>>>> Stashed changes
import classes.cenario.Porta;
import classes.personagem.Jogador;
import classes.pokemon.Pokemon;
import classes.pokemon.pokemonList.Bulbassaur;
import classes.pokemon.pokemonList.Charmander;
import classes.pokemon.pokemonList.Squirtle;

public class Main {

    public static void clearScreen() {
        for (int i = 0; i < 50; i++)
            System.out.println();
    }

<<<<<<< Updated upstream
    public static void main(String[] args) {
        List<Porta> portas = new ArrayList<>();
        portas.add(new Porta(89, 85, 9, 7));
        portas.add(new Porta(10, 7, 90, 85));
        portas.add(new Porta(16, 19, 81, 80));
        portas.add(new Porta(80, 80, 15, 19));

        Scanner leitor = new Scanner(System.in);

        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogador = new Jogador(6, 7);

        Tabuleiro originalTabuleiro = new Tabuleiro();
=======
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);


        Tabuleiro tabuleiro = new Tabuleiro();

        Jogador jogador = new Jogador(6, 7);

        Tabuleiro originalTabuleiro = new Tabuleiro();

>>>>>>> Stashed changes
        for (int i = 0; i < tabuleiro.tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.tabuleiro[i].length; j++) {
                originalTabuleiro.tabuleiro[i][j] = tabuleiro.tabuleiro[i][j];
            }
        }

<<<<<<< Updated upstream
        Movimentacao.Posicao posicao = new Movimentacao.Posicao(jogador, portas, tabuleiro);
        Movimentacao.Movimento movimento = new Movimentacao.Movimento(posicao);

        Thread movimentoThread = new Thread(movimento);
        movimentoThread.start();

        while (true) {
            System.out.println("Digite a direção (w para cima, s para baixo, a para esquerda, d para direita, q para sair): ");
            String entrada = leitor.nextLine();

            switch (entrada) {
                case "w":
                    movimento.setDirecao(Movimentacao.Direcao.CIMA);
                    break;
                case "s":
                    movimento.setDirecao(Movimentacao.Direcao.BAIXO);
                    break;
                case "a":
                    movimento.setDirecao(Movimentacao.Direcao.ESQUERDA);
                    break;
                case "d":
                    movimento.setDirecao(Movimentacao.Direcao.DIREITA);
                    break;
                case "q":
                    movimento.setDirecao(Movimentacao.Direcao.PARAR);
                    break;
                default:
                    System.out.println("Movimento inválido! Tente novamente.");
            }
        }
=======
        tabuleiro.tabuleiro[jogador.getPosx()][jogador.getPosy()] = jogador;

        do {
            clearScreen();
            tabuleiro.imprimirTabuleiro(jogador);
            originalTabuleiro.verificarGrama(jogador);
            originalTabuleiro.colisaoPorta(jogador);
            originalTabuleiro.colisaoEscolherPokemon(jogador);

            System.out.println("Digite a direção que deseja mover o jogador: ");
            String direcao = leitor.nextLine();

            switch (direcao) {
                case "w":
                    if (tabuleiro.tabuleiro[jogador.getPosx() - 1][jogador.getPosy()].isAndavel()) {
                        jogador.setPosx(jogador.getPosx() - 1);
                    }
                    break;
                case "s":
                    if (tabuleiro.tabuleiro[jogador.getPosx() + 1][jogador.getPosy()].isAndavel()) {
                        jogador.setPosx(jogador.getPosx() + 1);
                    }
                    break;
                case "a":
                    if (tabuleiro.tabuleiro[jogador.getPosx()][jogador.getPosy() - 1].isAndavel()) {
                        jogador.setPosy(jogador.getPosy() - 1);
                    }
                    break;
                case "d":
                    if (tabuleiro.tabuleiro[jogador.getPosx()][jogador.getPosy() + 1].isAndavel()) {
                        jogador.setPosy(jogador.getPosy() + 1);
                    }
                    break;
            }

            for (int i = 0; i < originalTabuleiro.tabuleiro.length; i++) {
                for (int j = 0; j < originalTabuleiro.tabuleiro[i].length; j++) {
                    tabuleiro.tabuleiro[i][j] = originalTabuleiro.tabuleiro[i][j];
                }
            }
            tabuleiro.tabuleiro[jogador.getPosx()][jogador.getPosy()] = jogador;



        } while (true);
>>>>>>> Stashed changes
    }
}