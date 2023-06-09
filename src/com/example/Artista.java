package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Artista extends Usuario{
    private String generoMusical;
    private String apelido;
    private ArrayList<Album> albums;

    public Artista(String nome, int idade, String genero, String nacionalidade, String generoMusical, String apelido) {
        super(nome, idade, genero, nacionalidade);
        this.generoMusical = generoMusical;
        this.apelido = apelido;
        albums = new ArrayList<>();
    }

    public void adicionarAlbum(Album album) {
        albums.add(album);
    }
    public void removerAlbum(Album album) {
        albums.remove(album);
    }
}