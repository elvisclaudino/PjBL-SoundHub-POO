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
    public ArrayList<MusicaPlaylist> obterListaMusicasPlaylist() {
        return null;
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

    public void adicionarAlbumAoArtista(Artista artista, Album album) {
        artista.adicionarAlbum(album);
    }

    public String getNomeArtista() {
        return artista.getNome();
    }
}