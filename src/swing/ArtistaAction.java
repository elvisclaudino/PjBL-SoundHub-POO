package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArtistaAction implements ActionListener {
    private JTextField catchNomeArtista;
    private JComboBox<String> catchSexoArtista;
    private JTextField catchIdadeArtista;
    private JTextField catchArtistaApelido;
    private JTextField catchNacionalidadeArtista;
    private JComboBox<String> catchGeneroArtista;

    public ArtistaAction(JTextField catchNomeArtista, JComboBox<String> catchSexoArtista, JTextField catchIdadeArtista,
                         JTextField catchArtistaApelido, JTextField catchNacionalidadeArtista, JComboBox<String> catchGeneroArtista) {
        this.catchNomeArtista = catchNomeArtista;
        this.catchSexoArtista = catchSexoArtista;
        this.catchIdadeArtista = catchIdadeArtista;
        this.catchArtistaApelido = catchArtistaApelido;
        this.catchNacionalidadeArtista = catchNacionalidadeArtista;
        this.catchGeneroArtista = catchGeneroArtista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nomeArtista = catchNomeArtista.getText();
        String sexoArtista = (String) catchSexoArtista.getSelectedItem();
        String idadeArtista = catchIdadeArtista.getText();
        String apelidoArtista = catchArtistaApelido.getText();
        String nacionalidadeArtista = catchNacionalidadeArtista.getText();
        String generoArtista = (String) catchGeneroArtista.getSelectedItem();

        JOptionPane.showMessageDialog(null, "Artista Criado");
    }
}
