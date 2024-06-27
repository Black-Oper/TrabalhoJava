import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import classes.personagem.Jogador;
import classes.cenario.Porta;

public class Main {

    public static void clearScreen() {
        for (int i = 0; i < 50; i++)
            System.out.println();
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogador;
        List<Porta> portas = new ArrayList<>();

        /* Bifurca o programa , em um dos caminhos possíveis o arquivo não existe e então o jogador é posicionado na posição (6,7).
        No outro cenário o jogador é criado com base nos dados vindos diretamente do arquivo salvar.dat.
        */
        Jogador progresso;
        if (EstadoJogo.arquivoNaoExiste()) {
            EstadoJogo.criarArquivo();
            jogador = new Jogador(6, 7);
        } else {
            progresso = EstadoJogo.carregarProgresso();
            if (progresso != null) {
                jogador = progresso;
            } else {
                jogador = new Jogador(6, 7);
            }
        }

        Tabuleiro originalTabuleiro = new Tabuleiro();

        Movimentacao.Posicao posicao = new Movimentacao.Posicao(jogador, portas, tabuleiro);
        Movimentacao.Movimento movimento = new Movimentacao.Movimento(posicao);
        Thread movimentoThread = new Thread(movimento);
        movimentoThread.start();


        do {
            clearScreen();
            tabuleiro.imprimirTabuleiro(jogador);
            originalTabuleiro.verificarGrama(jogador);
            originalTabuleiro.colisaoPorta(jogador);
            originalTabuleiro.colisaoEscolherPokemon(jogador);

            System.out.println("Digite a direção (w para cima, s para baixo, a para esquerda, d para direita, q para parar, S para salvar seu progresso): ");
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
                case "S":
                    EstadoJogo.salvarProgresso(jogador);
                    System.out.println("Salvando seu progresso, aguarde um pouquinho.");
                break;
                default:
                    System.out.println("Movimento inválido! Tente novamente.");
            }        } while (true);
    }
}
