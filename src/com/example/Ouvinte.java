package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Ouvinte extends Usuario{
    private ArrayList<Playlist> playlists;
    public Ouvinte(String nome, int idade, String genero, String nacionalidade) {
        super(nome, idade, genero, nacionalidade);
        playlists = new ArrayList<>();
    }

    public void adicionarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }
    public void removerPlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }
}