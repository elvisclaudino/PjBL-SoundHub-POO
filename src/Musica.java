public class Musica {

    private String nome;
    private String artista;
    private String genero;
    private float duracao;

    private String dataLancamento;

    public Musica(String nome, String artista, String genero, float duracao, String dataLancamento){
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.duracao = duracao;
        this.dataLancamento = dataLancamento;
    }

    public String getNome(){
        return nome;
    }

    public String getArtista(){
        return artista;
    }
}
