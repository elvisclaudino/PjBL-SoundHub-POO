public abstract class Usuario {
    private String nome;
    private int idade;
    private String genero;
    private String nacionalidade;

    public Usuario(String nome, int idade, String genero, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}