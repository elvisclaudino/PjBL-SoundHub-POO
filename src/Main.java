import com.example.Reader;
import swing.ArtistaGrafica;
import swing.OuvinteInterface;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;

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
        frame.setLayout(new GridLayout(8, 1));

        JButton artistaButton = new JButton("Criar Artista");
        JButton ouvinteButton = new JButton("Criar Ouvinte");
        JButton mostrarArtistasButton = new JButton("Mostrar Artistas");
        JButton mostrarMusicasButton = new JButton("Mostrar Músicas");
        JButton mostrarAlbunsButton = new JButton("Mostrar Álbuns");
        JButton mostrarOuvintesButton = new JButton("Mostrar Ouvintes");
        JButton mostrarPlaylistButton = new JButton("Mostrar Playlist");
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
                Reader.lerArtista();
            }
        });

        mostrarMusicasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reader.lerMusica();
            }
        });

        mostrarAlbunsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reader.lerAlbum();
            }
        });


        mostrarOuvintesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reader.lerOuvinte();
            }
        });

        mostrarPlaylistButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reader.lerPlaylist();
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
        frame.add(mostrarOuvintesButton);
        frame.add(mostrarPlaylistButton);
        frame.add(sairButton);

        frame.setVisible(true);
    }
}
