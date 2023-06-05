package swing;

import javax.swing.*;
import java.awt.*;

public class ArtistaGrafica {

    public static void main(String[] args) {
        JFrame Artistajanela = new JFrame(); // Declara o JFrame para criar a janela
        Artistajanela.setTitle("Registrar Musica - SoundHub -"); //seta o titulo
        Artistajanela.setSize(400, 400);// seta tamanho da janela
        Artistajanela.setLocationRelativeTo(null); //posiciona a janela no centro da tela
        Artistajanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quando fechar a janela para o codigo
        int espacamentoVertical = 8; // seta o tamanho do espaçamento

        // Cria o painel
        JPanel ArtistaPainel = new JPanel();
        Artistajanela.setLayout(new GridBagLayout()); // seta o grid layout(parecido com flex(modelo estilização)

        GridBagConstraints gbc = new GridBagConstraints();// Cria o objeto GridBagConstraints
        gbc.anchor = GridBagConstraints.WEST; //Posiciona a esquerda o objeto
        gbc.insets = new Insets(0, 10, 0, 10); // cria a margin semelhante ao css

        // Componentes
        JLabel nomeArtistaLabel = new JLabel("Digite o nome do Artista"); // label musica
        JTextField nomeArtistaField = new JTextField(18); // input type text(campo)
        nomeArtistaField.setMaximumSize(new Dimension(200, nomeArtistaField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JLabel ArtistaApelidoLabel = new JLabel("Digite o apelido do Artista:"); // label muscia
        JTextField ArtistaApelidoField = new JTextField(18); // input type text(campo)
        ArtistaApelidoField.setMaximumSize(new Dimension(200, ArtistaApelidoField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JLabel NacionalidadeLabel = new JLabel("Digite a nacionalidade:"); // duracao musica
        JTextField NacionalidadeField = new JTextField(18); // input type text(campo)
        NacionalidadeField.setMaximumSize(new Dimension(200, NacionalidadeField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JLabel IdadeArtistaLabel = new JLabel("Digite a idade:"); // duracao musica
        JTextField IdadeArtistaField = new JTextField(18); // input type text(campo)
        IdadeArtistaField.setMaximumSize(new Dimension(200, IdadeArtistaField.getPreferredSize().height));


        JComboBox sexo = new JComboBox(); // Cria uma caixa de seleção
        sexo.addItem("Selecione o seu sexo"); //opções
        sexo.addItem("Masculino");
        sexo.addItem("Feminino");
        sexo.addItem("Outro");
        sexo.addItem("Prefiro não Informar");

        Dimension comboSize = sexo.getPreferredSize(); //dimensiona o seletor
        comboSize = sexo.getPreferredSize(); //dimensiona
        comboSize.width = 200; // seta a width do campo seletor
        comboSize.height = sexo.getPreferredSize().height; // seta o height de acordo com o campo preenchido
        sexo.setPreferredSize(comboSize); // seta de acordo com os valores presentes
        sexo.setMaximumSize(comboSize); // seta para não ultrapassar os limites


        JComboBox genero = new JComboBox(); // Cria uma caixa de seleção
        genero.addItem("Selecione o seu genero"); //opções
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


        comboSize = genero.getPreferredSize(); //dimensiona o seletor
        comboSize = genero.getPreferredSize(); //dimensiona
        comboSize.width = 200; // seta a width do campo seletor
        comboSize.height = genero.getPreferredSize().height; // seta o height de acordo com o campo preenchido
        genero.setPreferredSize(comboSize); // seta de acordo com os valores presentes
        genero.setMaximumSize(comboSize); // seta para não ultrapassar os limites




        JButton criarArtista = new JButton("Criar Musica"); // cria o botao para criar o usuario
        criarArtista.setBackground(new Color(201, 201, 201)); // cor personalizada para o bot  ao
        ArtistaAction action = new ArtistaAction(nomeArtistaField,sexo,IdadeArtistaField,ArtistaApelidoField,NacionalidadeField, genero); //cria o objeto q vai fazer a escuta
        criarArtista.addActionListener(action); //fica observando quando o botão for ativado

        gbc.gridx = 0;
        gbc.gridy = 0;
        ArtistaPainel.add(nomeArtistaLabel, gbc);
        gbc.gridy++;
        ArtistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        ArtistaPainel.add(nomeArtistaField, gbc);
        gbc.gridy++;
        ArtistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        ArtistaPainel.add(sexo, gbc);
        gbc.gridy++;
        ArtistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        ArtistaPainel.add(IdadeArtistaLabel, gbc);
        gbc.gridy++;
        ArtistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        ArtistaPainel.add(IdadeArtistaField, gbc);
        gbc.gridy++;
        ArtistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        ArtistaPainel.add(ArtistaApelidoLabel, gbc);
        gbc.gridy++;
        ArtistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        ArtistaPainel.add(ArtistaApelidoField, gbc);
        gbc.gridy++;
        ArtistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        ArtistaPainel.add(NacionalidadeLabel, gbc);
        gbc.gridy++;
        ArtistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        ArtistaPainel.add(NacionalidadeField, gbc);
        gbc.gridy++;
        ArtistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        ArtistaPainel.add(genero, gbc);
        gbc.gridy++;
        ArtistaPainel.add(criarArtista, gbc);
        gbc.gridy++;
        ArtistaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        ArtistaPainel.add(Box.createVerticalGlue(), gbc); // Ao adicionar Box.createVerticalGlue() ao painel, você está inserindo esse espaçador elástico vertical,
        // permitindo que os componentes sejam posicionados conforme necessário dentro do layout, ajustando-se ao espaço disponível verticalmente( RESPONSIVIDADE).

        // Adiciona o painel à janela
        Artistajanela.add(ArtistaPainel); // adiciona o painel
        Artistajanela.setVisible(true); // torna ele visivel

    }
}


