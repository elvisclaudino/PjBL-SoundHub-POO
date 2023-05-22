public class Album {
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
