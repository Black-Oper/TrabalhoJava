import classes.personagem.Jogador;

import java.io.*;

public class EstadoJogo {
    static final String nomeArquivoSave = "salvar.dat";
    static final File arquivoSave = new File(nomeArquivoSave);
    Jogador dadosJogador;

    // Essa função construtora recebe um objeto contendo os dados lidos do arquivo de save.
    // e também realiza uma coerção  segura de tipo e repassa os dados para os respectivos campos;
    EstadoJogo(Object dadosLidos) {
        if (dadosLidos instanceof EstadoJogo dadosLidosJogo) {
            this.dadosJogador = dadosLidosJogo.dadosJogador;
        }
        this.dadosJogador = null;
    }

    // Checa se o arquivo onde o progresso será salvo existe.
    static boolean verificarArquivo() {
        return arquivoSave.exists() && arquivoSave.isFile();
    }

    // Cria o arquivo de salvamento.
    static void criarArquivo() {
        try {
            arquivoSave.createNewFile();
        } catch (IOException e) {
            System.out.println("Erro: Não conseguimos configurar seu salvamento de progresso.");
        }
    }

    // Pega os dados do progresso presentes no arquivo de salvamento e retorna o objeto com essas informações.
    static Object carregarProgreso() {
        try (ObjectInputStream dadosLidos = new ObjectInputStream(new FileInputStream(arquivoSave))) {
            return dadosLidos.readObject();
        } catch (IOException | ClassNotFoundException e){
            return null;
        }
    }

    void salvarProgresso(Jogador jogador) {
        try (ObjectOutputStream progressoJogo = new ObjectOutputStream(new FileOutputStream(arquivoSave))) {
            this.dadosJogador = jogador;
        } catch (IOException e) {
            System.out.println("Erro: Infelizmente não conseguimos salvar seu progresso. Tente novamente.");
        }
    }
}
