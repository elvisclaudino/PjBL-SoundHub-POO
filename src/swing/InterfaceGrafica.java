import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class InterfaceGrafica {
    public static void main(String[] args) {
        // Declara o JFrame para criar a janela
        JFrame janela = new JFrame();
        janela.setTitle("Registrar Usuario - SoundHub -");
        janela.setSize(400, 400);
        janela.setLocation(500, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int espacamentoVertical = 10; //seta o tamanho do espaçamento


        // Cria o painel
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Componentes
        JLabel nomeLabel = new JLabel("Digite seu nome de usuário");
        JTextField nomeField = new JTextField(10);
        nomeField.setMaximumSize(new Dimension(200, nomeField.getPreferredSize().height)); //seta um tamanho para os campos de texto


        JComboBox tipoUsuario = new JComboBox();
        tipoUsuario.addItem("Selecione");
        tipoUsuario.addItem("Ouvinte");
        tipoUsuario.addItem("Artista");
        Dimension comboSize = tipoUsuario.getPreferredSize();
        comboSize.width = 200;
        comboSize.height = tipoUsuario.getPreferredSize().height;
        tipoUsuario.setPreferredSize(comboSize);
        tipoUsuario.setMaximumSize(comboSize);

        JComboBox sexo = new JComboBox();
        sexo.addItem("Selecione");
        sexo.addItem("Masculino");
        sexo.addItem("Feminino");
        sexo.addItem("Outro");
        comboSize = sexo.getPreferredSize();
        comboSize.width = 200;
        comboSize.height = sexo.getPreferredSize().height;
        sexo.setPreferredSize(comboSize);
        sexo.setMaximumSize(comboSize);

        JLabel senhaLabel = new JLabel("Digite sua senha");
        JTextField senhaField = new JTextField(10);
        senhaField.setMaximumSize(new Dimension(200, senhaField.getPreferredSize().height)); //seta um tamanho para os campos de texto


        JLabel idadeLabel = new JLabel("Insira sua idade");
        JTextField idadeField = new JTextField(10);
        idadeField.setMaximumSize(new Dimension(200, idadeField .getPreferredSize().height)); //seta um tamanho para os campos de texto


        JLabel nacionalidadeLabel = new JLabel("Insira sua nacionalidade");
        JTextField nacionalidadeField = new JTextField(10);
        nacionalidadeField.setMaximumSize(new Dimension(200, nacionalidadeField.getPreferredSize().height)); //seta um tamanho para os campos de texto


        JButton botao = new JButton("Criar Usuário");
        botao.setBackground(new Color(201, 201, 201));

        // Adiciona os componentes ao painel
        painel.add(nomeLabel);
        painel.add(Box.createVerticalStrut(espacamentoVertical)); // cria um espaçamento entre os campos
        painel.add(nomeField);
        painel.add(Box.createVerticalStrut(espacamentoVertical));
        painel.add(tipoUsuario);
        painel.add(Box.createVerticalStrut(espacamentoVertical));
        painel.add(sexo);
        painel.add(Box.createVerticalStrut(espacamentoVertical));
        painel.add(senhaLabel);
        painel.add(Box.createVerticalStrut(espacamentoVertical));
        painel.add(senhaField);
        painel.add(Box.createVerticalStrut(espacamentoVertical));
        painel.add(idadeLabel);
        painel.add(Box.createVerticalStrut(espacamentoVertical));
        painel.add(idadeField);
        painel.add(Box.createVerticalStrut(espacamentoVertical));
        painel.add(nacionalidadeLabel);
        painel.add(Box.createVerticalStrut(espacamentoVertical));
        painel.add(nacionalidadeField);
        painel.add(Box.createVerticalStrut(espacamentoVertical));
        painel.add(botao);
        painel.add(Box.createVerticalStrut(espacamentoVertical));

        // Adiciona o painel à janela
        janela.add(painel);
        janela.setVisible(true);
    }
}