package swing;

import javax.swing.*;
import java.awt.*;

public class PlaylistGrafica {
    public PlaylistGrafica() {
        JFrame Playlistjanela = new JFrame();
        Playlistjanela.setTitle("Registrar Playlist - SoundHub -");
        Playlistjanela.setSize(400, 400);
        Playlistjanela.setLocationRelativeTo(null);
        Playlistjanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int espacamentoVertical = 8;

        JPanel PlaylistPainel = new JPanel();
        PlaylistPainel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 10, 0, 10);

        JLabel nomePlaylistLabel = new JLabel("Digite o nome da playlist");
        JTextField nomePlaylistField = new JTextField(18);
        nomePlaylistField.setMaximumSize(new Dimension(200, nomePlaylistField.getPreferredSize().height));

        JLabel NomeCriadorAlbumLabel = new JLabel("Digite o nome do artista");
        JTextField NomeCriadorAlbumField = new JTextField(18);
        NomeCriadorAlbumField.setMaximumSize(new Dimension(200, NomeCriadorAlbumField.getPreferredSize().height));

        JButton criarPlaylist = new JButton("Criar Playlist");
        criarPlaylist.setBackground(new Color(201, 201, 201));
        PlaylistGraficaAction action = new PlaylistGraficaAction(nomePlaylistField, NomeCriadorAlbumField);
        criarPlaylist.addActionListener(action);

        gbc.gridx = 0;
        gbc.gridy = 0;
        PlaylistPainel.add(nomePlaylistLabel, gbc);
        gbc.gridy++;
        PlaylistPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        PlaylistPainel.add(nomePlaylistField, gbc);
        gbc.gridy++;
        PlaylistPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        PlaylistPainel.add(NomeCriadorAlbumLabel, gbc);
        gbc.gridy++;
        PlaylistPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        PlaylistPainel.add(NomeCriadorAlbumField, gbc);
        gbc.gridy++;
        PlaylistPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        PlaylistPainel.add(criarPlaylist, gbc);
        gbc.gridy++;

        Playlistjanela.add(PlaylistPainel);
        Playlistjanela.setVisible(true);
    }
}