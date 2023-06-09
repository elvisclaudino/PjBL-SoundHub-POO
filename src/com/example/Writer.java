package com.example;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {
    public static void adicionarArtistaEmArquivo(Artista artista) {
        try {
            FileWriter fileWriter = new FileWriter("artistas.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Nome: " + artista.getNome());
            printWriter.println("Idade: " + artista.getIdade());
            printWriter.println("Gênero: " + artista.getGenero());
            printWriter.println("Nacionalidade: " + artista.getNacionalidade());
            printWriter.println("=============================================");

            printWriter.close();
            fileWriter.close();

            System.out.println("Artista adicionado ao arquivo artistas.txt");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao adicionar o artista ao arquivo.");
            e.printStackTrace();
        }
    }

    public static void adicionarOuvinteEmArquivo(Ouvinte ouvinte) {
        try {
            FileWriter fileWriter = new FileWriter("ouvintes.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Nome: " + ouvinte.getNome());
            printWriter.println("Idade: " + ouvinte.getIdade());
            printWriter.println("Gênero: " + ouvinte.getGenero());
            printWriter.println("Nacionalidade: " + ouvinte.getNacionalidade());
            printWriter.println("=============================================");

            printWriter.close();
            fileWriter.close();

            System.out.println("Ouvinte adicionado ao arquivo ouvintes.txt");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao adicionar o ouvinte ao arquivo.");
            e.printStackTrace();
        }
    }

    public static void adicionarAlbumEmArquivo(Album album) {
        try {
            FileWriter fileWriter = new FileWriter("album.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            album.setDuracao();

            printWriter.println("Nome: " + album.getNome());
            printWriter.println("Artista: " + album.getNomeArtista());
            printWriter.println("Músicas do album: ");
            for (Musica musica : album.obterListaMusicas()) {
                printWriter.println("- " + musica.getNome() + " - " + musica.getDuracao() + "s");
            }
            printWriter.println("Duração: " + album.getDuracao() + "s");
            printWriter.println("=============================================");

            printWriter.close();
            fileWriter.close();

            System.out.println("Ouvinte adicionado ao arquivo ouvintes.txt");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao adicionar o ouvinte ao arquivo.");
            e.printStackTrace();
        }
    }

    public static void adicionarMusicaEmArquivo(Musica musica, Album album) {
        try {
            FileWriter fileWriter = new FileWriter("musicas.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Nome: " + musica.getNome());
            printWriter.println("Artista: " + musica.getNomeArtista());
            printWriter.println("Genero: " + musica.getGeneroMusical());
            printWriter.println("Duração: " + musica.getDuracao());
            printWriter.println("Duração: " + musica.getLancamento());
            printWriter.println("Album: " + album.getNome());
            printWriter.println("=============================================");

            printWriter.close();
            fileWriter.close();

            System.out.println("Ouvinte adicionado ao arquivo musicas.txt");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao adicionar a música ao arquivo.");
            e.printStackTrace();
        }
    }

}
