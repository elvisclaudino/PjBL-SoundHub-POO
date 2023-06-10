package com.example;
import java.util.ArrayList;

public class Playlist extends Conteudo{
    private Ouvinte ouvinte;
    private ArrayList<Musica> musicas;
    private int duracao;

    public Playlist(String nome, String genero, int anoDeLancamento, Ouvinte ouvinte) {
        super(nome, genero, anoDeLancamento);
        this.ouvinte = ouvinte;
        this.musicas = new ArrayList<>();
        this.duracao = 0;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica);
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

    public void adicionarPlaylistAoArtista(Ouvinte ouvinte, Playlist playlist) {
        ouvinte.adicionarPlaylist(playlist);
    }
}