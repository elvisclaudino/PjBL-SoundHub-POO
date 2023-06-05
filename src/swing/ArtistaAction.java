package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class ArtistaAction implements ActionListener {
        private JTextField catchNomeArtista; // cria o atributo texto que posteriormente vai captar o usuario
        private JComboBox catchSexoArtista;
        private JTextField catchIdadeArtista;
        private JTextField catchArtistaApelido;
        private JTextField catchNacionalidadeArtista;
        private JComboBox catchGeneroArtista;
        public ArtistaAction(JTextField catchNomeArtista, JComboBox catchSexoArtista, JTextField catchIdadeArtista, JTextField catchArtistaApelido, JTextField catchNacionalidadeArtista, JComboBox catchGeneroArtista){ //construtor
            this.catchNomeArtista = catchNomeArtista;
            this.catchSexoArtista = catchSexoArtista;
            this.catchIdadeArtista = catchIdadeArtista;
            this.catchArtistaApelido = catchArtistaApelido;
            this.catchNacionalidadeArtista = catchNacionalidadeArtista;
            this.catchGeneroArtista = catchGeneroArtista;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            String nomeArtista = catchNomeArtista.getText(); // GET recebe o valor do input
            String sexoArtista = (String)catchSexoArtista.getSelectedItem();
            String idadeArtista = catchIdadeArtista.getText();
            String apelidoArtista = catchArtistaApelido.getText();
            String nacionalidadeArtista = catchNacionalidadeArtista.getText();
            String generoArtista = (String)catchGeneroArtista.getSelectedItem();

            JOptionPane.showMessageDialog(null,"Artista Criado");
        }
    }

