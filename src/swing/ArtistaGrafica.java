package swing;

import javax.swing.*;
import java.awt.*;

public class ArtistaGrafica {

    public ArtistaGrafica() {
        JFrame artistajanela = new JFrame();
        artistajanela.setTitle("Registrar Musica - SoundHub");
        artistajanela.setSize(400, 400);
        artistajanela.setLocationRelativeTo(null);
        artistajanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int espacamentoVertical = 8;

        JPanel artistaPainel = new JPanel();
        artistaPainel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 10, 0, 10);

        JLabel nomeArtistaLabel = new JLabel("Digite o nome do Artista");
        JTextField nomeArtistaField = new JTextField(18);
        nomeArtistaField.setMaximumSize(new Dimension(200, nomeArtistaField.getPreferredSize().height));

        JLabel artistaApelidoLabel = new JLabel("Digite o apelido do Artista:");
        JTextField artistaApelidoField = new JTextField(18);
        artistaApelidoField.setMaximumSize(new Dimension(200, artistaApelidoField.getPreferredSize().height));

        JLabel nacionalidadeLabel = new JLabel("Digite a nacionalidade:");
        JTextField nacionalidadeField = new JTextField(18);
        nacionalidadeField.setMaximumSize(new Dimension(200, nacionalidadeField.getPreferredSize().height));

        JLabel idadeArtistaLabel = new JLabel("Digite a idade:");
        JTextField idadeArtistaField = new JTextField(18);
        idadeArtistaField.setMaximumSize(new Dimension(200, idadeArtistaField.getPreferredSize().height));

        JComboBox<String> sexo = new JComboBox<>();
        sexo.addItem("Selecione o seu sexo");
        sexo.addItem("Masculino");
        sexo.addItem("Feminino");
        sexo.addItem("Outro");
        sexo.addItem("Prefiro não Informar");

        Dimension comboSize = sexo.getPreferredSize();
        comboSize = sexo.getPreferredSize();
        comboSize.width = 200;
        comboSize.height = sexo.getPreferredSize().height;
        sexo.setPreferredSize(comboSize);
        sexo.setMaximumSize(comboSize);

        JComboBox<String> genero = new JComboBox<>();
        genero.addItem("Selecione o seu genero");
        genero.addItem("Sertanejo");
        genero.addItem("Trap");
        genero.addItem("Funk");
        genero.addItem("Pagode");
        genero.addItem("Samba");
        genero.addItem("Eletronica");
        genero.addItem("Pop");
        genero.addItem("Kpop");
        genero.addItem("Rap");
        genero.addItem("Rock");

        comboSize = genero.getPreferredSize();
        comboSize = genero.getPreferredSize();
        comboSize.width = 200;
        comboSize.height = genero.getPreferredSize().height;
        genero.setPreferredSize(comboSize);
        genero.setMaximumSize(comboSize);

        JButton botaoArtista = new JButton("Criar Artista"); // cria o botao para criar o usuario
        botaoArtista.setBackground(new Color(201, 201, 201)); // cor personalizada para o bot  ao
        ArtistaAction action = new ArtistaAction(nomeArtistaField,sexo, idadeArtistaField,artistaApelidoField,nacionalidadeField,genero); //cria o objeto q vai fazer a escuta
        botaoArtista.addActionListener(action); //fica observando quando o botão for ativado

        gbc.gridx = 0;
        gbc.gridy = 0;
        artistaPainel.add(nomeArtistaLabel, gbc);
        gbc.gridy++;
        artistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        artistaPainel.add(nomeArtistaField, gbc);
        gbc.gridy++;
        artistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        artistaPainel.add(idadeArtistaLabel, gbc);
        gbc.gridy++;
        artistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        artistaPainel.add(idadeArtistaField, gbc);
        gbc.gridy++;
        artistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        artistaPainel.add(artistaApelidoLabel, gbc);
        gbc.gridy++;
        artistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        artistaPainel.add(artistaApelidoField, gbc);
        gbc.gridy++;
        artistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        artistaPainel.add(nacionalidadeLabel, gbc);
        gbc.gridy++;
        artistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        artistaPainel.add(nacionalidadeField, gbc);
        gbc.gridy++;
        artistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        artistaPainel.add(sexo, gbc);
        gbc.gridy++;
        artistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        artistaPainel.add(genero, gbc);
        gbc.gridy++;
        artistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        artistaPainel.add(botaoArtista, gbc);
        gbc.gridy++;
        artistaPainel.add(Box.createVerticalGlue(), gbc);

        artistajanela.add(artistaPainel);
        artistajanela.setVisible(true);
    }
}
