package classes.item;

import java.util.*;

import classes.personagem.Jogador;

public class Mochila {
    
    private List<Item> itens;

    public Mochila() {
        this.itens = new ArrayList<>();
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void removerItem(Item item) {
        this.itens.remove(item);
    }

    public void listarItens() {
        for (int i = 0; i < this.itens.size(); i++) {
            System.out.println("[" + i + "] " + this.itens.get(i).getNome() + " - " + this.itens.get(i).getDescricao());
        }
    }

    public void acessarMochila(Jogador jogador) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Mochila: ");
            this.listarItens();
            System.out.println("[99] Voltar");

            System.out.print("Escolha um item: ");
            int escolha = scanner.nextInt();

            if (escolha == 99) {
                break;
            }

            if (escolha < 0 || escolha >= this.itens.size()) {
                System.out.println("Escolha inválida.");
                continue;
            }

            this.itens.get(escolha).usar(jogador);
            this.removerItem(this.itens.get(escolha));
        }
    }
}
