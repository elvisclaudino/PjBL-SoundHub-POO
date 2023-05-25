package swing;

import javax.swing.*;
import java.awt.*;

public class InterfaceGrafica {
    public static void main(String[] args) {
        //declara o jframe para criar a janela
        JFrame janela = new JFrame();
        // seta o titulo da janela
        janela.setTitle("Registrar Usuario - SoundHub -");
        //seta a largura e altura da janela
        janela.setSize(600,600);
        //seta a localização da janela
        janela.setLocation(500,300);
        //declara q ao fechar a janela o codigo para
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //cria o painel(um componente invisivel que nois usa para agrupar outros componentes dentro dle)
        JPanel painel =  new JPanel();
        //centraliaza os componentes do painel
        painel.setLayout(new GridBagLayout());
        //define q fica um componetne embaixo do outro


        //um componente label representa um texto no interface
        JLabel nomeLabel = new JLabel("Digite seu nome de usuario");
        //adiciona ao painel o componente label
        painel.add(nomeLabel);
        //cria a caixa de texto pro usuario digitar e seta o numero de colunas
        JTextField nomeField = new JTextField(10);
        painel.add(nomeField);

        JLabel senhaLabel = new JLabel("Digite sua senha");
        painel.add(senhaLabel);
        JTextField senhaField = new JTextField(10);
        painel.add(senhaField);


        //cria o botao
        JButton botao = new JButton("Criar Usuario");
        painel.add(botao);



        //adiciona o painel a janela
        janela.add(painel);
        //delcara q a janela é visivel
        janela.setVisible(true);
    }

}
