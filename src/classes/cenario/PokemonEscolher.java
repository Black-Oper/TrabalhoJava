package classes.cenario;

import java.util.Scanner;

import classes.pokemon.Pokemon;

public class PokemonEscolher extends Objetos{

    Scanner leitor = new Scanner(System.in);

    private String sprite;
    private Pokemon pokemon;

    public PokemonEscolher(String sprite, Pokemon pokemon) {
        super(true);
        this.sprite = sprite;
        this.pokemon = pokemon;
    }

    @Override
    public String getSprite() {
        return sprite;
    }

    public int escolherPokemon() {

        char[] calabreso = (pokemon.getNome() + "?").toCharArray();

        // Passo 1: Obter o tamanho atual do array
        int tamanhoAtual = calabreso.length;

        // Passo 2: Definir o tamanho desejado
        int tamanhoDesejado = 26;

        // Passo 3: Criar um novo array com o tamanho desejado
        char[] novoCalabreso = new char[tamanhoDesejado];

        // Passo 4: Copiar os caracteres do array original para o novo array
        for (int i = 0; i < tamanhoAtual && i < tamanhoDesejado; i++) {
            novoCalabreso[i] = calabreso[i];
        }

        // Passo 5: Preencher o resto do novo array com o caractere " "
        for (int i = tamanhoAtual; i < tamanhoDesejado; i++) {
            novoCalabreso[i] = ' ';
        }

        // Agora, novoCalabreso contém os caracteres originais seguidos de espaços, se necessário
        calabreso = novoCalabreso; // Atualizar a referência de calabreso para o novo array

        System.out.println("    \u001B[45m"  + "                                                  " + "\u001B[0m    ");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + "                            " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.print("\u001B[45m"  + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("Deseja escolher o pokémon ");
        System.out.println("\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        
        System.out.print("\u001B[45m"  + "               " + "\u001B[40m" + " " + "\u001B[0m");
        for (int i = 0; i < 26; i++) {
            System.out.print(calabreso[i]);
        }
        System.out.println("\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");

        System.out.print("\u001B[45m"  + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("1 - Sim                   ");
        System.out.println("\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");

        System.out.print("\u001B[45m"  + "               " + "\u001B[40m" + " " + "\u001B[0m");
        System.out.print("2 - Não                   ");
        System.out.println("\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");

        System.out.println("\u001B[45m"  + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " +"\u001B[0m" +  "                          " + "\u001B[40m" + " " + "\u001B[45m" + "       " + "\u001B[46m" + "[   ]" + "\u001B[45m" + "   " + "\u001B[0m");
        System.out.println("\u001B[45m"  + "   " + "\u001B[42m" + "         " + "\u001B[45m" + "   " + "\u001B[40m" + " " +"\u001B[0m" +  "                          " + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");        
        System.out.println("\u001B[45m"  + "      " + "\u001B[42m" + "   " + "\u001B[45m" + "      " + "\u001B[40m" + " " +"\u001B[0m" +  "                          " + "\u001B[40m" + " " + "\u001B[45m" + "   " + "\u001B[41m" + "[   ]" + "\u001B[45m" + "       " + "\u001B[0m");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + " " + "\u001B[0m" + "                          " + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + " " + "\u001B[0m" + "                          " + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + " " + "\u001B[0m" + "                          " + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + " " + "\u001B[0m" + "                          " + "\u001B[40m" + " " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.println("\u001B[45m"  + "               " + "\u001B[40m" + "                            " + "\u001B[45m" + "               " + "\u001B[0m");
        System.out.println("    \u001B[45m"  + "                                                  " + "\u001B[0m    ");

        int escolha = leitor.nextInt();

        return escolha;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }
}
