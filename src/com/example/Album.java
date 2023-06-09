package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Album extends Conteudo {
    private ArrayList<Musica> musicas;
    private int duracao;
    private Artista artista;

    public Album(String nome, String generoMusical, int anoDeLancamento, Artista artista){
        super(nome, generoMusical, anoDeLancamento);
        this.artista = artista;
        this.musicas = new ArrayList<>();
        this.duracao = 0;
    }
    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public ArrayList<Musica> obterListaMusicas() {
        return musicas;
    }

    @Override
    public void setDuracao() {
        int duracao = 0;
        for (Musica musica : obterListaMusicas()) {
            duracao += musica.getDuracao();
        }
        this.duracao = duracao;
    }

    @Override
    public int getDuracao() {
        return duracao;
    }

    public static Album adicionarAlbumAoArtista(Artista artista, Scanner scanner) {
        System.out.println("\nAdicionar Música ao Artista: " + artista.getNome());

        System.out.print("Nome da album: ");
        String nomeAlbum = scanner.nextLine();

        System.out.print("Gênero da música: ");
        String generoAlbum = scanner.nextLine();

        System.out.print("Ano de lançamento da música: ");
        int anoLancamentoAlbum = scanner.nextInt();
        scanner.nextLine();

        Album album = new Album(nomeAlbum, generoAlbum, anoLancamentoAlbum, artista);
        artista.adicionarAlbum(album);

        System.out.println("Album adicionada com sucesso!");
        return album;
    }
}