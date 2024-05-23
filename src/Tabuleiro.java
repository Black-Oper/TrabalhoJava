import classes.cenario.Caminho;
import classes.cenario.Chao;
import classes.cenario.Elemento;
import classes.cenario.Grama;
import classes.cenario.Parede;
import classes.cenario.PokemonEscolher;
import classes.cenario.Porta;
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

    tabuleiro[88][87] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][86] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][85] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][84] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[88][83] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    tabuleiro[87][87] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
    tabuleiro[87][86] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
    tabuleiro[87][85] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
    tabuleiro[87][84] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
    tabuleiro[87][83] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");

    tabuleiro[86][87] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
    tabuleiro[86][86] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
    tabuleiro[86][85] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
    tabuleiro[86][84] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");
    tabuleiro[86][83] = new Parede("\u001B[41m"  + "🟥" + "\u001B[0m");

    // casa1 - cidade1 - interior
    for (int i = 5; i < 10; i++) {
        for (int j = 5; j < 11; j++) {
            tabuleiro[i][j] = new Chao("\u001B[43m" + "\u001B[33m"  + "🟨" + "\u001B[0m");
        }
    }
    tabuleiro[6][6] = new Parede("\u001B[43m" + "\u001B[33m"  + "🍁" + "\u001B[0m");
    tabuleiro[10][7] = new Porta(90, 85);

    // baboratorio - cidade1
    tabuleiro[80][83] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[80][82] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[80][81] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[80][80] = new Porta(15, 19);
    tabuleiro[80][79] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[80][78] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[80][77] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    tabuleiro[79][83] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[79][82] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[79][81] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[79][80] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[79][79] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[79][78] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[79][77] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

    tabuleiro[78][83] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[78][82] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[78][81] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[78][80] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[78][79] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[78][78] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");
    tabuleiro[78][77] = new Parede("\u001B[47m"  + "⬜" + "\u001B[0m");

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

    //caminho - cidade1
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
    

        // pokemons
        Pokemon bullbassaur = new Bulbassaur();
        Pokemon squirtle = new Squirtle();
        Pokemon charmander = new Charmander();

        tabuleiro[6][17] = new PokemonEscolher(6, 17, "🌱", bullbassaur);
        tabuleiro[6][19] = new PokemonEscolher(6, 19, "💧", squirtle);
        tabuleiro[6][21] = new PokemonEscolher(6, 21, "🔥", charmander);
    }

    public void imprimirTabuleiro(Jogador jogador) {
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