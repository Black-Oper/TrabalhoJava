import Classes.Caminho;
import Classes.Chao;
import Classes.Jogador;
import Classes.Objetos;
import Classes.Parede;
import Classes.Porta;
import Classes.Elemento;
import Classes.Grama;

public class Tabuleiro {

    public Elemento[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new Elemento[100][100];
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = new Chao(i, j, "🟩");
            }
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (i < 5 || i >= tabuleiro.length - 5 || j < 5 || j >= tabuleiro[i].length - 5) {
                    tabuleiro[i][j] = new Classes.Parede(i, j, "🍀");
                }
            }
        }

        // preencher da coordenada [34][0] ate [38][99] com parede
        for (int i = 34; i < 39; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = new Classes.Parede(i, j, "🍀");
            }
        }

        // preencher da coordenada [0][0] ate [33][99] com parede
        for (int i = 0; i < 34; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = new Classes.Parede(i, j, "⬛");
            }
        }

        //arbustos - cidade1
        tabuleiro[92][90] = new Grama(90, 92);
        tabuleiro[92][89] = new Grama(89, 92);
        tabuleiro[92][88] = new Grama(88, 92);
        tabuleiro[91][89] = new Grama(89, 91);
        tabuleiro[91][90] = new Grama(90, 91);
        tabuleiro[88][92] = new Grama(92, 88);
        tabuleiro[88][91] = new Grama(0, 0);
        tabuleiro[87][92] = new Grama(0, 0);
        tabuleiro[87][91] = new Grama(0, 0);
        tabuleiro[86][92] = new Grama(0, 0);
        tabuleiro[84][89] = new Grama(0, 0);
        tabuleiro[83][89] = new Grama(0, 0);
        tabuleiro[83][89] = new Grama(0, 0);
        tabuleiro[83][88] = new Grama(0, 0);
        tabuleiro[83][87] = new Grama(0, 0);
        tabuleiro[82][89] = new Grama(0, 0);
        tabuleiro[82][88] = new Grama(0, 0);
        tabuleiro[82][87] = new Grama(0, 0);
        for (int i = 86; i < 93; i++) {
            for (int j = 73; j < 78; j++) {
                tabuleiro[i][j] = new Grama(i, j);
            }
        }

        //casa1 - cidade1
        tabuleiro[89][87] = new Parede(0, 0, "⬜");
        tabuleiro[89][86] = new Parede(0, 0, "⬜");
        tabuleiro[89][85] = new Porta(0, 0, 10, 7);
        tabuleiro[89][84] = new Parede(0, 0, "⬜");
        tabuleiro[89][83] = new Parede(0, 0, "⬜");

        tabuleiro[88][87] = new Parede(0, 0, "⬜");
        tabuleiro[88][86] = new Parede(0, 0, "⬜");
        tabuleiro[88][85] = new Parede(0, 0, "⬜");
        tabuleiro[88][84] = new Parede(0, 0, "⬜");
        tabuleiro[88][83] = new Parede(0, 0, "⬜");

        tabuleiro[87][87] = new Parede(0, 0, "🟥");
        tabuleiro[87][86] = new Parede(0, 0, "🟥");
        tabuleiro[87][85] = new Parede(0, 0, "🟥");
        tabuleiro[87][84] = new Parede(0, 0, "🟥");
        tabuleiro[87][83] = new Parede(0, 0, "🟥");

        tabuleiro[86][87] = new Parede(0, 0, "🟥");
        tabuleiro[86][86] = new Parede(0, 0, "🟥");
        tabuleiro[86][85] = new Parede(0, 0, "🟥");
        tabuleiro[86][84] = new Parede(0, 0, "🟥");
        tabuleiro[86][83] = new Parede(0, 0, "🟥");

        // casa1 - cidade1 - interior
        for (int i = 5; i < 10; i++) {
            for (int j = 5; j < 11; j++) {
                tabuleiro[i][j] = new Chao(i, j, "🟧");
            }
        }
        tabuleiro[6][6] = new Parede(0, 0, "🍁");
        tabuleiro[10][7] = new Porta(0, 0, 90, 85);

        // baboratorio - cidade1
        tabuleiro[80][83] = new Parede(0, 0, "⬜");
        tabuleiro[80][82] = new Parede(0, 0, "⬜");
        tabuleiro[80][81] = new Parede(0, 0, "⬜");
        tabuleiro[80][80] = new Porta(0, 0, 15, 19);
        tabuleiro[80][79] = new Parede(0, 0, "⬜");
        tabuleiro[80][78] = new Parede(0, 0, "⬜");
        tabuleiro[80][77] = new Parede(0, 0, "⬜");

        tabuleiro[79][83] = new Parede(0, 0, "⬜");
        tabuleiro[79][82] = new Parede(0, 0, "⬜");
        tabuleiro[79][81] = new Parede(0, 0, "⬜");
        tabuleiro[79][80] = new Parede(0, 0, "⬜");
        tabuleiro[79][79] = new Parede(0, 0, "⬜");
        tabuleiro[79][78] = new Parede(0, 0, "⬜");
        tabuleiro[79][77] = new Parede(0, 0, "⬜");

        tabuleiro[78][83] = new Parede(0, 0, "⬜");
        tabuleiro[78][82] = new Parede(0, 0, "⬜");
        tabuleiro[78][81] = new Parede(0, 0, "⬜");
        tabuleiro[78][80] = new Parede(0, 0, "⬜");
        tabuleiro[78][79] = new Parede(0, 0, "⬜");
        tabuleiro[78][78] = new Parede(0, 0, "⬜");
        tabuleiro[78][77] = new Parede(0, 0, "⬜");

        tabuleiro[77][83] = new Parede(0, 0, "🟥");
        tabuleiro[77][82] = new Parede(0, 0, "🟥");
        tabuleiro[77][81] = new Parede(0, 0, "🟥");
        tabuleiro[77][80] = new Parede(0, 0, "🟥");
        tabuleiro[77][79] = new Parede(0, 0, "🟥");
        tabuleiro[77][78] = new Parede(0, 0, "🟥");
        tabuleiro[77][77] = new Parede(0, 0, "🟥");

        tabuleiro[76][83] = new Parede(0, 0, "🟥");
        tabuleiro[76][82] = new Parede(0, 0, "🟥");
        tabuleiro[76][81] = new Parede(0, 0, "🟥");
        tabuleiro[76][80] = new Parede(0, 0, "🟥");
        tabuleiro[76][79] = new Parede(0, 0, "🟥");
        tabuleiro[76][78] = new Parede(0, 0, "🟥");
        tabuleiro[76][77] = new Parede(0, 0, "🟥");

        // laboratiorio - cidade1 - interior
        for (int i = 5; i < 16; i++) {
            for (int j = 16; j < 23; j++) {
                tabuleiro[i][j] = new Chao(i, j, "🔳");
            }
        }
        tabuleiro[16][19] = new Porta(0, 0, 81, 80);

        //caminho - cidade1
        tabuleiro[90][85] = new Caminho(0, 0);
        tabuleiro[91][85] = new Caminho(0, 0);
        tabuleiro[91][84] = new Caminho(0, 0);
        tabuleiro[91][83] = new Caminho(0, 0);
        tabuleiro[91][82] = new Caminho(0, 0);
        tabuleiro[91][81] = new Caminho(0, 0);
        tabuleiro[91][80] = new Caminho(0, 0);
        tabuleiro[90][80] = new Caminho(0, 0);
        tabuleiro[89][80] = new Caminho(0, 0);
        tabuleiro[88][80] = new Caminho(0, 0);
        tabuleiro[87][80] = new Caminho(0, 0);
        tabuleiro[86][80] = new Caminho(0, 0);
        tabuleiro[85][80] = new Caminho(0, 0);
        tabuleiro[84][80] = new Caminho(0, 0);
        tabuleiro[83][80] = new Caminho(0, 0);
        tabuleiro[82][80] = new Caminho(0, 0);
        tabuleiro[81][80] = new Caminho(0, 0);
        tabuleiro[83][79] = new Caminho(0, 0);
        tabuleiro[83][78] = new Caminho(0, 0);
        tabuleiro[83][77] = new Caminho(0, 0);
        tabuleiro[83][76] = new Caminho(0, 0);
        tabuleiro[83][75] = new Caminho(0, 0);
        tabuleiro[83][74] = new Caminho(0, 0);
        tabuleiro[83][73] = new Caminho(0, 0);
        tabuleiro[83][72] = new Caminho(0, 0);
        tabuleiro[83][71] = new Caminho(0, 0);
        tabuleiro[83][70] = new Caminho(0, 0);

        // arvores - cidade1
        for (int i = 70; i < 81; i++) {
            for (int j = 86; j < 95; j++) {
                tabuleiro[i][j] = new Parede(i, j, "🍀");
            }
        }

        for (int i = 70; i < 75; i++) {
            for (int j = 75; j < 86; j++) {
                tabuleiro[i][j] = new Parede(i, j, "🍀");
            }
        }

        for (int i = 70; i < 81; i++) {
            for (int j = 72; j < 75; j++) {
                tabuleiro[i][j] = new Parede(i, j, "🍀");
            }
        }

        for (int i = 78; i < 81; i++) {
            for (int j = 66; j < 72; j++) {
                tabuleiro[i][j] = new Parede(i, j, "🍀");
            }
        }

        for (int i = 86; i < 95; i++) {
            for (int j = 66; j < 71; j++) {
                tabuleiro[i][j] = new Parede(i, j, "🍀");
            }
        }
    }

    public void imprimirTabuleiro(Jogador jogador) {
        for (int i = jogador.getPosx() - 5; i < jogador.getPosx() + 6; i++) {
            for (int j = jogador.getPosy() - 5; j < jogador.getPosy() + 6; j++) {
                System.out.print(tabuleiro[i][j].getSprite());
            }
            System.out.println();
        }
    }
    
    // public void imprimirTabuleiro(Jogador jogador) {
    //     for (int i = 0; i < tabuleiro.length; i++) {
    //         for (int j = 0; j < tabuleiro[i].length; j++) {
    //             if (i == jogador.getPosx() && j == jogador.getPosy()) {
    //                 System.out.print(jogador.getSprite());
    //             } else {
    //                 System.out.print(tabuleiro[i][j].getSprite());
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
}
