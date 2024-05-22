import java.util.Scanner;

public class Teste {

    static class Posicao {
        int x, y;

        Posicao(int x, int y) {
            this.x = x;
            this.y = y;
        }

        void moverParaCima() {
            y--;
        }

        void moverParaBaixo() {
            y++;
        }

        void moverParaEsquerda() {
            x--;
        }

        void moverParaDireita() {
            x++;
        }

        @Override
        public String toString() {
            return "Posição atual do jogador: (" + x + ", " + y + ")";
        }
    }

    enum Direcao {
        CIMA, BAIXO, ESQUERDA, DIREITA, PARAR
    }

    static class Movimento implements Runnable {
        private final Posicao jogador;
        private Direcao direcao = Direcao.PARAR;

        Movimento(Posicao jogador) {
            this.jogador = jogador;
        }

        void setDirecao(Direcao direcao) {
            this.direcao = direcao;
        }

        @Override
        public void run() {
            while (true) {
                switch (direcao) {
                    case CIMA:
                        jogador.moverParaCima();
                        break;
                    case BAIXO:
                        jogador.moverParaBaixo();
                        break;
                    case ESQUERDA:
                        jogador.moverParaEsquerda();
                        break;
                    case DIREITA:
                        jogador.moverParaDireita();
                        break;
                    case PARAR:
                        break;
                }
                System.out.println(jogador);
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Posicao jogador = new Posicao(0, 0);
        Movimento movimento = new Movimento(jogador);

        Thread movimentoThread = new Thread(movimento);
        movimentoThread.start();

        while (true) {
            System.out.println("Digite a direção (w para cima, s para baixo, a para esquerda, d para direita, q para sair): ");
            String entrada = scanner.nextLine();

            switch (entrada) {
                case "w":
                    movimento.setDirecao(Direcao.CIMA);
                    break;
                case "s":
                    movimento.setDirecao(Direcao.BAIXO);
                    break;
                case "a":
                    movimento.setDirecao(Direcao.ESQUERDA);
                    break;
                case "d":
                    movimento.setDirecao(Direcao.DIREITA);
                    break;
                case "q":
                    movimento.setDirecao(Direcao.PARAR);
                    movimentoThread.interrupt();
                    System.out.println("Saindo do jogo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Movimento inválido! Tente novamente.");
            }
        }
    }
}
