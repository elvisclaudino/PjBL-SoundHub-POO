package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.example.Artista;
import com.example.Writer;

public class ArtistaAction implements ActionListener {
    private JTextField catchNomeArtista;
    private JComboBox<String> catchSexoArtista;
    private JTextField catchIdadeArtista;
    private JTextField catchArtistaApelido;
    private JTextField catchNacionalidadeArtista;
    private JComboBox<String> catchGeneroArtista;
    private JFrame frame;

    public ArtistaAction(JTextField catchNomeArtista, JComboBox<String> catchSexoArtista, JTextField catchIdadeArtista,
                         JTextField catchArtistaApelido, JTextField catchNacionalidadeArtista, JComboBox<String> catchGeneroArtista, JFrame frame) {
        this.catchNomeArtista = catchNomeArtista;
        this.catchSexoArtista = catchSexoArtista;
        this.catchIdadeArtista = catchIdadeArtista;
        this.catchArtistaApelido = catchArtistaApelido;
        this.catchNacionalidadeArtista = catchNacionalidadeArtista;
        this.catchGeneroArtista = catchGeneroArtista;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nomeArtista = catchNomeArtista.getText();
        String sexoArtista = (String) catchSexoArtista.getSelectedItem();
        int idadeArtista = Integer.parseInt(catchIdadeArtista.getText());
        String apelidoArtista = catchArtistaApelido.getText();
        String nacionalidadeArtista = catchNacionalidadeArtista.getText();
        String generoArtista = (String) catchGeneroArtista.getSelectedItem();

        Artista artista = new Artista(nomeArtista, idadeArtista, sexoArtista, nacionalidadeArtista, generoArtista, apelidoArtista);
        Writer.adicionarArtistaEmArquivo(artista);
        JOptionPane.showMessageDialog(null, "Artista Criado");
        frame.dispose();
    }
}
