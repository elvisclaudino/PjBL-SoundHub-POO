package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




    public class CriarOuvinteAction implements ActionListener {

        private JTextField catchNomeOuvinte; // cria o atributo texto que posteriormente vai captar o usuario
        private JComboBox catchSexoOuvinte;
        private JTextField catchIdadeOuvinte;
        private JTextField catchNacionalidadeOuvinte;
        public CriarOuvinteAction(JTextField catchNomeOuvinte, JComboBox catchSexoOuvinte, JTextField catchIdadeOuvinte, JTextField catchNacionalidadeOuvinte){ //construtor
            this.catchNomeOuvinte = catchNomeOuvinte;
            this.catchSexoOuvinte = catchSexoOuvinte;
            this.catchIdadeOuvinte = catchIdadeOuvinte;
            this.catchNacionalidadeOuvinte = catchNacionalidadeOuvinte;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            String nomeOuvinte = catchNomeOuvinte.getText(); // GET recebe o valor do input
            String sexoOuvinte = (String)catchSexoOuvinte.getSelectedItem();
            String idadeOuvinte = catchIdadeOuvinte.getText();
            String nacionalidadeOuvinte = catchNacionalidadeOuvinte.getText();

            JOptionPane.showMessageDialog(null,"Usuario Criado");
        }

    }

