import java.util.ArrayList;

public class Playlist implements Add{
    private String nome;
    private ArrayList<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica);
    }

    @Override
    public ArrayList<Musica> obterListaMusicas() {
        return musicas;
    }

    @Override
    public ArrayList<Album> obterAlbumMusicas() {
        return null;
    }


    @Override
    public String getNome() {
        return nome;
    }

}