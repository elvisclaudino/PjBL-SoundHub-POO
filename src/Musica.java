public class Musica {
    private String nome;
    private Artista artista;
    private int duracao;
    private String genero;
    private int anoLancamento;

    public Musica(String nome, Artista artista, int duracao, String genero, int anoLancamento) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public Artista getArtista() {
        return artista;
    }
}

