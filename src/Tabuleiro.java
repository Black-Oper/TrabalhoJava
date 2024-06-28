
import classes.cenario.*;
import classes.cenario.Caminho;
import classes.cenario.Chao;
import classes.cenario.Curador;
import classes.cenario.Elemento;
import classes.cenario.Grama;
import classes.cenario.Parede;
import classes.cenario.PokemonEscolher;
import classes.cenario.Porta;
import classes.cenario.Treinador;
import classes.item.PocaoSimples;
import classes.personagem.Jogador;
import classes.pokemon.Pokemon;
import classes.pokemon.pokemonList.Bulbassaur;
import classes.pokemon.pokemonList.Charmander;
import classes.pokemon.pokemonList.Machop;
import classes.pokemon.pokemonList.Pidgey;
import classes.pokemon.pokemonList.Pikachu;
import classes.pokemon.pokemonList.Squirtle;

import java.util.List;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {

    public Elemento[][] tabuleiro;
    public List<Integer> posXGrama = new ArrayList<Integer>();
    public List<Integer> posYGrama = new ArrayList<Integer>();
    public int length;

    public Tabuleiro() {
        tabuleiro = new Elemento[100][100];
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = new Chao("\u001B[42m" + "🟩" + "\u001B[0m");
            }
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (i < 5 || i >= tabuleiro.length - 5 || j < 5 || j >= tabuleiro[i].length - 5) {
                    tabuleiro[i][j] = new classes.cenario.Parede("\u001B[42m" + "🍀" + "\u001B[0m");
                }
            }
        }

        // preencher da coordenada [34][0] ate [38][99] com parede
        for (int i = 34; i < 39; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = new classes.cenario.Parede("\u001B[42m" + "🍀" + "\u001B[0m");
            }
        }

        // preencher da coordenada [0][0] ate [33][99] com parede
        for (int i = 0; i < 34; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = new classes.cenario.Parede("\u001B[40m" + "⬛" + "\u001B[0m");
            }
        }

        // arbustos - cidade1
        tabuleiro[92][90] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[92][89] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[92][88] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[91][89] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[91][90] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[88][92] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[88][91] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[87][92] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[87][91] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[86][92] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[84][89] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[83][89] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[83][89] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[83][88] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[83][87] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[82][89] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[82][88] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
        tabuleiro[82][87] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");

        for (int i = 86; i < 93; i++) {
            for (int j = 73; j < 78; j++) {
                tabuleiro[i][j] = new Grama("\u001B[42m" + "🌾" + "\u001B[0m");
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
        // casa1 - cidade1
        tabuleiro[89][87] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[89][86] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[89][85] = new Porta(10, 7);
        tabuleiro[89][84] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[89][83] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");

        tabuleiro[88][87] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[88][86] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[88][85] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[88][84] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[88][83] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");

        tabuleiro[87][87] = new Parede("\u001B[41m" + "🟥" + "\u001B[0m");
        tabuleiro[87][86] = new Parede("\u001B[41m" + "🟥" + "\u001B[0m");
        tabuleiro[87][85] = new Parede("\u001B[41m" + "🟥" + "\u001B[0m");
        tabuleiro[87][84] = new Parede("\u001B[41m" + "🟥" + "\u001B[0m");
        tabuleiro[87][83] = new Parede("\u001B[41m" + "🟥" + "\u001B[0m");

        tabuleiro[86][87] = new Parede("\u001B[41m" + "🟥" + "\u001B[0m");
        tabuleiro[86][86] = new Parede("\u001B[41m" + "🟥" + "\u001B[0m");
        tabuleiro[86][85] = new Parede("\u001B[41m" + "🟥" + "\u001B[0m");
        tabuleiro[86][84] = new Parede("\u001B[41m" + "🟥" + "\u001B[0m");
        tabuleiro[86][83] = new Parede("\u001B[41m" + "🟥" + "\u001B[0m");

        // casa1 - cidade1 - interior
        for (int i = 5; i < 10; i++) {
            for (int j = 5; j < 11; j++) {
                tabuleiro[i][j] = new Chao("\u001B[43m" + "\u001B[33m" + "🟨" + "\u001B[0m");
            }
        }
        tabuleiro[6][6] = new Parede("\u001B[43m" + "\u001B[33m" + "🍁" + "\u001B[0m");
        tabuleiro[10][7] = new Porta(90, 85);

        // baboratorio - cidade1
        tabuleiro[80][83] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[80][82] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[80][81] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[80][80] = new Porta(15, 19);
        tabuleiro[80][79] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[80][78] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[80][77] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");

        tabuleiro[79][83] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[79][82] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[79][81] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[79][80] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[79][79] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[79][78] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[79][77] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");

        tabuleiro[78][83] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[78][82] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[78][81] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[78][80] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[78][79] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[78][78] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");
        tabuleiro[78][77] = new Parede("\u001B[47m" + "⬜" + "\u001B[0m");

        tabuleiro[77][83] = new Parede("🟥");
        tabuleiro[77][82] = new Parede("🟥");
        tabuleiro[77][81] = new Parede("🟥");
        tabuleiro[77][80] = new Parede("🟥");
        tabuleiro[77][79] = new Parede("🟥");
        tabuleiro[77][78] = new Parede("🟥");
        tabuleiro[77][77] = new Parede("🟥");

        tabuleiro[76][83] = new Parede("🟥");
        tabuleiro[76][82] = new Parede("🟥");
        tabuleiro[76][81] = new Parede("🟥");
        tabuleiro[76][80] = new Parede("🟥");
        tabuleiro[76][79] = new Parede("🟥");
        tabuleiro[76][78] = new Parede("🟥");
        tabuleiro[76][77] = new Parede("🟥");

        // laboratiorio - cidade1 - interior
        for (int i = 5; i < 16; i++) {
            for (int j = 16; j < 23; j++) {
                tabuleiro[i][j] = new Chao("🔳");
            }
        }
        tabuleiro[16][19] = new Porta(81, 80);

        // caminho - cidade1
        tabuleiro[90][85] = new Caminho();
        tabuleiro[91][85] = new Caminho();
        tabuleiro[91][84] = new Caminho();
        tabuleiro[91][83] = new Caminho();
        tabuleiro[91][82] = new Caminho();
        tabuleiro[91][81] = new Caminho();
        tabuleiro[91][80] = new Caminho();
        tabuleiro[90][80] = new Caminho();
        tabuleiro[89][80] = new Caminho();
        tabuleiro[88][80] = new Caminho();
        tabuleiro[87][80] = new Caminho();
        tabuleiro[86][80] = new Caminho();
        tabuleiro[85][80] = new Caminho();
        tabuleiro[84][80] = new Caminho();
        tabuleiro[83][80] = new Caminho();
        tabuleiro[82][80] = new Caminho();
        tabuleiro[81][80] = new Caminho();
        tabuleiro[83][79] = new Caminho();
        tabuleiro[83][78] = new Caminho();
        tabuleiro[83][77] = new Caminho();
        tabuleiro[83][76] = new Caminho();
        tabuleiro[83][75] = new Caminho();
        tabuleiro[83][74] = new Caminho();
        tabuleiro[83][73] = new Caminho();
        tabuleiro[83][72] = new Caminho();
        tabuleiro[83][71] = new Caminho();
        tabuleiro[83][70] = new Caminho();
        // arvores - cidade1
        for (int i = 70; i < 81; i++) {
            for (int j = 86; j < 95; j++) {
                tabuleiro[i][j] = new Parede("\u001B[42m" + "🍀" + "\u001B[0m");
            }
        }

        for (int i = 70; i < 75; i++) {
            for (int j = 75; j < 86; j++) {
                tabuleiro[i][j] = new Parede("\u001B[42m" + "🍀" + "\u001B[0m");
            }
        }

        for (int i = 70; i < 81; i++) {
            for (int j = 72; j < 75; j++) {
                tabuleiro[i][j] = new Parede("\u001B[42m" + "🍀" + "\u001B[0m");
            }
        }

        for (int i = 78; i < 81; i++) {
            for (int j = 66; j < 72; j++) {
                tabuleiro[i][j] = new Parede("\u001B[42m" + "🍀" + "\u001B[0m");
            }
        }

        for (int i = 86; i < 95; i++) {
            for (int j = 66; j < 71; j++) {
                tabuleiro[i][j] = new Parede("\u001B[42m" + "🍀" + "\u001B[0m");
            }
        }

        // pokemons
        Pokemon bullbassaur = new Bulbassaur();
        Pokemon squirtle = new Squirtle();
        Pokemon charmander = new Charmander();

        tabuleiro[6][17] = new PokemonEscolher("🔴", bullbassaur);
        tabuleiro[6][19] = new PokemonEscolher("🔴", squirtle);
        tabuleiro[6][21] = new PokemonEscolher("🔴", charmander);

        // lista de pokemons
        Pokemon pokemon1 = new Bulbassaur();
        Pokemon pokemon2 = new Squirtle();
        Pokemon pokemon3 = new Charmander();

        List<Pokemon> pokemonList = new ArrayList<>();

        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);
        pokemonList.add(pokemon3);

        tabuleiro[8][17] = new Treinador(pokemonList, "🧑");

        // pokestop

        tabuleiro[12][17] = new Curador("🏥");
    }

    public void imprimirTabuleiro(Jogador jogador) {
        int startX = Math.max(0, jogador.getPosx() - 5);
        int endX = Math.min(tabuleiro.length - 1, jogador.getPosx() + 5);
        int startY = Math.max(0, jogador.getPosy() - 5);
        int endY = Math.min(tabuleiro[0].length - 1, jogador.getPosy() + 5);

        System.out.println("    \u001B[45m"  + "                                                  " + "\u001B[0m    ");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + "                            " + "\u001B[45m" +"               " + "\u001B[0m");

        for (int i = startX; i <= endX; i++) {

            if(i == jogador.getPosx()){
                System.out.print("\u001B[45m" + "   " + "\u001B[42m" + "         " + "\u001B[45m" + "   " + "\u001B[40m" + " " + "\u001B[0m");
            }else if(i == jogador.getPosx() - 1){
                System.out.print("\u001B[45m" + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " + "\u001B[0m");

            }else if(i == jogador.getPosx() + 1){
                System.out.print("\u001B[45m" + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " + "\u001B[0m");
            }else{
                System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
            }

            for (int j = startY; j <= endY; j++) {
                if (i == jogador.getPosx() && j == jogador.getPosy()) {
                    System.out.print(jogador.getSprite());
                } else {
                    System.out.print(tabuleiro[i][j].getSprite());
                }
            }

            if (i == (jogador.getPosx() - 1)) {
                System.out.print("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "       " + "\u001B[46m" + "[   ]" + "\u001B[45m" + "   " + "\u001B[0m");
            }else if (i == (jogador.getPosx() + 1)) {
                System.out.print("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "   " + "\u001B[41m" + "[   ]" + "\u001B[45m" + "       " + "\u001B[0m");

            }else{
                System.out.print("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
            }
            System.out.println();
        }
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + "                            " + "\u001B[45m" +"               " + "\u001B[0m");
        System.out.println("    \u001B[45m"  + "                                                  " + "\u001B[0m    ");
    }
    
    /*public void imprimirTabuleiro(Jogador jogador) {
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
     }*/

    // encontrar batalha
    public void verificarGrama(Jogador jogador) {
        if (tabuleiro[jogador.getPosx()][jogador.getPosy()] instanceof Grama) {
            Random random = new Random();
            int number = random.nextInt(50);
            if (number <= 10)
                iniciarEventoGrama(jogador);

        }
    }

    private void iniciarEventoGrama(Jogador jogador) {

        if (jogador.getPokemon().size() == 0) {
            System.out.println("Você não tem pokemons para batalhar!");
            return;
        }

        if (jogador.getPokemon().get(0).getHp() <= 0) {
            System.out.println("Seu pokemon está desmaiado!");
            return;
        }

        int op;

        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(new Bulbassaur());
        pokemonList.add(new Charmander());
        pokemonList.add(new Squirtle());
        pokemonList.add(new Pikachu());
        pokemonList.add(new Pidgey());
        pokemonList.add(new Machop());

        Random random = new Random();
        int number = random.nextInt(6);
        Pokemon pokemon = pokemonList.get(number);

        System.out.println("Um pokemon selvagem apareceu!");

        do {
            System.out.println("=====================================");
            System.out.println("Pokemon selvagem: " + pokemon.getNome() + " - Nivel: " + pokemon.getNivel());
            System.out.println("HP: " + pokemon.getHp());
            System.out.println("=====================================");
            System.out.println();
            System.out.println("=====================================");
            System.out.println("Seu pokemon: " + jogador.getPokemon().get(0).getNome() + " - Nivel: "
                    + jogador.getPokemon().get(0).getNivel());
            System.out.println("HP: " + jogador.getPokemon().get(0).getHp());
            System.out.println("=====================================");

            System.out.println("1 - Atacar");
            System.out.println("2 - Fugir");
            System.out.print("Opcao: ");
            op = new Scanner(System.in).nextInt();

            switch (op) {
                case 1:
                    if (jogador.getPokemon().get(0).getVelocidade() > pokemon.getVelocidade()
                            || jogador.getPokemon().get(0).getVelocidade() == pokemon.getVelocidade()) {

                        jogador.getPokemon().get(0).getAtaque().atacar(jogador.getPokemon().get(0), pokemon);

                        // Garantir que a vida do pokemon não seja menor que 0
                        if (pokemon.getHp() < 0) {
                            pokemon.setHp(0);
                        }

                        if (pokemon.getHp() <= 0) {

                            System.out.println("Pokemon selvagem desmaiou!");
                            jogador.getPokemon().get(0).setNivel(jogador.getPokemon().get(0).getNivel() + 1);
                            jogador.getPokemon().get(0).evoluir(jogador);
                            return;

                        } else {

                            pokemon.getAtaque().atacar(pokemon, jogador.getPokemon().get(0));

                            // Garantir que a vida do pokemon do jogador não seja menor que 0
                            if (jogador.getPokemon().get(0).getHp() < 0) {
                                jogador.getPokemon().get(0).setHp(0);
                            }

                            if (jogador.getPokemon().get(0).getHp() <= 0) {

                                System.out.println("Seu pokemon desmaiou!");
                                return;
                            }
                        }
                    } else {

                        pokemon.getAtaque().atacar(pokemon, jogador.getPokemon().get(0));

                        // Garantir que a vida do pokemon do jogador não seja menor que 0
                        if (jogador.getPokemon().get(0).getHp() < 0) {
                            jogador.getPokemon().get(0).setHp(0);
                        }

                        if (jogador.getPokemon().get(0).getHp() <= 0) {

                            System.out.println("Seu pokemon desmaiou!");
                            return;

                        } else {
                            jogador.getPokemon().get(0).getAtaque().atacar(jogador.getPokemon().get(0), pokemon);

                            // Garantir que a vida do pokemon selvagem não seja menor que 0
                            if (pokemon.getHp() < 0) {
                                pokemon.setHp(0);
                            }

                            if (pokemon.getHp() <= 0) {
                                System.out.println("Pokemon selvagem desmaiou!");

                                jogador.getPokemon().get(0).setNivel(jogador.getPokemon().get(0).getNivel() + 1);
                                return;
                            }

                        }
                    }
                    break;
                case 2:
                    return;
                default:
                    break;
            }
        } while (jogador.getPokemon().get(0).getHp() > 0 && pokemon.getHp() > 0);
    }

    public void colisaoPorta(Jogador jogador) {
        if (tabuleiro[jogador.getPosx()][jogador.getPosy()] instanceof Porta) {
            Porta porta = (Porta) tabuleiro[jogador.getPosx()][jogador.getPosy()];
            jogador.setPosx(porta.getJposx());
            jogador.setPosy(porta.getJposy());
        }
    }

    public static void clearScreen() {
        for (int i = 0; i < 50; i++)
            System.out.println();
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
                jogador.getMochila().adicionarItem(new PocaoSimples());
                clearScreen();
            } else {
                jogador.setPosx(jogador.getPosx() + 1);
                clearScreen();
            }
        }
    }

    public void colisaoTreinador(Jogador jogador) {
        if (!(tabuleiro[jogador.getPosx()][jogador.getPosy()] instanceof Treinador)) {
            return;
        }

        if (jogador.getPokemon().isEmpty()) {
            System.out.println("Você não tem pokemons para batalhar!");
            return;
        }

        Treinador treinador = (Treinador) tabuleiro[jogador.getPosx()][jogador.getPosy()];
        Scanner scanner = new Scanner(System.in);
        int op;

        do {

            if (treinador.getPokemon().get(0).getHp() <= 0) {
                return;
            } else if (jogador.getPokemon().get(0).getHp() <= 0) {
                return;
            }

            System.out.println("=====================================");
            System.out.println("Treinador:");
            System.out.println(treinador.getPokemon().get(0).getNome() + " - Nivel: "
                    + treinador.getPokemon().get(0).getNivel() + " - HP: " + treinador.getPokemon().get(0).getHp());
            System.out.println("=====================================\n");
            System.out.println("Seu pokemon: " + jogador.getPokemon().get(0).getNome() + " - Nivel: "
                    + jogador.getPokemon().get(0).getNivel() + " - HP: " + jogador.getPokemon().get(0).getHp());
            System.out.println("=====================================");
            System.out.println("1 - Atacar");
            System.out.println("2 - Fugir");
            System.out.print("Opcao: ");
            op = scanner.nextInt();

            if (op == 2) {
                return;
            } else if (op == 1) {
                realizarAtaque(jogador, treinador);
                ajustarHp(treinador.getPokemon().get(0));
                ajustarHp(jogador.getPokemon().get(0));
            }
        } while (true);
    }

    private void realizarAtaque(Jogador jogador, Treinador treinador) {
        Pokemon pokemonJogador = jogador.getPokemon().get(0);
        Pokemon pokemonTreinador = treinador.getPokemon().get(0);

        if (jogador.getPokemon().get(0).getVelocidade() >= treinador.getPokemon().get(0).getVelocidade()) {
            jogador.getPokemon().get(0).getAtaque().atacar(jogador.getPokemon().get(0), treinador.getPokemon().get(0));
            if (treinador.getPokemon().get(0).getHp() <= 0) {
                System.out.println("Pokémon inimigo desmaiou!");
                jogador.getPokemon().get(0).setNivel(jogador.getPokemon().get(0).getNivel() + 1);
                jogador.getMochila().adicionarItem(new PocaoSimples());
                return;
            }
            treinador.getPokemon().get(0).getAtaque().atacar(treinador.getPokemon().get(0),
                    jogador.getPokemon().get(0));
            if (jogador.getPokemon().get(0).getHp() <= 0) {
                System.out.println("Seu pokemon desmaiou!");
                return;
            }
        } else {
            treinador.getPokemon().get(0).getAtaque().atacar(treinador.getPokemon().get(0),
                    jogador.getPokemon().get(0));
            if (jogador.getPokemon().get(0).getHp() <= 0) {
                System.out.println("Seu pokemon desmaiou!");
                return;
            }
            jogador.getPokemon().get(0).getAtaque().atacar(jogador.getPokemon().get(0), treinador.getPokemon().get(0));
            if (treinador.getPokemon().get(0).getHp() <= 0) {
                System.out.println("Pokémon inimigo desmaiou!");
                jogador.getPokemon().get(0).setNivel(jogador.getPokemon().get(0).getNivel() + 1);
                jogador.getMochila().adicionarItem(new PocaoSimples());
                return;
            }

        }
    }

    private void ajustarHp(Pokemon pokemon) {
        if (pokemon.getHp() < 0) {
            pokemon.setHp(0);
        }
    }

    public void acessarCuradorECurarPokemons(Jogador jogador) {
        if (!(tabuleiro[jogador.getPosx()][jogador.getPosy()] instanceof Curador)) {
            return;
        }

        Curador curador = (Curador) tabuleiro[jogador.getPosx()][jogador.getPosy()];
        curador.comoAssimDaOndeVemEssaMusica(jogador);
    }

    public void acessarPokemon(Jogador jogador) {
        clearScreen();

        System.out.println("    \u001B[45m" + "                                                  " + "\u001B[0m    ");
        System.out.println("\u001B[45m" + "               " + "\u001B[40m" + "                            "
                + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print(" Pokémon:                 ");
        System.out.println("\u001B[45m" + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");

        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m" + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");

        for (int i = 0; i < 6; i++) {
            if (jogador.getPokemon().size() > i && jogador.getPokemon().get(i) != null) {
                String nome = jogador.getPokemon().get(i).getNome().substring(0,
                        Math.min(jogador.getPokemon().get(i).getNome().length(), 3));
                int nivel = jogador.getPokemon().get(i).getNivel();
                int hp = jogador.getPokemon().get(i).getHp();

                if (i == 2) {
                    System.out.print("\u001B[45m" + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      "
                            + "\u001B[40m" + " " + "\u001B[0m");
                    System.out.print(String.format(" %s - lvl: %03d - HP: %03d ", nome, nivel, hp));
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "       " + "\u001B[46m" + "[   ]"
                            + "\u001B[45m" + "   " + "\u001B[0m");
                } else if (i == 3) {
                    System.out.print("\u001B[45m" + "   " + "\u001B[42m" + "         " + "\u001B[45m" + "   "
                            + "\u001B[40m" + " " + "\u001B[0m");
                    System.out.print(String.format(" %s - lvl: %03d - HP: %03d ", nome, nivel, hp));
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
                } else if (i == 4) {
                    System.out.print("\u001B[45m" + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      "
                            + "\u001B[40m" + " " + "\u001B[0m");
                    System.out.print(String.format(" %s - lvl: %03d - HP: %03d ", nome, nivel, hp));
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "   " + "\u001B[41m" + "[   ]" + "\u001B[45m"
                            + "       " + "\u001B[0m");
                } else {
                    System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
                    System.out.print(String.format(" %s - lvl: %03d - HP: %03d ", nome, nivel, hp));
                    System.out.println(
                            "\u001B[45m" + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
                }
            } else {

                if (i == 2) {
                    System.out.print("\u001B[45m" + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      "
                            + "\u001B[40m" + " " + "\u001B[0m");
                    System.out.print("                          "); // 26 espaços
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "       " + "\u001B[46m" + "[   ]"
                            + "\u001B[45m" + "   " + "\u001B[0m");
                } else if (i == 3) {
                    System.out.print("\u001B[45m" + "   " + "\u001B[42m" + "         " + "\u001B[45m" + "   "
                            + "\u001B[40m" + " " + "\u001B[0m");
                    System.out.print("                          ");
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
                } else if (i == 4) {
                    System.out.print("\u001B[45m" + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      "
                            + "\u001B[40m" + " " + "\u001B[0m");
                    System.out.print("                          ");
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "   " + "\u001B[41m" + "[   ]" + "\u001B[45m"
                            + "       " + "\u001B[0m");
                } else {
                    System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
                    System.out.print("                          "); // 26 espaços
                    System.out.println(
                            "\u001B[45m" + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
                }
            }
        }
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m" + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m" + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m" + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.println("\u001B[45m" + "               " + "\u001B[40m" + "                            "
                + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.println("    \u001B[45m" + "                                                  " + "\u001B[0m    ");

        new Scanner(System.in).nextLine();
    }

    public char[] getSprite() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSprite'");
    }
}