import classes.cenario.*;
import classes.personagem.Jogador;
import classes.pokemon.Pokemon;
import classes.pokemon.pokemonList.Bulbassaur;
import classes.pokemon.pokemonList.Charmander;
import classes.pokemon.pokemonList.Squirtle;

import java.util.List;

import java.util.ArrayList;
import java.util.Random;

public class Tabuleiro {

    public Elemento[][] tabuleiro;
    public List<Integer> posXGrama = new ArrayList<Integer>();
    public List<Integer> posYGrama = new ArrayList<Integer>();

    public Tabuleiro() {
        tabuleiro = new Elemento[100][100];
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = new Chao("\u001B[42m"  + "🟩" + "\u001B[0m");
            }
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (i < 5 || i >= tabuleiro.length - 5 || j < 5 || j >= tabuleiro[i].length - 5) {
                    tabuleiro[i][j] = new classes.cenario.Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
                }
            }
        }

        // preencher da coordenada [34][0] ate [38][99] com parede
        for (int i = 34; i < 39; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = new classes.cenario.Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
            }
        }


       // preencher da coordenada [0][0] ate [33][99] com parede
       for (int i = 0; i < 34; i++) {
        for (int j = 0; j < tabuleiro[i].length; j++) {
            tabuleiro[i][j] = new classes.cenario.Parede("\u001B[40m"  + "⬛" + "\u001B[0m");
        }
    }
    

    //arbustos - cidade1
    tabuleiro[92][90] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[92][89] = new Grama( "\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[92][88] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[91][89] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[91][90] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[88][92] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[88][91] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[87][92] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[87][91] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[86][92] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[84][89] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[83][89] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[83][89] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[83][88] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[83][87] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[82][89] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[82][88] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[82][87] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    for (int i = 86; i < 93; i++){
        for (int j = 73; j < 78; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 81; i <= 85; i++) {
        for (int j = 66; j <= 67; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 79; i <= 80; i++) {
        for (int j = 61; j <= 65; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 74; i <= 75; i++) {
        for (int j = 63; j <= 65; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    tabuleiro[76][64] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[76][65] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    tabuleiro[83][61] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[84][61] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[85][61] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[84][62] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[85][62] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[85][63] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    for (int i = 76; i <= 77; i++) {
        for (int j = 68; j <= 71; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 74; i <= 75; i++) {
        for (int j = 70; j <= 71; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 70; i <= 71; i++) {
        for (int j = 68; j <= 71; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    tabuleiro[72][68] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[72][69] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[72][70] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    for (int i = 66; i <= 71; i++) {
        for (int j = 63; j <= 65; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 69; i <= 71; i++) {
        for (int j = 53; j <= 60; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 66; i <= 68; i++) {
        for (int j = 58; j <= 60; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    tabuleiro[68][53] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[68][54] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[68][55] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    for (int i = 72; i <= 75; i++) {
        for (int j = 56; j <= 57; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 76; i <= 77; i++) {
        for (int j = 55; j <= 58; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 81; i <= 82; i++) {
        for (int j = 53; j <= 54; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    tabuleiro[82][55] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    for (int i = 85; i <= 86; i++) {
        for (int j = 53; j <= 58; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    //arbustos - cidade2
    for (int i = 84; i <= 86; i++) {
        for (int j = 45; j <= 47; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 78; i <= 79; i++) {
        for (int j = 46; j <= 48; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    tabuleiro[77][47] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[77][48] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[77][49] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[78][49] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    for (int i = 91; i <= 93; i++) {
        for (int j = 37; j <= 40; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }

        for (int j = 28; j <= 32; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 83; i <= 86; i++) {
        for (int j = 23; j <= 25; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 81; i <= 90; i++) {
        for (int j = 7; j <= 9; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 81; i <= 83; i++) {
        for (int j = 10; j <= 12; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 73; i <= 76; i++) {
        for (int j = 15; j <= 17; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 71; i <= 72; i++) {
        for (int j = 9; j <= 12; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 70; i <= 73; i++) {
        for (int j = 5; j <= 7; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    tabuleiro[69][6] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[69][7] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    tabuleiro[76][11] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[76][12] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    for (int i = 62; i <= 63; i++) {
        for (int j = 5; j <= 7; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 64; i <= 66; i++) {
        for (int j = 5; j <= 10; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int j = 6; j <= 10; j++) {
        tabuleiro[67][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    }

    for (int i = 57; i <= 58; i++) {
        for (int j = 7; j <= 10; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 57; i <= 67; i++) {
        for (int j = 12; j <= 13; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 57; i <= 62; i++) {
        for (int j = 16; j <= 19; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 66; i <= 67; i++) {
        for (int j = 16; j <= 22; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int j = 19; j <= 22; j++) {
        tabuleiro[68][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    }

    for (int i = 69; i <= 70; i++) {
        for (int j = 19; j <= 20; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    // arbustos - cidade3
    for (int i = 48; i <= 49; i++) {
        for (int j = 9; j <= 11; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 53; i <= 54; i++) {
        for (int j = 17; j <= 25; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 48; i <= 49; i++) {
        for (int j = 21; j <= 23; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    tabuleiro[47][21] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[47][22] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    for (int i = 41; i <= 44; i++) {
        for (int j = 18; j <= 19; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    tabuleiro[43][20] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[44][20] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    for (int i = 39; i <= 40; i++) {
        for (int j = 32; j <= 34; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
        for (int j = 39; j <= 40; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 44; i <= 45; i++) {
        for (int j = 32; j <= 35; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 41; i <= 42; i++) {
        for (int j = 38; j <= 40; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 43; i <= 45; i++) {
        for (int j = 43; j <= 47; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 39; i <= 41; i++) {
        for (int j = 48; j <= 49; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 42; i <= 44; i++) {
        for (int j = 50; j <= 51; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    // arbustos - cidade4
    for (int i = 43; i <= 46; i++) {
        for (int j = 56; j <= 57; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 49; i <= 53; i++) {
        for (int j = 53; j <= 54; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 50; i <= 52; i++) {
        for (int j = 57; j <= 59; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 53; i <= 54; i++) {
        for (int j = 44; j <= 46; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int j = 44; j <= 45; j++) {
        tabuleiro[55][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    }

    for (int j = 35; j <= 39; j++) {
        tabuleiro[48][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    }

    for (int j = 49; j <= 54; j++) {
        tabuleiro[j][35] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    }

    for (int i = 66; i <= 68; i++) {
        for (int j = 47; j <= 50; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 61; i <= 62; i++) {
        for (int j = 63; j <= 65; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 59; i <= 61; i++) {
        for (int j = 69; j <= 71; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    tabuleiro[61][62] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[59][72] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
    tabuleiro[60][72] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");

    for (int i = 57; i <= 58; i++) {
        for (int j = 76; j <= 79; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    for (int i = 55; i <= 56; i++) {
        for (int j = 78; j <= 79; j++) {
            tabuleiro[i][j] = new Grama("\u001B[42m"  + "🌾" + "\u001B[0m");
        }
    }

    // rio1
    for (int i = 86; i <= 87; i++) {
        for (int j = 30; j <= 35; j++) {
            tabuleiro[i][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
        }
    }

    for (int j = 31; j <= 34; j++) {
        tabuleiro[85][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }

    for (int j = 31; j <= 38; j++) {
        tabuleiro[88][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }

    for (int j = 34; j <= 38; j++) {
        tabuleiro[89][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }

    tabuleiro[87][36] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[87][37] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");

    // rio2
    for (int j = 63; j <= 64; j++) {
        tabuleiro[53][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 63; j <= 64; j++) {
        tabuleiro[54][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 63; j <= 64; j++) {
        tabuleiro[55][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 61; j <= 64; j++) {
        tabuleiro[56][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 60; j <= 63; j++) {
        tabuleiro[58][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 58; j <= 62; j++) {
        tabuleiro[59][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 48; j <= 60; j++) {
        tabuleiro[60][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 43; j <= 59; j++) {
        tabuleiro[61][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 42; j <= 50; j++) {
        tabuleiro[62][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 40; j <= 46; j++) {
        tabuleiro[63][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 39; j <= 45; j++) {
        tabuleiro[64][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 38; j <= 44; j++) {
        tabuleiro[65][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    for (int j = 38; j <= 43; j++) {
        tabuleiro[66][j] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    }
    

    // casa1 - cidade1
    tabuleiro[89][87] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[89][86] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[89][85] = new Porta(10, 7);
    tabuleiro[89][84] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[89][83] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    for (int i = 83; i <= 87; i++) {
        tabuleiro[88][i] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    }

    for (int i = 83; i <= 87; i++) {
        tabuleiro[86][i] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
        tabuleiro[87][i] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
    }

    // casa1 - cidade1 - interior
    for (int i = 5; i < 10; i++) {
        for (int j = 5; j < 11; j++) {
            tabuleiro[i][j] = new Chao("\u001B[43m" + "\u001B[33m"  + "🟨" + "\u001B[0m");
        }
    }
    tabuleiro[6][6] = new Parede("\u001B[43m" + "\u001B[33m"  + "🍁" + "\u001B[0m");
    tabuleiro[10][7] = new Porta(90, 85);

    // laboratorio - cidade1
    tabuleiro[80][83] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[80][82] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[80][81] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[80][80] = new Porta(15, 19);
    tabuleiro[80][79] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[80][78] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[80][77] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");  

    for (int i = 77; i <= 83; i++) {
        tabuleiro[78][i] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
        tabuleiro[79][i] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    }

    for (int i = 77; i <= 83; i++) {
        tabuleiro[76][i] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
        tabuleiro[77][i] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
    }

    // laboratorio - cidade1 - interior
    for (int i = 5; i < 16; i++) {
        for (int j = 16; j < 23; j++) {
            tabuleiro[i][j] = new Chao("🔳");
        }
    }
    tabuleiro[16][19] = new Porta(81, 80);

    // pokemoncenter - cidade1
    for (int i = 91; i <= 93; i++) {
        tabuleiro[90][i] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
    }
    tabuleiro[91][91] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[91][92] = new Parede("\u001B[47m"  + "➕" + "\u001B[0m");
    tabuleiro[91][93] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[92][91] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[92][92] = new Porta(9, 31);
    tabuleiro[92][93] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    // pokemoncenter - cidade1 - interior
    for (int i = 25; i <= 27; i++) {
        for (int j = 5; j <= 7; j++) {
            tabuleiro[i][j] = new Chao("🔳");
        }
    }
    tabuleiro[28][6] = new Porta(93, 92);

    // casa1 - cidade2
    for (int i = 59; i <= 63; i++) {
        tabuleiro[88][i] = new Parede("\u001B[43m" + "🟨" + "\u001B[0m");
        tabuleiro[89][i] = new Parede("\u001B[43m" + "🟨" + "\u001B[0m");
        tabuleiro[90][i] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    }
    tabuleiro[91][59] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[91][60] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[91][61] = new Porta(9, 31);
    tabuleiro[91][62] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[91][63] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    // casa1 - cidade2 - interior
    for (int i = 5; i <= 9; i++) {
        for (int j = 28; j <= 33; j++) {
            tabuleiro[i][j] = new Chao("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
        }
    }
    //tabuleiro[6][6] = new Parede("\u001B[43m" + "\u001B[33m"  + "🍁" + "\u001B[0m");
    tabuleiro[10][31] = new Porta(92, 61);

    // casa2 - cidade2
    for (int i = 12; i <= 16; i++) {
        tabuleiro[85][i] = new Parede("\u001B[43m" + "🟨" + "\u001B[0m");
        tabuleiro[86][i] = new Parede("\u001B[43m" + "🟨" + "\u001B[0m");
        tabuleiro[87][i] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    }
    tabuleiro[88][12] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][13] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][14] = new Porta(9, 41);
    tabuleiro[88][15] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][16] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    // casa2 - cidade2 - interior
    for (int i = 5; i <= 9; i++) {
        for (int j = 39; j <= 44; j++) {
            tabuleiro[i][j] = new Chao("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
        }
    }
    //tabuleiro[6][6] = new Parede("\u001B[43m" + "\u001B[33m"  + "🍁" + "\u001B[0m");
    tabuleiro[10][41] = new Porta(89, 14);

    // laboratorio - cidade2
    tabuleiro[75][27] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[75][28] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[75][29] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[75][30] = new Porta(11, 53);
    tabuleiro[75][31] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[75][32] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[75][33] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    for (int i = 27; i <= 33; i++) {
        tabuleiro[73][i] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
        tabuleiro[74][i] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    }

    for (int i = 27; i <= 33; i++) {
        tabuleiro[71][i] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
        tabuleiro[72][i] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
    }

    // laboratorio - cidade2 - interior
    for (int i = 5; i <= 11; i++) {
        for (int j = 50; j <= 56; j++) {
            tabuleiro[i][j] = new Chao("🔳");
        }
    }
    tabuleiro[12][53] = new Porta(76, 30);

    // pokemoncenter - cidade2

    for (int i = 48; i <= 50; i++) {
        tabuleiro[86][i] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
    }
    tabuleiro[87][48] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[87][49] = new Parede("\u001B[47m"  + "➕" + "\u001B[0m");
    tabuleiro[87][50] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][48] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][49] = new Porta(15, 19);
    tabuleiro[88][50] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    // pokemoncenter - cidade2 - interior
    for (int i = 25; i <= 27; i++) {
        for (int j = 13; j <= 15; j++) {
            tabuleiro[i][j] = new Chao("🔳");
        }
    }
    tabuleiro[28][14] = new Porta(89, 49);

    // casa1 - cidade3
    for (int i = 22; i <= 26; i++) {
        tabuleiro[44][i] = new Parede("\u001B[45m" + "🟪" + "\u001B[0m");
        tabuleiro[45][i] = new Parede("\u001B[45m" + "🟪" + "\u001B[0m");
        tabuleiro[46][i] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    }
    tabuleiro[47][22] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[47][23] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[47][24] = new Porta(9, 64);
    tabuleiro[47][25] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[47][26] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    // casa1 - cidade3 - interior
    for (int i = 5; i <= 9; i++) {
        for (int j = 62; j <= 67; j++) {
            tabuleiro[i][j] = new Chao("\u001B[45m" + "🟪" + "\u001B[0m");
        }
    }
    //tabuleiro[6][6] = new Parede("\u001B[43m" + "\u001B[33m"  + "🍁" + "\u001B[0m");
    tabuleiro[10][64] = new Porta(48, 24);

    // laboratorio - cidade3
    tabuleiro[46][8] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[46][9] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[46][10] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[46][11] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[46][12] = new Porta(10, 77);
    tabuleiro[46][13] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[46][14] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[46][15] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[46][16] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    tabuleiro[45][8] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[45][9] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[45][10] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[45][11] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[45][12] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[45][13] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[45][14] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[45][15] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[45][16] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    for (int i = 8; i <= 16; i++) {
        tabuleiro[44][i] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    }

    for (int i = 8; i <= 16; i++) {
        tabuleiro[41][i] = new Parede("\u001B[45m" + "🟪" + "\u001B[0m");
        tabuleiro[42][i] = new Parede("\u001B[45m" + "🟪" + "\u001B[0m");
        tabuleiro[43][i] = new Parede("\u001B[45m" + "🟪" + "\u001B[0m");
    }

    // laboratorio - cidade3 - interior
    for (int i = 5; i <= 10; i++) {
        for (int j = 73; j <= 81; j++) {
            tabuleiro[i][j] = new Chao("🔳");
        }
    }
    tabuleiro[11][77] = new Porta(47, 12);

    // pokemoncenter - cidade3

    for (int i = 5; i <= 7; i++) {
        tabuleiro[48][i] = new Parede("\u001B[45m" + "🟪" + "\u001B[0m");
    }
    tabuleiro[49][5] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[49][6] = new Parede("\u001B[47m"  + "➕" + "\u001B[0m");
    tabuleiro[49][7] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[50][5] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[50][6] = new Porta(27, 22);
    tabuleiro[50][7] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    // pokemoncenter - cidade3 - interior
    for (int i = 25; i <= 27; i++) {
        for (int j = 21; j <= 23; j++) {
            tabuleiro[i][j] = new Chao("🔳");
        }
    }
    tabuleiro[28][22] = new Porta(51, 6);

    // laboratorio - cidade4
    for (int i = 36; i <= 42; i++) {
        tabuleiro[49][i] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    }
    tabuleiro[50][36] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[50][42] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[51][36] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[51][42] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    for (int i = 36; i <= 42; i++) {
        tabuleiro[52][i] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    }
    for (int i = 50; i <= 51; i++) {
        for (int j = 37; j <= 41; j++) {
            tabuleiro[i][j] = new Parede("\u001B[48;5;250m" + "⬜" + "\u001B[0m");
        }
    }

    tabuleiro[53][36] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[53][37] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[53][38] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[53][39] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[53][40] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[53][41] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[53][42] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");

    for (int i = 36; i <= 42; i++) {
        tabuleiro[54][i] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    }

    tabuleiro[55][36] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[55][37] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[55][38] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[55][39] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[55][40] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[55][41] = new Parede("\u001B[44m" + "🟦" + "\u001B[0m");
    tabuleiro[55][42] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");

    for (int i = 36; i <= 42; i++) {
        tabuleiro[56][i] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    }

    tabuleiro[57][36] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[57][37] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[57][38] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[57][39] = new Porta(13, 90);
    tabuleiro[57][40] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[57][41] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[57][42] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");

    // laboratorio - cidade4 - interior
    for (int i = 5; i <= 13; i++) {
        for (int j = 87; j <= 93; j++) {
            tabuleiro[i][j] = new Chao("🔳");
        }
    }
    tabuleiro[14][90] = new Porta(58, 39);

    // pokemoncenter - cidade4

    for (int i = 49; i <= 51; i++) {
        tabuleiro[53][i] = new Parede("\u001B[48;5;250m" + "⬜" + "\u001B[0m");
    }
    tabuleiro[54][49] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[54][50] = new Parede("\u001B[47m"  + "➕" + "\u001B[0m");
    tabuleiro[54][51] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[55][49] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");
    tabuleiro[55][50] = new Porta(27, 30);
    tabuleiro[55][51] = new Parede("\u001B[48;5;250m" + "📰" + "\u001B[0m");

    // pokemoncenter - cidade4 - interior
    for (int i = 25; i <= 27; i++) {
        for (int j = 29; j <= 31; j++) {
            tabuleiro[i][j] = new Chao("🔳");
        }
    }
    tabuleiro[28][30] = new Porta(56, 50);

    //caminho - cidade1
    for (int i = 90; i <= 91; i++) {
        tabuleiro[i][85] = new Caminho();
    }

    for (int j = 80; j <= 84; j++) {
        tabuleiro[91][j] = new Caminho();
    }

    for (int i = 81; i <= 90; i++) {
        tabuleiro[i][80] = new Caminho();
    }

    for (int j = 70; j <= 79; j++) {
        tabuleiro[83][j] = new Caminho();
    }

    tabuleiro[92][85] = new Caminho();

    for (int j = 85; j <= 92; j++) {
        tabuleiro[93][j] = new Caminho();
    }

    //caminho - cidade2
    tabuleiro[92][61] = new Caminho2();
    for (int i = 61; i >= 52; i--) {
        tabuleiro[93][i] = new Caminho2();
    }
    for (int i = 92; i >= 90; i--) {
        tabuleiro[i][52] = new Caminho2();
    }
    for (int i = 51; i >= 44; i--) {
        tabuleiro[90][i] = new Caminho2();
    }

    for (int i = 89; i >= 74; i--) {
        tabuleiro[i][44] = new Caminho2();
    }
    for (int i = 43; i >= 35; i--) {
        tabuleiro[74][i] = new Caminho2();
    }
    for (int i = 75; i <= 76; i++) {
        tabuleiro[i][35] = new Caminho2();
    }
    for (int i = 34; i >= 30; i--) {
        tabuleiro[76][i] = new Caminho2();
    }

    for (int i = 43; i >= 16; i--) {
        tabuleiro[82][i] = new Caminho2();
    }
    tabuleiro[81][16] = new Caminho2();
    tabuleiro[80][16] = new Caminho2();

    for (int i = 83; i <= 90; i++) {
        tabuleiro[i][22] = new Caminho2();
    }
    for (int i = 21; i >= 14; i--) {
        tabuleiro[90][i] = new Caminho2();
    }
    tabuleiro[89][14] = new Caminho2();
    tabuleiro[89][49] = new Caminho2();


    //caminho - cidade3
    for (int i = 54; i >= 47; i--) {
        tabuleiro[i][12] = new Caminho3();
    }
    
    for (int i = 13; i <= 24; i++) {
        tabuleiro[51][i] = new Caminho3();
    }

    for (int i = 48; i <= 50; i++) {
        tabuleiro[i][24] = new Caminho3();
    }

    for (int i = 25; i <= 28; i++) {
        tabuleiro[49][i] = new Caminho3();
    }

    for (int i = 42; i <= 48; i++) {
        tabuleiro[i][28] = new Caminho3();
    }

    tabuleiro[42][29] = new Caminho3();

    for (int i = 6; i <= 11; i++) {
        tabuleiro[52][i] = new Caminho3();
    }

    tabuleiro[51][6] = new Caminho3();


    //caminho - cidade4
    tabuleiro[43][53] = new Caminho4();
    tabuleiro[43][54] = new Caminho4();
    tabuleiro[58][44] = new Caminho4();
    tabuleiro[58][39] = new Caminho4();
    tabuleiro[63][35] = new Caminho4();
    tabuleiro[63][34] = new Caminho4();
    tabuleiro[56][50] = new Caminho4();
    for (int i = 43; i < 57; i++) {
        tabuleiro[i][55] = new Caminho4();
    }
    for (int i = 44; i < 61; i++) {
        tabuleiro[57][i] = new Caminho4();
    }
    for (int i = 36; i < 45; i++) {
        tabuleiro[59][i] = new Caminho4();
    }
    for (int i = 60; i < 68; i++) {
        tabuleiro[i][36] = new Caminho4();
    }
    for (int i = 27; i < 36; i++) {
        tabuleiro[67][i] = new Caminho4();
    }

    // arvores - cidade1
    for (int i = 70; i < 81; i++) {
        for (int j = 86; j < 95; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 70; i < 75; i++) {
        for (int j = 75; j < 86; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 70; i < 81; i++) {
        for (int j = 72; j < 75; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 78; i < 81; i++) {
        for (int j = 66; j < 72; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 86; i < 95; i++) {
        for (int j = 66; j < 71; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 59; i <= 65; i++) {
        tabuleiro[86][i] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        tabuleiro[87][i] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    for (int i = 74; i <= 85; i++) {
        tabuleiro[i][59] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        tabuleiro[i][60] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    for (int i = 59; i <= 67; i++) {
        tabuleiro[72][i] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        tabuleiro[73][i] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    for (int i = 70; i <= 71; i++) {
        for (int j = 61; j <= 62; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 69; i <= 71; i++) {
        for (int j = 66; j <= 67; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 66; i <= 68; i++) {
        for (int j = 56; j <= 57; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 75; i <= 77; i++) {
        for (int j = 53; j <= 54; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 64; i <= 85; i++) {
        for (int j = 51; j <= 52; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 64; i <= 70; i++) {
        for (int j = 72; j <= 94; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 64; i <= 65; i++) {
        for (int j = 53; j <= 71; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 39; i <= 63; i++) {
        for (int j = 86; j <= 94; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    // arvores - cidade2

    for (int j = 6; j <= 10; j++) {
        tabuleiro[68][j] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
    }

    for (int j = 34; j <= 50; j++) {
        tabuleiro[69][j] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
    }

    for (int j = 38; j <= 40; j++) {
        tabuleiro[43][j] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
    }

    for (int i = 78; i <= 79; i++) {
        for (int j = 24; j <= 38; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 76; i <= 77; i++) {
        for (int j = 37; j <= 38; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 77; i <= 78; i++) {
        for (int j = 18; j <= 25; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    tabuleiro[79][24] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    tabuleiro[79][25] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");

    for (int i = 74; i <= 76; i++) {
        for (int j = 20; j <= 25; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 68; i <= 73; i++) {
        for (int j = 24; j <= 25; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 69; i <= 70; i++) {
        for (int j = 21; j <= 23; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    tabuleiro[71][21] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    tabuleiro[71][22] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");

    for (int i = 68; i <= 69; i++) {
        for (int j = 26; j <= 33; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 68; i <= 70; i++) {
        for (int j = 12; j <= 18; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 67; i <= 69; i++) {
        tabuleiro[i][5] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        tabuleiro[i][11] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    for (int i = 77; i <= 78; i++) {
        for (int j = 5; j <= 14; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 74; i <= 76; i++) {
        for (int j = 5; j <= 8; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 73; i <= 75; i++) {
        for (int j = 11; j <= 12; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 59; i <= 60; i++) {
        for (int j = 7; j <= 10; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 61; i <= 63; i++) {
        for (int j = 9; j <= 10; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 59; i <= 65; i++) {
        for (int j = 14; j <= 15; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    tabuleiro[64][16] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    tabuleiro[65][16] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");

    for (int i = 60; i <= 64; i++) {
        for (int j = 21; j <= 23; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 57; i <= 65; i++) {
        for (int j = 24; j <= 25; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 55; i <= 56; i++) {
        for (int j = 5; j <= 10; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
        for (int j = 14; j <= 31; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    // arvores - cidade3
    for (int i = 39; i <= 40; i++) {
        for (int j = 30; j <= 31; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 44; i <= 54; i++) {
        for (int j = 30; j <= 31; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 46; i <= 47; i++) {
        for (int j = 32; j <= 51; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 39; i <= 40; i++) {
        for (int j = 35; j <= 36; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 43; i <= 45; i++) {
        for (int j = 36; j <= 37; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 41; i <= 43; i++) {
        for (int j = 41; j <= 42; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 39; i <= 42; i++) {
        for (int j = 45; j <= 47; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 39; i <= 41; i++) {
        for (int j = 50; j <= 51; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 48; i <= 52; i++) {
        tabuleiro[i][32] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    tabuleiro[48][33] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    tabuleiro[48][34] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");

    tabuleiro[45][50] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    tabuleiro[45][51] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");

    for (int i = 54; i <= 59; i++) {
        tabuleiro[39][i] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    tabuleiro[40][59] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");

    for (int i = 39; i <= 55; i++) {
        for (int j = 60; j <= 62; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int i = 39; i <= 43; i++) {
        for (int j = 63; j <= 85; j++) {
            tabuleiro[i][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
        }
    }

    for (int j = 63; j <= 68; j++) {
        tabuleiro[44][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    for (int j = 81; j <= 85; j++) {
        tabuleiro[44][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    for (int j = 84; j <= 85; j++) {
        tabuleiro[45][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    tabuleiro[45][63] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    tabuleiro[46][85] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    tabuleiro[58][85] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    
    for (int j = 84; j <= 85; j++) {
        tabuleiro[59][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    for (int j = 84; j <= 85; j++) {
        tabuleiro[60][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    for (int j = 82; j <= 85; j++) {
        tabuleiro[61][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    for (int j = 79; j <= 85; j++) {
        tabuleiro[62][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    for (int j = 75; j <= 85; j++) {
        tabuleiro[63][j] = new Parede("\u001B[42m"  + "🍀" + "\u001B[0m");
    }

    // montanha

    for (int j = 46; j <= 50; j++) {
        tabuleiro[j][63] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
    }

    for (int i = 51; i <= 52; i++) {
        for (int j = 63; j <= 82; j++) {
            tabuleiro[i][j] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
        }
    }

    for (int i = 49; i <= 50; i++) {
        for (int j = 81; j <= 85; j++) {
            tabuleiro[i][j] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
        }
    }

    for (int j = 75; j <= 80; j++) {
        tabuleiro[45][j] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
        tabuleiro[48][j] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
    }

    tabuleiro[46][75] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
    tabuleiro[47][75] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
    tabuleiro[46][80] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
    tabuleiro[47][80] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");

    for (int i = 53; i <= 54; i++) {
        for (int j = 67; j <= 70; j++) {
            tabuleiro[i][j] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
        }
        for (int j = 73; j <= 76; j++) {
            tabuleiro[i][j] = new Parede("\u001B[48;5;94m" + "🟫" + "\u001B[0m");
        }
    }

    for (int j = 65; j <= 72; j++) {
        tabuleiro[57][j] = new Caminho3();
    }

    for (int i = 55; i <= 56; i++) {
        for (int j = 71; j <= 72; j++) {
            tabuleiro[i][j] = new Caminho3();
        }
    }

    for (int j = 71; j <= 72; j++) {
        tabuleiro[53][j] = new Parede("\u001B[40m" + "⬛" + "\u001B[0m");
    }

    tabuleiro[54][71] = new PortaPreta(15, 25);
    tabuleiro[54][72] = new PortaPreta(15, 25);



        // pokemons
        Pokemon bullbassaur = new Bulbassaur();
        Pokemon squirtle = new Squirtle();
        Pokemon charmander = new Charmander();

        tabuleiro[6][17] = new PokemonEscolher(6, 17, "🌱", bullbassaur);
        tabuleiro[6][19] = new PokemonEscolher(6, 19, "💧", squirtle);
        tabuleiro[6][21] = new PokemonEscolher(6, 21, "🔥", charmander);
    }

    /*public void imprimirTabuleiro(Jogador jogador) {
        int startX = Math.max(0, jogador.getPosx() - 5);
        int endX = Math.min(tabuleiro.length - 1, jogador.getPosx() + 5);
        int startY = Math.max(0, jogador.getPosy() - 5);
        int endY = Math.min(tabuleiro[0].length - 1, jogador.getPosy() + 5);
    
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if (i == jogador.getPosx() && j == jogador.getPosy()) {
                    System.out.print(jogador.getSprite());
                } else {
                    System.out.print(tabuleiro[i][j].getSprite());
                }
            }
            System.out.println();
        }
    }*/
    
    public void imprimirTabuleiro(Jogador jogador) {
         for (int i = 0; i < tabuleiro.length; i++) {
             for (int j = 0; j < tabuleiro[i].length; j++) {
                 if (i == jogador.getPosx() && j == jogador.getPosy()) {
                     System.out.print(jogador.getSprite());
                 } else {
                     System.out.print(tabuleiro[i][j].getSprite());
                 }
             }
             System.out.println();
         }
     }

    // encontrar batalha
    public void verificarGrama(Jogador jogador) {
        if (tabuleiro[jogador.getPosx()][jogador.getPosy()] instanceof Grama) {
            Random random = new Random();
            int number = random.nextInt(50);
            if(number <= 10) iniciarEventoGrama();

    }
}

    private void iniciarEventoGrama() {
        System.out.println("Você encontrou um Pokémon!");
    }

    public void colisaoPorta(Jogador jogador) {
        if (tabuleiro[jogador.getPosx()][jogador.getPosy()] instanceof Porta) {
            Porta porta = (Porta) tabuleiro[jogador.getPosx()][jogador.getPosy()];
            jogador.setPosx(porta.getJposx());
            jogador.setPosy(porta.getJposy());
        }
    }

    public void colisaoEscolherPokemon(Jogador jogador) {
        if (tabuleiro[jogador.getPosx()][jogador.getPosy()] instanceof PokemonEscolher) {
            PokemonEscolher pokemonEscolher = (PokemonEscolher) tabuleiro[jogador.getPosx()][jogador.getPosy()];
            int escolhaPokemon = pokemonEscolher.escolherPokemon();
            if (escolhaPokemon == 1) {
                jogador.getPokemon().add(pokemonEscolher.getPokemon());
                tabuleiro[6][17] = new Chao("🔳");
                tabuleiro[6][19] = new Chao("🔳");
                tabuleiro[6][21] = new Chao("🔳");
            } else {
                jogador.setPosx(jogador.getPosx() + 1);
            }
        }
    }
}