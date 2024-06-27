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
import classes.pokemon.pokemonList.Squirtle;

import java.util.*;

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
        // System.out.println("\u001B[40m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");
        // System.out.println("\u001B[45m"  + "                                                          " + "\u001B[0m");

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
            if(number <= 10) iniciarEventoGrama(jogador);

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
    
        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(new Bulbassaur());
        pokemonList.add(new Charmander());
        pokemonList.add(new Squirtle());
    
        Random random = new Random();
        int number = random.nextInt(3);
        Pokemon pokemon = pokemonList.get(number);

        int op;

        char[] nome_char = new char[12];
        String rival = pokemon.getNome();
        char[] name_char = new char[12];
        String player = jogador.getPokemon().get(0).getNome();
        padronizarNome(nome_char, name_char, rival, player); //deixar os nomes organizados! todos irao ter 12 char

        do{

            sistemaBatalha(jogador, pokemon, nome_char, name_char); //vai chamar a interface de batalha

            System.out.print(" ");
            op = new Scanner(System.in).nextInt();
            System.out.println("\n\n\n\n\n\n");

            switch (op) {
                case 1:
                    if (jogador.getPokemon().get(0).getVelocidade() > pokemon.getVelocidade() || jogador.getPokemon().get(0).getVelocidade() == pokemon.getVelocidade()){

                        System.out.print("\u001B[32m" + "               ");
                        jogador.getPokemon().get(0).getAtaque().atacar(jogador.getPokemon().get(0), pokemon);

                        if (pokemon.getHp() <= 0) {

                            System.out.println("\u001B[32m" + "   Pokemon selvagem desmaiou! Você ganhou a batalha! ");
                            jogador.getPokemon().get(0).setNivel(jogador.getPokemon().get(0).getNivel() + 1);
                            jogador.getPokemon().get(0).evoluir(jogador);
                            return;

                        } else {
                            System.out.print("\u001B[31m" + "               ");
                            pokemon.getAtaque().atacar(pokemon, jogador.getPokemon().get(0));

                            if (jogador.getPokemon().get(0).getHp() <= 0) {

                                System.out.println("\u001B[31m" + "                Seu pokemon desmaiou!");
                                return;
                            }

                        }
                    }else{
                        System.out.print("\u001B[31m" + "               ");
                        pokemon.getAtaque().atacar(pokemon, jogador.getPokemon().get(0));

                        if (jogador.getPokemon().get(0).getHp() <= 0) {

                            System.out.println("\u001B[31m" + "                Seu pokemon desmaiou!");
                            return;

                        }else{
                            System.out.print("\u001B[32m" + "               ");
                            jogador.getPokemon().get(0).getAtaque().atacar(jogador.getPokemon().get(0), pokemon);

                            if (pokemon.getHp() <= 0) {
                                System.out.println("\u001B[32m" + "   Pokemon selvagem desmaiou! Você ganhou a batalha! ");

                                jogador.getPokemon().get(0).setNivel(jogador.getPokemon().get(0).getNivel() + 1);
                                return;
                            }
                        }
                    }
                    System.out.print("\u001B[0m");
                    break;
                case 2:
                    return;
                default:
                    break;
            }
        }while(jogador.getPokemon().get(0).getHp() > 0 && pokemon.getHp() > 0);
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
            System.out.println("          Você não tem pokemons para batalhar!");
            return;
        }


        Treinador treinador = (Treinador) tabuleiro[jogador.getPosx()][jogador.getPosy()];
        Scanner scanner = new Scanner(System.in);
        int op;
        //padrozinar:
        char[] nome_char = new char[12];
        String rival = treinador.getPokemon().get(0).getNome();
        char[] name_char = new char[12];
        String player = jogador.getPokemon().get(0).getNome();
        padronizarNome(nome_char, name_char, rival, player); //deixar os nomes organizados! todos irao ter 12 char
    
        do {

            if (treinador.getPokemon().get(0).getHp() <= 0) {
                return;
            } else if(jogador.getPokemon().get(0).getHp() <= 0){
                return;
            }

            treinadorBatalha(jogador, treinador, nome_char, name_char); //vai chamar a interface de batalha
            System.out.print(" ");
            op = scanner.nextInt();
            System.out.println("\n\n\n\n\n\n");
    
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
    
        if(jogador.getPokemon().get(0).getVelocidade() >= treinador.getPokemon().get(0).getVelocidade()) {
            System.out.print("\u001B[32m" + "               ");
            jogador.getPokemon().get(0).getAtaque().atacar(jogador.getPokemon().get(0), treinador.getPokemon().get(0));
            if (treinador.getPokemon().get(0).getHp() <= 0) {
                System.out.println("\u001B[32m" + "               Pokémon inimigo desmaiou!"+ "\u001B[0m");
                jogador.getPokemon().get(0).setNivel(jogador.getPokemon().get(0).getNivel() + 1);
                jogador.getMochila().adicionarItem(new PocaoSimples());
                return;
            }
            System.out.print("\u001B[31m" + "               ");
            treinador.getPokemon().get(0).getAtaque().atacar(treinador.getPokemon().get(0), jogador.getPokemon().get(0));
            if (jogador.getPokemon().get(0).getHp() <= 0) {
                System.out.println("\u001B[31m" + "               Seu pokemon desmaiou!" + "\u001B[0m");
                return;
            }
        }else{
            System.out.print("\u001B[31m" + "               ");
            treinador.getPokemon().get(0).getAtaque().atacar(treinador.getPokemon().get(0), jogador.getPokemon().get(0));
            if (jogador.getPokemon().get(0).getHp() <= 0) {
                System.out.println("\u001B[31m" + "               eu pokemon desmaiou!" + "\u001B[0m");
                return;
            }
            System.out.print("\u001B[32m" + "               ");
            jogador.getPokemon().get(0).getAtaque().atacar(jogador.getPokemon().get(0), treinador.getPokemon().get(0));
            if (treinador.getPokemon().get(0).getHp() <= 0) {
                System.out.println("\u001B[32m" + "               Pokémon inimigo desmaiou!" + "\u001B[0m");
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
    
        System.out.println("    \u001B[45m"  + "                                                  " + "\u001B[0m    ");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + "                            " + "\u001B[45m" +"               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print(" Pokémon:                 ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");

        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        
        for (int i = 0; i < 6; i++) {
            if (jogador.getPokemon().size() > i && jogador.getPokemon().get(i) != null) {
                String nome = jogador.getPokemon().get(i).getNome().substring(0, Math.min(jogador.getPokemon().get(i).getNome().length(), 3));
                int nivel = jogador.getPokemon().get(i).getNivel();
                int hp = jogador.getPokemon().get(i).getHp();

                if (i == 2) {
                    System.out.print("\u001B[45m"  + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " +"\u001B[0m");
                    System.out.print(String.format(" %s - lvl: %03d - HP: %03d ", nome, nivel, hp));
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "       " + "\u001B[46m" + "[   ]" + "\u001B[45m" + "   " + "\u001B[0m");
                }else if(i == 3){
                    System.out.print("\u001B[45m"  + "   " + "\u001B[42m" + "         " + "\u001B[45m" + "   " + "\u001B[40m" + " " +"\u001B[0m");
                    System.out.print(String.format(" %s - lvl: %03d - HP: %03d ", nome, nivel, hp));
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
                }else if(i == 4){
                    System.out.print("\u001B[45m"  + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " +"\u001B[0m");
                    System.out.print(String.format(" %s - lvl: %03d - HP: %03d ", nome, nivel, hp));
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "   " + "\u001B[41m" + "[   ]" + "\u001B[45m" + "       " + "\u001B[0m");
                }else{
                    System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
                    System.out.print(String.format(" %s - lvl: %03d - HP: %03d ", nome, nivel, hp));
                    System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
                }
            } else {

                if (i == 2) {
                    System.out.print("\u001B[45m"  + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " +"\u001B[0m");
                    System.out.print("                          "); // 26 espaços
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "       " + "\u001B[46m" + "[   ]" + "\u001B[45m" + "   " + "\u001B[0m");
                }else if(i == 3){
                    System.out.print("\u001B[45m"  + "   " + "\u001B[42m" + "         " + "\u001B[45m" + "   " + "\u001B[40m" + " " +"\u001B[0m");
                    System.out.print("                          ");
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
                }else if(i == 4){
                    System.out.print("\u001B[45m"  + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " +"\u001B[0m");
                    System.out.print("                          ");
                    System.out.println("\u001B[40m" + " " + "\u001B[45m" + "   " + "\u001B[41m" + "[   ]" + "\u001B[45m" + "       " + "\u001B[0m");
                }else{
                    System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
                    System.out.print("                          "); // 26 espaços
                    System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
                }
            }
        }
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + "                            " + "\u001B[45m" +"               " + "\u001B[0m");
        System.out.println("    \u001B[45m"  + "                                                  " + "\u001B[0m    ");
    
        new Scanner(System.in).nextLine();
    }
    public void sistemaBatalha(Jogador jogador, Pokemon pokemon, char[] nome_char, char[] name_char){
        // para ficar padrao o hp e level!
        int nivel = jogador.getPokemon().get(0).getNivel();
        int hp = jogador.getPokemon().get(0).getHp();
        int nivel_rival= pokemon.getNivel();
        int hp_rival = pokemon.getHp();


        //INTERFACE VISUAL DA BATALHA, ESTÁ TUDO CERTO POREM NÃO DEU PARA COLOCAR EMOJI E FUNCIONA SÓ PARA UM POKEMON!
        System.out.println("    \u001B[45m"  + "                                                  " + "\u001B[0m    ");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + "                            " + "\u001B[45m" +"               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("   UM POKEMON APARECEU!   ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.printf(pokemon.nomeColor());
        System.out.print(nome_char);
        System.out.printf("\u001B[0m    LV: %03d   ", nivel_rival);
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.printf("                HP: %03d   ", hp_rival);
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m"  + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " +"\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[40m" + " " + "\u001B[45m" + "       " + "\u001B[46m" + "[   ]" + "\u001B[45m" + "   " + "\u001B[0m");
        System.out.print("\u001B[45m"  + "   " + "\u001B[42m" + "         " + "\u001B[45m" + "   " + "\u001B[40m" + " " +"\u001B[0m");
        System.out.print("        SEU POKEMON:      ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m"  + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " +"\u001B[0m");
        System.out.printf(jogador.getPokemon().get(0).nomeColor());
        System.out.print(name_char);
        System.out.printf("\u001B[0m    LV: %03d   ", nivel);
        System.out.println("\u001B[40m" + " " + "\u001B[45m" + "   " + "\u001B[41m" + "[   ]" + "\u001B[45m" + "       " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.printf("                HP: %03d   ", hp);
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print(" 1 - ATACAR               ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print(" 2 - FUGIR                ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + "                            " + "\u001B[45m" +"               " + "\u001B[0m");
        System.out.println("    \u001B[45m"  + "                                                  " + "\u001B[0m    ");

    }

    public void treinadorBatalha(Jogador jogador, Treinador treinador, char[] nome_char, char[] name_char){
        // para ficar padrao o hp e level!
        int nivel = jogador.getPokemon().get(0).getNivel();
        int hp = jogador.getPokemon().get(0).getHp();
        int nivel_rival = treinador.getPokemon().get(0).getNivel();
        int hp_rival = treinador.getPokemon().get(0).getHp();


        //INTERFACE VISUAL DA BATALHA, ESTÁ TUDO CERTO POREM NÃO DEU PARA COLOCAR EMOJI E FUNCIONA SÓ PARA UM POKEMON!
        System.out.println("    \u001B[45m"  + "                                                  " + "\u001B[0m    ");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + "                            " + "\u001B[45m" +"               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("    Professor Carvalho    ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.printf(treinador.getPokemon().get(0).nomeColor());
        System.out.print(nome_char);
        System.out.printf("\u001B[0m    LV: %03d   ", nivel_rival);
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.printf("                HP: %03d   ", hp_rival);
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m"  + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " +"\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[40m" + " " + "\u001B[45m" + "       " + "\u001B[46m" + "[   ]" + "\u001B[45m" + "   " + "\u001B[0m");
        System.out.print("\u001B[45m"  + "   " + "\u001B[42m" + "         " + "\u001B[45m" + "   " + "\u001B[40m" + " " +"\u001B[0m");
        System.out.print("        SEU POKEMON:      ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m"  + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " +"\u001B[0m");
        System.out.printf(jogador.getPokemon().get(0).nomeColor());
        System.out.print(name_char);
        System.out.printf("\u001B[0m    LV: %03d   ", nivel);
        System.out.println("\u001B[40m" + " " + "\u001B[45m" + "   " + "\u001B[41m" + "[   ]" + "\u001B[45m" + "       " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.printf("                HP: %03d   ", hp);
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("                          ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print(" 1 - ATACAR               ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m" + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print(" 2 - FUGIR                ");
        System.out.println("\u001B[45m"  + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + "                            " + "\u001B[45m" +"               " + "\u001B[0m");
        System.out.println("    \u001B[45m"  + "                                                  " + "\u001B[0m    ");

    }

    public void padronizarNome(char[] nome_char, char[] name_char, String rival, String player){
        //pokemon rival - os comandos abaixo serve para o nome ficar "padrao"
        Arrays.fill(nome_char, ' ');
        int copia = Math.min(rival.length(), nome_char.length);

        for (int i = 0; i < copia; i++) {
            nome_char[i] = rival.charAt(i);
        }

        //seu pokemon - os comandos abaixo serve para o nome ficar "padrao"
        Arrays.fill(name_char, ' ');
        copia = Math.min(player.length(), name_char.length);

        for (int i = 0; i < copia; i++) {
            name_char[i] = player.charAt(i);
        }
    }

}



