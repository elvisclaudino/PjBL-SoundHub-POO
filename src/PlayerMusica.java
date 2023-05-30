import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PlayerMusica {
    private static final String NOME_ARQUIVO = "musicas.txt";

    public static void main(String[] args) {
        adicionarMusicas();
        lerMusicas();
    }

    public static void adicionarMusicas() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO, true))) {
            Scanner scanner = new Scanner(System.in);

            String resposta;
            do {
                System.out.print("Digite o nome da música: ");
                String nome = scanner.nextLine();

                System.out.print("Digite o nome do artista: ");
                String nomeArtista = scanner.nextLine();

                System.out.print("Digite a duração da música (em segundos): ");
                int duracao = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o gênero da música: ");
                String genero = scanner.nextLine();

                System.out.print("Digite o ano de lançamento da música: ");
                int anoLancamento = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o gênero musical do artista: ");
                String generoMusical = scanner.nextLine();

                Artista artista = new Artista(nomeArtista, generoMusical);

                Musica musica = new Musica(nome, artista, duracao, genero, anoLancamento);

                String musicaFormatada =
                        musica.getNome() + ";" +
                                musica.getArtista().getNome() + ";" +
                                musica.getDuracao() + ";" +
                                musica.getGenero() + ";" +
                                musica.getAnoLancamento();

                writer.write(musicaFormatada);
                writer.newLine();

                System.out.print("Deseja adicionar outra música? (sim/nao): ");
                resposta = scanner.nextLine();
            } while (resposta.equalsIgnoreCase("sim"));

            System.out.println("Músicas adicionadas com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao adicionar músicas: " + e.getMessage());
        }
    }

    public static void lerMusicas() {
        try (Scanner scanner = new Scanner(new FileReader(NOME_ARQUIVO))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] atributos = linha.split(";");

                String nome = atributos[0];
                String nomeArtista = atributos[1];
                int duracao = Integer.parseInt(atributos[2]);
                String genero = atributos[3];
                int anoLancamento = Integer.parseInt(atributos[4]);

                String generoMusical = atributos[5];

                Artista artista = new Artista(nomeArtista, generoMusical);

                Musica musica = new Musica(nome, artista, duracao, genero, anoLancamento);

                System.out.println("Nome: " + musica.getNome());
                System.out.println("Artista: " + musica.getArtista().getNome());
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler músicas: " + e.getMessage());
        }
    }
}
