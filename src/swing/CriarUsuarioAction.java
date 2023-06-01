package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CriarUsuarioAction implements ActionListener {

    private JTextField catchNome; // cria o atributo texto que posteriormente vai captar o usuario
    private JComboBox catchTipoUser;
    private JComboBox catchSexo;
    private JTextField catchIdade;
    private JTextField catchNacionalidade;
    public CriarUsuarioAction(JTextField catchNome, JComboBox catchTipoUser, JComboBox catchSexo, JTextField catchIdade, JTextField catchNacionalidade){ //construtor
        this.catchNome = catchNome;
        this.catchTipoUser = catchTipoUser;
        this.catchSexo = catchSexo;
        this.catchIdade = catchIdade;
        this.catchNacionalidade = catchNacionalidade;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String nome = catchNome.getText(); // GET recebe o valor do input
        String tipoUser= (String)catchTipoUser.getSelectedItem();
        String sexo = (String)catchSexo.getSelectedItem();
        String idade = catchIdade.getText();
        String nacionalidade = catchNacionalidade.getText();



        JOptionPane.showMessageDialog(null,"Usuario Criado");
         }

}
