import classes.personagem.Jogador;

import java.io.*;

public class EstadoJogo implements Serializable {
    static final String nomeArquivoSave = "salvar.dat";
    static final File arquivoSave = new File(nomeArquivoSave);

    static boolean arquivoNaoExiste() {
        return !arquivoSave.exists() || !arquivoSave.isFile();
    }

    static void criarArquivo() {
        try {
            if (arquivoSave.createNewFile()) {
                System.out.println("Estamos configurando seu salvamento de progresso.");
            }
        } catch (IOException e) {
            System.out.println("Erro: Não conseguimos configurar seu salvamento de progresso.");
        }
    }

    static Jogador carregarProgresso() {
        try (ObjectInputStream dadosProgresso = new ObjectInputStream(new FileInputStream(nomeArquivoSave))) {
            return (Jogador) dadosProgresso.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro: Não foi possível carregar seu progresso feito.");
            return null;
        }
    }

    static void salvarProgresso(Jogador jogador) {
        try (ObjectOutputStream dadosProgresso = new ObjectOutputStream(new FileOutputStream(nomeArquivoSave))) {
            dadosProgresso.writeObject(jogador);
        } catch (IOException e) {
            System.out.println("Erro: Não foi possível recuperar seu progresso.");
        }
    }
}
