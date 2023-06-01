import java.util.ArrayList;
import java.util.Scanner;

public class Artista extends Usuario{
    private String generoMusical;
    private String apelido;
    private ArrayList<Album> albums;

    public Artista(String nome, int idade, String genero, String nacionalidade, String generoMusical, String apelido) {
        super(nome, idade, genero, nacionalidade);
        this.generoMusical = generoMusical;
        this.apelido = apelido;
        albums = new ArrayList<>();
    }

    public void adicionarAlbum(Album album) {
        albums.add(album);
    }
    public void removerAlbum(Album album) {
        albums.remove(album);
    }

    public static Artista criarArtista(Scanner scanner) {
        System.out.println("==== Criar Artista ====");
        System.out.print("Nome do artista: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do artista: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Gênero do artista: ");
        String genero = scanner.nextLine();

        System.out.print("Nacionalidade do artista: ");
        String nacionalidade = scanner.nextLine();

        System.out.print("Gênero musical do artista: ");
        String generoMusical = scanner.nextLine();

        System.out.print("Apelido do artista: ");
        String apelido = scanner.nextLine();

        Artista artista = new Artista(nome, idade, genero, nacionalidade, generoMusical, apelido);
        System.out.println("Artista criado com sucesso!");

        return artista;
    }
}