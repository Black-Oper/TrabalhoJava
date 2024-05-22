import java.util.*;

import classes.cenario.Grama;
import classes.cenario.Porta;
import classes.personagem.Jogador;

public class Main {

    public static void clearScreen() {
        for(int i = 0; i < 50; i++)
            System.out.println();
    }

    public static void main(String[] args){

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
        
        tabuleiro.tabuleiro[jogador.getPosx()][jogador.getPosy()] = jogador;
        
        do {
            clearScreen();
            tabuleiro.imprimirTabuleiro(jogador);
            originalTabuleiro.verificarGrama(jogador);
            
            System.out.println("Digite a direção que deseja mover o jogador: ");
            String direcao = leitor.nextLine();
            
            switch (direcao) {
                case "w":
                if (tabuleiro.tabuleiro[jogador.getPosx() - 1][jogador.getPosy()].isAndavel()) {
                    jogador.setPosx(jogador.getPosx() - 1);
                }
                // se colidir com alguma porta ir para o lugar da porta
                for (Porta porta : portas) {
                    if (jogador.getPosx() == porta.getPosx() && jogador.getPosy() == porta.getPosy()) {
                        jogador.setPosx(porta.getJposx());
                        jogador.setPosy(porta.getJposy());
                    }
                }
                break;
                case "s":
                if (tabuleiro.tabuleiro[jogador.getPosx() + 1][jogador.getPosy()].isAndavel()) {
                    jogador.setPosx(jogador.getPosx() + 1);
                }
                for (Porta porta : portas) {
                    if (jogador.getPosx() == porta.getPosx() && jogador.getPosy() == porta.getPosy()) {
                        jogador.setPosx(porta.getJposx());
                        jogador.setPosy(porta.getJposy());
                    }
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
    }
}
