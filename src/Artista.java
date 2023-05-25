import java.util.ArrayList;

public class Artista extends Usuario{
    private String generoMusical;
    private String apelido;
    private ArrayList<Album> albums;
    public Artista(String nome, int idade, String genero, String nacionalidade, String generoMusical, String apelido) {
        super(nome, idade, genero, nacionalidade);
        this.generoMusical = generoMusical;
        this.apelido = apelido;
    }

    public void adicionarPlaylist(Album album) {
        albums.add(album);
    }
    public void removerPlaylist(Album album) {
        albums.remove(album);
    }
}
