package com.example;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void lerArtista() {
        try {
            FileReader fileReader = new FileReader("artistas.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            JTextArea textArea = new JTextArea();
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                textArea.append(linha + "\n");
            }
            bufferedReader.close();

            JScrollPane scrollPane = new JScrollPane(textArea);

            JFrame janelaArtistas = new JFrame("Artistas Cadastrados");
            janelaArtistas.getContentPane().add(scrollPane);
            janelaArtistas.setSize(400, 400);
            janelaArtistas.setVisible(true);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void lerMusica() {
        try {
            FileReader fileReader = new FileReader("musicas.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            JTextArea textArea = new JTextArea();
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                textArea.append(linha + "\n");
            }
            bufferedReader.close();

            JScrollPane scrollPane = new JScrollPane(textArea);

            JFrame janelaMusicas = new JFrame("Músicas Cadastradas");
            janelaMusicas.getContentPane().add(scrollPane);
            janelaMusicas.setSize(400, 400);
            janelaMusicas.setVisible(true);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void lerAlbum() {
        try {
            FileReader fileReader = new FileReader("album.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            JTextArea textArea = new JTextArea();
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                textArea.append(linha + "\n");
            }
            bufferedReader.close();

            JScrollPane scrollPane = new JScrollPane(textArea);

            JFrame janelaAlbuns = new JFrame("Álbuns Cadastrados");
            janelaAlbuns.getContentPane().add(scrollPane);
            janelaAlbuns.setSize(400, 400);
            janelaAlbuns.setVisible(true);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void lerOuvinte() {
        try {
            FileReader fileReader = new FileReader("ouvintes.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            JTextArea textArea = new JTextArea();
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                textArea.append(linha + "\n");
            }
            bufferedReader.close();

            JScrollPane scrollPane = new JScrollPane(textArea);

            JFrame janelaOuvinte = new JFrame("Ouvintes Cadastrados");
            janelaOuvinte.getContentPane().add(scrollPane);
            janelaOuvinte.setSize(400, 400);
            janelaOuvinte.setVisible(true);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void lerPlaylist() {
        try {
            FileReader fileReader = new FileReader("playlist.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            JTextArea textArea = new JTextArea();
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                textArea.append(linha + "\n");
            }
            bufferedReader.close();

            JScrollPane scrollPane = new JScrollPane(textArea);

            JFrame janelaPlaylist = new JFrame("Playlist Cadastradas");
            janelaPlaylist.getContentPane().add(scrollPane);
            janelaPlaylist.setSize(400, 400);
            janelaPlaylist.setVisible(true);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
