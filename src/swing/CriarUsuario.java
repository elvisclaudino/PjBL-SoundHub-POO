package swing;

import javax.swing.*;
import java.awt.*;

public class CriarUsuario {
    public static void main(String[] args) {

        JFrame janela = new JFrame(); // Declara o JFrame para criar a janela
        janela.setTitle("Registrar Usuario - SoundHub -");
        janela.setSize(400, 400); // seta tamanho da janela
        janela.setLocationRelativeTo(null); //posiciona a janela no centro da tela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quando fechar a janela para o codigo
        int espacamentoVertical = 10; // seta o tamanho do espaçamento

        // Cria o painel
        JPanel painel = new JPanel();
        painel.setLayout(new GridBagLayout()); // seta o grid layout(parecido com flex(modelo estilização)


        GridBagConstraints gbc = new GridBagConstraints();// Cria o objeto GridBagConstraints
        gbc.anchor = GridBagConstraints.WEST; //Posiciona a esquerda o objeto
        gbc.insets = new Insets(0, 10, 0, 10); // cria a margin semelhante ao css

        // Componentes
        JLabel nomeLabel = new JLabel("Digite seu nome de usuário"); // label usuario
        JTextField nomeField = new JTextField(18); // input type text(campo)
        nomeField.setMaximumSize(new Dimension(200, nomeField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JComboBox tipoUsuario = new JComboBox(); //Cria uma caixa de selação
        tipoUsuario.addItem("Selecione o tipo do usuario");//opções
        tipoUsuario.addItem("Ouvinte");
        tipoUsuario.addItem("Artista");
        Dimension comboSize = tipoUsuario.getPreferredSize(); //dimensiona o seletor
        comboSize.width = 200; // seta a width do campo seletor
        comboSize.height = tipoUsuario.getPreferredSize().height; // seta o height de acordo com o campo preenchido
        tipoUsuario.setPreferredSize(comboSize); //seta de acordo com os valores presentes
        tipoUsuario.setMaximumSize(comboSize); // seta para não ultrapassar os limites


        JComboBox sexo = new JComboBox(); // Cria uma caixa de seleção
        sexo.addItem("Selecione o seu sexo"); //opções
        sexo.addItem("Masculino");
        sexo.addItem("Feminino");
        sexo.addItem("Outro");
        sexo.addItem("Prefiro não Informar");
        comboSize = sexo.getPreferredSize(); //dimensiona
        comboSize.width = 200; // seta a width do campo seletor
        comboSize.height = sexo.getPreferredSize().height; // seta o height de acordo com o campo preenchido
        sexo.setPreferredSize(comboSize); // seta de acordo com os valores presentes
        sexo.setMaximumSize(comboSize); // seta para não ultrapassar os limites

        JLabel senhaLabel = new JLabel("Digite sua senha"); // label senha
        JTextField senhaField = new JTextField(18); // cria o campo de input e seta o tamanho
        senhaField.setMaximumSize(new Dimension(300, senhaField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JLabel idadeLabel = new JLabel("Insira sua idade"); // label idade
        JTextField idadeField = new JTextField(18);// cria o campo de input e seta o tamanho
        idadeField.setMaximumSize(new Dimension(300, idadeField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JLabel nacionalidadeLabel = new JLabel("Insira sua nacionalidade"); // label nacionalidade
        JTextField nacionalidadeField = new JTextField(18); // cria o campo do input e seta o tamanho
        nacionalidadeField.setMaximumSize(new Dimension(300, nacionalidadeField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JButton botao = new JButton("Criar Usuário"); // cria o botao para criar o usuario
        botao.setBackground(new Color(201, 201, 201)); // cor personalizada para o bot  ao
        CriarUsuarioAction action = new CriarUsuarioAction(nomeField,tipoUsuario,sexo ,idadeField, nacionalidadeField); //cria o objeto q vai fazer a escuta
        botao.addActionListener(action); //fica observando quando o botão for ativado

        //As propriedades gridx e gridy dessa classe representam a posição da célula onde o componente será colocado.

        //painel.add adiciona os componentes ao painel
        // Box.createVerticalStrut(espacamentoVertical), gbc) cria um espaçamento entre os campos
        // Ao utilizar o operador de incremento ++, o valor de gbc.gridy é aumentado em 1. Isso significa que o próximo componente será colocado na próxima linha da grade.

        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(nomeLabel, gbc);
        gbc.gridy++;
        painel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
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
        painel.add(Box.createVerticalGlue(), gbc); // Ao adicionar Box.createVerticalGlue() ao painel, você está inserindo esse espaçador elástico vertical,
        // permitindo que os componentes sejam posicionados conforme necessário dentro do layout, ajustando-se ao espaço disponível verticalmente( RESPONSIVIDADE).

        // Adiciona o painel à janela
        janela.add(painel); // adiciona o painel
        janela.setVisible(true); // torna ele visivel
    }
}
