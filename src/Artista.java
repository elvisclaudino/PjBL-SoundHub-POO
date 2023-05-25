public class Artista extends Usuario{
    private String generoMusical;
    private String apelido;
    public Artista(String nome, int idade, String genero, String nacionalidade, String generoMusical, String apelido) {
        super(nome, idade, genero, nacionalidade);
        this.generoMusical = generoMusical;
        this.apelido = apelido;
    }
}
