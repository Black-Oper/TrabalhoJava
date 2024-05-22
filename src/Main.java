import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.cenario.Porta;
import classes.personagem.Jogador;

public class Main {

    public static void clearScreen() {
        for (int i = 0; i < 50; i++)
            System.out.println();
    }

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
        for (int i = 0; i < tabuleiro.tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.tabuleiro[i].length; j++) {
                originalTabuleiro.tabuleiro[i][j] = tabuleiro.tabuleiro[i][j];
            }
        }

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
    }
}
