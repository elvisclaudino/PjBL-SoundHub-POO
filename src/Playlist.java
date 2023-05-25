import java.util.ArrayList;
import java.util.List;

public class playlist {
    private String nome;
    private List<Musica> musicas;

    public playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica);
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

}
