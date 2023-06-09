package com.example;
import java.util.Scanner;

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

    public int getDuracao() {
        return duracao;
    }

    public Artista getArtista() {
        return artista;
    }

    public static Musica adicionarMusicaAoAlbum(Album album, Artista artista, Scanner scanner) {
        System.out.println("\nAdicionar Música ao Album: " + album.getNome());

        System.out.print("Nome da música: ");
        String nomeMusica = scanner.nextLine();

        System.out.print("Duração da música (em segundos): ");
        int duracao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Gênero da música: ");
        String genero = scanner.nextLine();

        System.out.print("Ano de lançamento da música: ");
        int anoLancamento = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Musica musica = new Musica(nomeMusica, artista, duracao, genero, anoLancamento);
        album.adicionarMusica(musica);

        System.out.println("Música adicionada com sucesso!");
        return musica;
    }
}