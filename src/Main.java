import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import classes.personagem.Jogador;
import classes.cenario.HudInicial;
import classes.cenario.Porta;

public class Main {

    public static void clearScreen() {
        for (int i = 0; i < 50; i++)
            System.out.println();
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        if (EstadoJogo.arquivoNaoExiste()) {
            EstadoJogo.criarArquivo();
        }

        HudInicial hudInicial = new HudInicial();
        hudInicial.menuDashboard();


        int escolha = leitor.nextInt();
        leitor.nextLine(); // Consome a nova linha após o número

        Jogador jogador = new Jogador(6, 7);

        if (escolha == 2) {
            Jogador progresso;
            progresso = EstadoJogo.carregarProgresso();
            if (progresso != null) {
                jogador = progresso;
            }
        }

        if (escolha == 3) {
            System.out.println("Saindo do jogo...");
            System.exit(0);
        } else if (escolha != 1 && escolha != 2) {
            System.out.println("Opção inválida!");
            System.exit(0);
        }

        Tabuleiro tabuleiro = new Tabuleiro();
        List<Porta> portas = new ArrayList<>();

        Tabuleiro originalTabuleiro = new Tabuleiro();

        Movimentacao.Posicao posicao = new Movimentacao.Posicao(jogador, portas, tabuleiro);
        Movimentacao.Movimento movimento = new Movimentacao.Movimento(posicao);
        Thread movimentoThread = new Thread(movimento);
        movimentoThread.start();

        do {

            // System.out.println("Digite a direção (w para cima, s para baixo, a para
            // esquerda, d para direita, q para parar): ");
            String entrada = leitor.nextLine();

            switch (entrada) {
                case "w":
                    // movimento.setDirecao(Movimentacao.Direcao.CIMA);
                    if (tabuleiro.tabuleiro[jogador.getPosx() - 1][jogador.getPosy()].isAndavel()) {
                        jogador.setPosx(jogador.getPosx() - 1);
                    }
                    break;
                case "s":
                    // movimento.setDirecao(Movimentacao.Direcao.BAIXO);
                    if (tabuleiro.tabuleiro[jogador.getPosx() + 1][jogador.getPosy()].isAndavel()) {
                        jogador.setPosx(jogador.getPosx() + 1);
                    }
                    break;
                case "a":
                    // movimento.setDirecao(Movimentacao.Direcao.ESQUERDA);
                    if (tabuleiro.tabuleiro[jogador.getPosx()][jogador.getPosy() - 1].isAndavel()) {
                        jogador.setPosy(jogador.getPosy() - 1);
                    }
                    break;
                case "d":
                    // movimento.setDirecao(Movimentacao.Direcao.DIREITA);
                    if (tabuleiro.tabuleiro[jogador.getPosx()][jogador.getPosy() + 1].isAndavel()) {
                        jogador.setPosy(jogador.getPosy() + 1);
                    }
                    break;
                case "m":
                    jogador.getMochila().acessarMochila(jogador);
                    break;
                case "p":
                    tabuleiro.acessarPokemon(jogador);
                    break;
                case "S":
                    System.out.println("Salvando seu progresso...");
                    EstadoJogo.salvarProgresso(jogador);
                break;
                // case "q":
                // movimento.setDirecao(Movimentacao.Direcao.PARAR);
                // break;
                default:
                    System.out.println("Movimento inválido! Tente novamente.");
            }
            clearScreen();
            originalTabuleiro.colisaoTreinador(jogador);
            originalTabuleiro.verificarGrama(jogador);
            originalTabuleiro.colisaoPorta(jogador);
            originalTabuleiro.colisaoEscolherPokemon(jogador);
            originalTabuleiro.imprimirTabuleiro(jogador);
            originalTabuleiro.acessarCuradorECurarPokemons(jogador);
        } while (true);
    }
}
