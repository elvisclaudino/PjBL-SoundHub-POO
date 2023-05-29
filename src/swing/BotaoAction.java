package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoAction implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,"Usuario Criado");
    }
}
