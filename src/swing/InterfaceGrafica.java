package swing;

import javax.swing.*;
import java.awt.*;

public class InterfaceGrafica {
    public static void main(String[] args) {
        // Declara o JFrame para criar a janela
        JFrame janela = new JFrame();
        janela.setTitle("Registrar Usuario - SoundHub -");
        janela.setSize(400, 400);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int espacamentoVertical = 10; // seta o tamanho do espaçamento

        // Cria o painel
        JPanel painel = new JPanel();
        painel.setLayout(new GridBagLayout());

        // Cria o objeto GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 10, 0, 10);

        // Componentes
        JLabel nomeLabel = new JLabel("Digite seu nome de usuário");
        JTextField nomeField = new JTextField(18);
        nomeField.setMaximumSize(new Dimension(200, nomeField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JComboBox tipoUsuario = new JComboBox();
        tipoUsuario.addItem("Selecione o tipo do usuario");
        tipoUsuario.addItem("Ouvinte");
        tipoUsuario.addItem("Artista");
        Dimension comboSize = tipoUsuario.getPreferredSize();
        comboSize.width = 200;
        comboSize.height = tipoUsuario.getPreferredSize().height;
        tipoUsuario.setPreferredSize(comboSize);
        tipoUsuario.setMaximumSize(comboSize);

        JComboBox sexo = new JComboBox();
        sexo.addItem("Selecione o seu sexo");
        sexo.addItem("Masculino");
        sexo.addItem("Feminino");
        sexo.addItem("Outro");
        comboSize = sexo.getPreferredSize();
        comboSize.width = 200;
        comboSize.height = sexo.getPreferredSize().height;
        sexo.setPreferredSize(comboSize);
        sexo.setMaximumSize(comboSize);

        JLabel senhaLabel = new JLabel("Digite sua senha");
        JTextField senhaField = new JTextField(18);
        senhaField.setMaximumSize(new Dimension(300, senhaField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JLabel idadeLabel = new JLabel("Insira sua idade");
        JTextField idadeField = new JTextField(18);
        idadeField.setMaximumSize(new Dimension(300, idadeField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JLabel nacionalidadeLabel = new JLabel("Insira sua nacionalidade");
        JTextField nacionalidadeField = new JTextField(18);
        nacionalidadeField.setMaximumSize(new Dimension(300, nacionalidadeField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JButton botao = new JButton("Criar Usuário");
        botao.setBackground(new Color(201, 201, 201));

        // Adiciona os componentes ao painel
        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(nomeLabel, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc); // cria um espaçamento entre os campos
        gbc.gridy++;
        painel.add(nomeField, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painel.add(tipoUsuario, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painel.add(sexo, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painel.add(senhaLabel, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painel.add(senhaField, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painel.add(idadeLabel, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painel.add(idadeField, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painel.add(nacionalidadeLabel, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painel.add(nacionalidadeField, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painel.add(botao, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalGlue(), gbc);

        // Adiciona o painel à janela
        janela.add(painel);
        janela.setVisible(true);
    }
}
