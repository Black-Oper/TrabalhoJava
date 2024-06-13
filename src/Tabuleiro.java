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

    //casa1 - cidade1
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

    // casa2 - cidade2
    for (int i = 59; i <= 63; i++) {
        tabuleiro[88][i] = new Parede("\u001B[43m" + "🟨" + "\u001B[0m");
        tabuleiro[89][i] = new Parede("\u001B[43m" + "🟨" + "\u001B[0m");
        tabuleiro[90][i] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    }
    tabuleiro[91][59] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[91][60] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[91][61] = new Porta(10, 7);
    tabuleiro[91][62] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[91][63] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    // casa3 - cidade2
    for (int i = 12; i <= 16; i++) {
        tabuleiro[85][i] = new Parede("\u001B[43m" + "🟨" + "\u001B[0m");
        tabuleiro[86][i] = new Parede("\u001B[43m" + "🟨" + "\u001B[0m");
        tabuleiro[87][i] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    }
    tabuleiro[88][12] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][13] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][14] = new Porta(10, 7);
    tabuleiro[88][15] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][16] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    // laboratorio - cidade2
    tabuleiro[75][27] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[75][28] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[75][29] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[75][30] = new Porta(15, 19);
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


    //caminho - cidade3
    for (int i = 53; i >= 47; i--) {
        tabuleiro[i][12] = new Caminho3();
    }
    
    for (int i = 13; i <= 25; i++) {
        tabuleiro[51][i] = new Caminho3();
    }
    
    for (int i = 50; i >= 48; i--) {
        tabuleiro[i][25] = new Caminho3();
    }

    //caminho - cidade4
    tabuleiro[43][53] = new Caminho4();
    tabuleiro[43][54] = new Caminho4();
    tabuleiro[58][44] = new Caminho4();
    tabuleiro[58][39] = new Caminho4();
    tabuleiro[63][35] = new Caminho4();
    tabuleiro[63][34] = new Caminho4();
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