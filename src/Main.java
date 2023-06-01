import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void exibirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Criar artista");
        System.out.println("2. Criar ouvinte");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Artista artista = Artista.criarArtista(scanner);
                    Album album = Album.adicionarAlbumAoArtista(artista, scanner);
                    Musica musica = Musica.adicionarMusicaAoAlbum(album, artista, scanner);
                    Musica musica2 = Musica.adicionarMusicaAoAlbum(album, artista, scanner);
                    Musica musica3 = Musica.adicionarMusicaAoAlbum(album, artista, scanner);
                    Writer.adicionarArtistaEmArquivo(artista);
                    Writer.adicionarAlbumEmArquivo(album);
                    break;
                case 2:
                    Ouvinte ouvinte = Ouvinte.criarOuvinte(scanner);
                    Writer.adicionarOuvinteEmArquivo(ouvinte);
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamento!");
            }
        }
    }
}
