package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlaylistGraficaAction implements ActionListener {
    private JTextField catchNomePlaylist;

    private JTextField catchNomeCriadorAlbum;


    public PlaylistGraficaAction(JTextField catchNomePlaylist, JTextField catchNomeCriadorAlbum){ //construtor
        this.catchNomePlaylist = catchNomePlaylist;
        this.catchNomeCriadorAlbum = catchNomeCriadorAlbum;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String NomePlaylist = catchNomePlaylist.getText(); // GET recebe o valor do input
        String NomeCriadorAlbum = catchNomeCriadorAlbum.getText(); // GET recebe o valor do input

        JOptionPane.showMessageDialog(null,"Playlist Criada");

    }
}
