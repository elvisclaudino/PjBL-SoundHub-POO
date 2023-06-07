package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlbumGraficoAcao implements ActionListener{
    private JTextField catchArtistaAlbum;

    private JTextField catchnomeAlbum;

    public AlbumGraficoAcao(JTextField catchArtistaAlbum, JTextField catchnomeAlbum){ //construtor
        this.catchArtistaAlbum = catchArtistaAlbum;
        this.catchnomeAlbum = catchnomeAlbum;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String ArtistaAlbum = catchArtistaAlbum.getText(); // GET recebe o valor do input
        String NomeAlbum = catchnomeAlbum.getText();

        //String dados1 = "Nome Album Artista = " + ArtistaAlbum + " o nome do album = " + NomeAlbum;

        JOptionPane.showMessageDialog(null,"Usuario Criado");
        //JOptionPane.showMessageDialog(null,dados1);


    }
}
