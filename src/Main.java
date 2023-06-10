import swing.ArtistaGrafica;
import swing.OuvinteInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
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
                    frame.dispose();
                }
            });

            ouvinteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    OuvinteInterface ouvinteInterface = new OuvinteInterface();
                    frame.dispose();
                }
            });

            mostrarArtistasButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        // Abre o arquivo de texto contendo as músicas
                        FileReader fileReader = new FileReader("artistas.txt");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);

                        // Lê cada linha do arquivo e exibe no console
                        System.out.println("ARTISTAS CADASTRADOS");
                        System.out.println("=============================================");
                        String linha;
                        while ((linha = bufferedReader.readLine()) != null) {
                            System.out.println(linha);
                        }

                        bufferedReader.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

            mostrarMusicasButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        // Abre o arquivo de texto contendo as músicas
                        FileReader fileReader = new FileReader("musicas.txt");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);

                        // Lê cada linha do arquivo e exibe no console
                        System.out.println("MÚSICAS CADASTRADAS");
                        System.out.println("=============================================");
                        String linha;
                        while ((linha = bufferedReader.readLine()) != null) {
                            System.out.println(linha);
                        }

                        bufferedReader.close();
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

                        // Lê cada linha do arquivo e exibe no console
                        System.out.println("ÁLBUNS CADASTRADOS");
                        System.out.println("=============================================");
                        String linha;
                        while ((linha = bufferedReader.readLine()) != null) {
                            System.out.println(linha);
                        }

                        bufferedReader.close();
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
        });
    }
}



