package com.example;

public class MusicaPlaylist {
    private String nome;
    private int duracao;
    private String genero;
    private int anoLancamento;
    private String artista;

    public MusicaPlaylist(String nome, int duracao, String genero, int anoLancamento, String artista) {
        this.nome = nome;
        this.duracao = duracao;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.artista = artista;
    }

    public void adicionarMusicaAPlaylist(Playlist playlist, MusicaPlaylist musicaPlaylist) {
        playlist.adicionarMusicaPlaylist(musicaPlaylist);
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getArtista() {
        return artista;
    }

    public String getGeneroMusical() {
        return genero;
    }

    public int getLancamento() {
        return anoLancamento;
    }

}
