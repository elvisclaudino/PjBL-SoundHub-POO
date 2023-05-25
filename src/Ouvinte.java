import java.util.ArrayList;

public class Ouvinte extends Usuario{
    private ArrayList<Lista> playlists;
    public Ouvinte(String nome, int idade, String genero, String nacionalidade) {
        super(nome, idade, genero, nacionalidade);
    }

    public void adicionarPlaylist(Lista playlist) {
        playlists.add(playlist);
    }
    public void removerPlaylist(Lista playlist) {
        playlists.remove(playlist);
    }
}
