import java.util.ArrayList;
public class Album implements Add {
    private ArrayList<Musica> listaMusicas;
    private String nome;
    private String generoMusical;
    private float duracao;
    private String dataLancamento;
    private String artista;

    public Album(String nome, String generoMusical, float duracao, String dataLancamento, String artista){
        this.nome = nome;
        this.generoMusical = generoMusical;
        this.duracao = duracao;
        this.dataLancamento = dataLancamento;
        this.artista = artista;
    }
    public void adicionarAlbum(Musica musica) {
        listaMusicas.add(musica);
    }

    @Override
    public void adicionarMusica(Musica musica) {

    }

    @Override
    public ArrayList<Musica> obterListaMusicas() {
        return null;
    }

    public String getNome(){
        return nome;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }
    public float getDuracao() {
        return duracao;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public String getArtista() {
        return artista;
    }
}
