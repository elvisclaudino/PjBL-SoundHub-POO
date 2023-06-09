package swing;

import com.example.Ouvinte;
import com.example.Writer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




    public class CriarOuvinteAction implements ActionListener {

        private JTextField catchNomeOuvinte; // cria o atributo texto que posteriormente vai captar o usuario
        private JComboBox catchSexoOuvinte;
        private JTextField catchIdadeOuvinte;
        private JTextField catchNacionalidadeOuvinte;
        private JFrame frame;
        public CriarOuvinteAction(JTextField catchNomeOuvinte, JComboBox catchSexoOuvinte, JTextField catchIdadeOuvinte, JTextField catchNacionalidadeOuvinte, JFrame frame){ //construtor
            this.catchNomeOuvinte = catchNomeOuvinte;
            this.catchSexoOuvinte = catchSexoOuvinte;
            this.catchIdadeOuvinte = catchIdadeOuvinte;
            this.catchNacionalidadeOuvinte = catchNacionalidadeOuvinte;
            this.frame = frame;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            String nomeOuvinte = catchNomeOuvinte.getText(); // GET recebe o valor do input
            String sexoOuvinte = (String)catchSexoOuvinte.getSelectedItem();
            int idadeOuvinte = Integer.parseInt(catchIdadeOuvinte.getText());
            String nacionalidadeOuvinte = catchNacionalidadeOuvinte.getText();

            Ouvinte ouvinte = new Ouvinte(nomeOuvinte, idadeOuvinte, sexoOuvinte, nacionalidadeOuvinte);
            Writer.adicionarOuvinteEmArquivo(ouvinte);

            JOptionPane.showMessageDialog(null,"Usuario Criado");
            frame.dispose();
        }

    }

