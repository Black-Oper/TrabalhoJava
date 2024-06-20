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

    // eu poderia fazer um simples comentário sobre a função acessarMochila, mas eu prefiro fazer um comentário sobre o comentário que eu poderia fazer sobre a função acessarMochila
    // dito isso
    // eu vou deixar aqui registrado um fato curioso sobre os guaxinins
    // eles podem emitir uma variedade de potentes vocalizações agudas e ásperas, que podem ser ouvidas de grandes distâncias

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
