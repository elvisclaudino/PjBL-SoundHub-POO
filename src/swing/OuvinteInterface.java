package swing;

import javax.swing.*;
import java.awt.*;

public class OuvinteInterface {
    public OuvinteInterface() {

        JFrame janela = new JFrame(); // Declara o JFrame para criar a janela
        janela.setTitle("Registrar Ouvinte- SoundHub -");
        janela.setSize(400, 400); // seta tamanho da janela
        janela.setLocationRelativeTo(null); //posiciona a janela no centro da tela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quando fechar a janela para o codigo
        int espacamentoVertical = 10; // seta o tamanho do espaçamento
        JPanel painelOuvinte = new JPanel();
        painelOuvinte.setLayout(new GridBagLayout()); // seta o grid layout(parecido com flex(modelo estilização)


        GridBagConstraints gbc = new GridBagConstraints();// Cria o objeto GridBagConstraints
        gbc.anchor = GridBagConstraints.WEST; //Posiciona a esquerda o objeto
        gbc.insets = new Insets(0, 10, 0, 10); // cria a margin semelhante ao css

        // Componentes
        JLabel nomeOuvinteLabel = new JLabel("Digite seu nome do Ouvinte"); // label usuario
        JTextField nomeOuvinteField = new JTextField(18); // input type text(campo)
        nomeOuvinteField.setMaximumSize(new Dimension(200, nomeOuvinteField.getPreferredSize().height)); // seta um tamanho para os campos de texto


        JComboBox sexoOuvinte = new JComboBox(); // Cria uma caixa de seleção
        Dimension comboSize = sexoOuvinte.getPreferredSize();
        sexoOuvinte.addItem("Selecione o seu sexo"); //opções
        sexoOuvinte.addItem("Masculino");
        sexoOuvinte.addItem("Feminino");
        sexoOuvinte.addItem("Outro");
        comboSize = sexoOuvinte.getPreferredSize(); //dimensiona
        comboSize.width = 200; // seta a width do campo seletor
        comboSize.height = sexoOuvinte.getPreferredSize().height; // seta o height de acordo com o campo preenchido
        sexoOuvinte.setPreferredSize(comboSize); // seta de acordo com os valores presentes
        sexoOuvinte.setMaximumSize(comboSize); // seta para não ultrapassar os limites


        JLabel idadeOuvinteLabel = new JLabel("Insira sua idade"); // label idade
        JTextField idadeOuvinteField = new JTextField(18);// cria o campo de input e seta o tamanho
        idadeOuvinteField.setMaximumSize(new Dimension(300, idadeOuvinteField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JLabel nacionalidadeLabel = new JLabel("Insira sua nacionalidade"); // label nacionalidade
        JTextField nacionalidadeField = new JTextField(18); // cria o campo do input e seta o tamanho
        nacionalidadeField.setMaximumSize(new Dimension(300, nacionalidadeField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JButton botao = new JButton("Criar Ouvinte"); // cria o botao para criar o usuario
        botao.setBackground(new Color(201, 201, 201)); // cor personalizada para o bot  ao
        CriarOuvinteAction action = new CriarOuvinteAction(nomeOuvinteField, sexoOuvinte, idadeOuvinteField, nacionalidadeField);
        //cria o objeto q vai fazer a escuta
        botao.addActionListener(action); //fica observando quando o botão for ativado

        //As propriedades gridx e gridy dessa classe representam a posição da célula onde o componente será colocado.

        //painel.add adiciona os componentes ao painel
        // Box.createVerticalStrut(espacamentoVertical), gbc) cria um espaçamento entre os campos
        // Ao utilizar o operador de incremento ++, o valor de gbc.gridy é aumentado em 1. Isso significa que o próximo componente será colocado na próxima linha da grade.

        gbc.gridx = 0;
        gbc.gridy = 0;
        painelOuvinte.add(nomeOuvinteLabel, gbc);
        gbc.gridy++;
        painelOuvinte.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painelOuvinte.add(nomeOuvinteField, gbc);
        gbc.gridy++;
        painelOuvinte.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painelOuvinte.add(sexoOuvinte, gbc);
        gbc.gridy++;
        painelOuvinte.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painelOuvinte.add(idadeOuvinteLabel, gbc);
        gbc.gridy++;
        painelOuvinte.add(idadeOuvinteField, gbc);
        gbc.gridy++;
        painelOuvinte.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painelOuvinte.add(nacionalidadeLabel, gbc);
        gbc.gridy++;
        painelOuvinte.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painelOuvinte.add(nacionalidadeField, gbc);
        gbc.gridy++;
        painelOuvinte.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painelOuvinte.add(botao, gbc);
        gbc.gridy++;
        painelOuvinte.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        painelOuvinte.add(Box.createVerticalGlue(), gbc); // Ao adicionar Box.createVerticalGlue() ao painel, você está inserindo esse espaçador elástico vertical,
        // permitindo que os componentes sejam posicionados conforme necessário dentro do layout, ajustando-se ao espaço disponível verticalmente( RESPONSIVIDADE).

        // Adiciona o painel à janela
        janela.add(painelOuvinte); // adiciona o painel
        janela.setVisible(true); // torna ele visivel
    }
}
