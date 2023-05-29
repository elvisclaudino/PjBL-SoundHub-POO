public abstract class Conteudo implements Add{
    private String nome;
    private String generoMusical;
    private int anoDeLancamento;

    public Conteudo(String nome, String generoMusical, int anoDeLancamento) {
        this.nome = nome;
        this.generoMusical = generoMusical;
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
