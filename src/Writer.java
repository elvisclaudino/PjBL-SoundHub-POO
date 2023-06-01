import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {
    public static void adicionarArtistaEmArquivo(Artista artista) {
        try {
            FileWriter fileWriter = new FileWriter("artistas.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Nome: " + artista.getNome());
            printWriter.println("Idade: " + artista.getIdade());
            printWriter.println("Gênero: " + artista.getGenero());
            printWriter.println("Nacionalidade: " + artista.getNacionalidade());
            printWriter.println("=============================================");

            printWriter.close();
            fileWriter.close();

            System.out.println("Artista adicionado ao arquivo artistas.txt");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao adicionar o artista ao arquivo.");
            e.printStackTrace();
        }
    }

    public static void adicionarOuvinteEmArquivo(Ouvinte ouvinte) {
        try {
            FileWriter fileWriter = new FileWriter("ouvintes.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Nome: " + ouvinte.getNome());
            printWriter.println("Idade: " + ouvinte.getIdade());
            printWriter.println("Gênero: " + ouvinte.getGenero());
            printWriter.println("Nacionalidade: " + ouvinte.getNacionalidade());
            printWriter.println("=============================================");

            printWriter.close();
            fileWriter.close();

            System.out.println("Ouvinte adicionado ao arquivo ouvintes.txt");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao adicionar o ouvinte ao arquivo.");
            e.printStackTrace();
        }
    }
}
