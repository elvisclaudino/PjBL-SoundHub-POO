import swing.ArtistaGrafica;
import swing.OuvinteInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menu");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setLayout(new GridLayout(3, 1));

            JButton artistaButton = new JButton("Criar Artista");
            JButton ouvinteButton = new JButton("Criar Ouvinte");
            JButton sairButton = new JButton("Sair");

            artistaButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ArtistaGrafica artistaGrafica = new ArtistaGrafica();
                    frame.dispose();
                }
            });

            ouvinteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    OuvinteInterface ouvinteInterface = new OuvinteInterface();
                    frame.dispose();
                }
            });

            sairButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0); // Encerra o programa ao clicar em "Sair"
                }
            });

            frame.add(artistaButton);
            frame.add(ouvinteButton);
            frame.add(sairButton);

            frame.setVisible(true);
        });
    }
}



