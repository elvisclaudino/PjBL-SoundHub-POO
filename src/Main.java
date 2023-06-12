import swing.ArtistaGrafica;
import swing.OuvinteInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            exibirMenuPrincipal();
        });
    }

    public static void exibirMenuPrincipal() {
        JFrame frame = new JFrame("Menu");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(6, 1));

        JButton artistaButton = new JButton("Criar Artista");
        JButton ouvinteButton = new JButton("Criar Ouvinte");
        JButton mostrarArtistasButton = new JButton("Mostrar Artistas");
        JButton mostrarMusicasButton = new JButton("Mostrar Músicas");
        JButton mostrarAlbunsButton = new JButton("Mostrar Álbuns");
        JButton sairButton = new JButton("Sair");

        artistaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArtistaGrafica artistaGrafica = new ArtistaGrafica();
            }
        });

        ouvinteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OuvinteInterface ouvinteInterface = new OuvinteInterface();
            }
        });

        mostrarArtistasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        });

        mostrarMusicasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        });

        mostrarAlbunsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Encerra o programa ao clicar em "Sair"
            }
        });

        frame.add(artistaButton);
        frame.add(ouvinteButton);
        frame.add(mostrarArtistasButton);
        frame.add(mostrarMusicasButton);
        frame.add(mostrarAlbunsButton);
        frame.add(sairButton);

        frame.setVisible(true);
    }
}
