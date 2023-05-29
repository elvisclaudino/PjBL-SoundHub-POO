package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoAction implements ActionListener {

    private JTextField texto; // cria o atributo texto que posteriormente vai captar o usuario
    public BotaoAction(JTextField texto){ //construtor
        this.texto = texto;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String nome = texto.getText(); // GET recebe o valor do input
        JOptionPane.showMessageDialog(null, "Foi digitado"+ nome);
        //JOptionPane.showMessageDialog(null,"Usuario Criado");
         }

}
