import java.util.List;
import classes.cenario.Porta;
import classes.personagem.Jogador;

public class Movimentacao {

    public static class Posicao {
        private Jogador jogador;
        private List<Porta> portas;
        private Tabuleiro tabuleiro;

        public Posicao(Jogador jogador, List<Porta> portas, Tabuleiro tabuleiro) {
            this.jogador = jogador;
            this.portas = portas;
            this.tabuleiro = tabuleiro;
        }

        public void moverParaCima() {
            if (tabuleiro.tabuleiro[jogador.getPosx() - 1][jogador.getPosy()].isAndavel()) {
                jogador.setPosx(jogador.getPosx() - 1);
            }
            for (Porta porta : portas) {
                if (jogador.getPosx() == porta.getPosx() && jogador.getPosy() == porta.getPosy()) {
                    jogador.setPosx(porta.getJposx());
                    jogador.setPosy(porta.getJposy());
                }
            }
            tabuleiro.imprimirTabuleiro(jogador);  
        }

        public void moverParaBaixo() {
            if (tabuleiro.tabuleiro[jogador.getPosx() + 1][jogador.getPosy()].isAndavel()) {
                jogador.setPosx(jogador.getPosx() + 1);
            }
            for (Porta porta : portas) {
                if (jogador.getPosx() == porta.getPosx() && jogador.getPosy() == porta.getPosy()) {
                    jogador.setPosx(porta.getJposx());
                    jogador.setPosy(porta.getJposy());
                }
            }
            tabuleiro.imprimirTabuleiro(jogador); 
        }

        public void moverParaEsquerda() {
            if (tabuleiro.tabuleiro[jogador.getPosx()][jogador.getPosy() - 1].isAndavel()) {
                jogador.setPosy(jogador.getPosy() - 1);
            }
            tabuleiro.imprimirTabuleiro(jogador);  
        }

        public void moverParaDireita() {
            if (tabuleiro.tabuleiro[jogador.getPosx()][jogador.getPosy() + 1].isAndavel()) {
                jogador.setPosy(jogador.getPosy() + 1);
            }
            tabuleiro.imprimirTabuleiro(jogador); 
        }

        @Override
        public String toString() {
            return "Posição atual do jogador: (" + jogador.getPosx() + ", " + jogador.getPosy() + ")";
        }
    }

    public enum Direcao {
        CIMA, BAIXO, ESQUERDA, DIREITA, PARAR
    }

    public static class Movimento implements Runnable {
        private Direcao direcao = Direcao.PARAR;
        private Posicao posicao;

        public Movimento(Posicao posicao) {
            this.posicao = posicao;
        }

        public void setDirecao(Direcao direcao) {
            this.direcao = direcao;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                switch (direcao) {
                    case CIMA:
                        posicao.moverParaCima();
                        break;
                    case BAIXO:
                        posicao.moverParaBaixo();
                        break;
                    case ESQUERDA:
                        posicao.moverParaEsquerda();
                        break;
                    case DIREITA:
                        posicao.moverParaDireita();
                        break;
                    case PARAR:
                        break;
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
