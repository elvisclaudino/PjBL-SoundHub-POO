package swing;

import javax.swing.*;
import java.awt.*;
public class MusicaGrafica {
    public static void main(String[] args) {
        JFrame Musicajanela = new JFrame(); // Declara o JFrame para criar a janela
        Musicajanela.setTitle("Registrar Musica - SoundHub -"); //seta o titulo
        Musicajanela.setSize(400, 400);// seta tamanho da janela
        Musicajanela.setLocationRelativeTo(null); //posiciona a janela no centro da tela
        Musicajanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quando fechar a janela para o codigo
        int espacamentoVertical = 8; // seta o tamanho do espaçamento

        // Cria o painel
        JPanel MusicaPainel = new JPanel();
        MusicaPainel.setLayout(new GridBagLayout()); // seta o grid layout(parecido com flex(modelo estilização)

        GridBagConstraints gbc = new GridBagConstraints();// Cria o objeto GridBagConstraints
        gbc.anchor = GridBagConstraints.WEST; //Posiciona a esquerda o objeto
        gbc.insets = new Insets(0, 10, 0, 10); // cria a margin semelhante ao css

        // Componentes
        JLabel nomeMusicaLabel = new JLabel("Digite o nome da musica"); // label musica
        JTextField nomeMusicaField = new JTextField(18); // input type text(campo)
        nomeMusicaField.setMaximumSize(new Dimension(200, nomeMusicaField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JLabel ArtistaLabel = new JLabel("Digite o nome do artista"); // label muscia
        JTextField ArtistaField = new JTextField(18); // input type text(campo)
        ArtistaField.setMaximumSize(new Dimension(200, ArtistaField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JLabel DuracaoLabel = new JLabel("Digite a duracao da musica"); // duracao musica
        JTextField DuracaoField = new JTextField(18); // input type text(campo)
        DuracaoField.setMaximumSize(new Dimension(200, DuracaoField .getPreferredSize().height)); // seta um tamanho para os campos de texto

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

        Dimension comboSize = genero.getPreferredSize(); //dimensiona o seletor
        comboSize = genero.getPreferredSize(); //dimensiona
        comboSize.width = 200; // seta a width do campo seletor
        comboSize.height = genero.getPreferredSize().height; // seta o height de acordo com o campo preenchido
        genero.setPreferredSize(comboSize); // seta de acordo com os valores presentes
        genero.setMaximumSize(comboSize); // seta para não ultrapassar os limites

        JLabel AnoLancamentoLabel = new JLabel("Digite o ano lançamento"); // duracao musica
        JTextField AnoLancamentoField = new JTextField(18); // input type text(campo)
        AnoLancamentoField.setMaximumSize(new Dimension(200, DuracaoField .getPreferredSize().height)); // seta um tamanho para os campos de texto

        JButton criarMuscia = new JButton("Criar Musica"); // cria o botao para criar o usuario
        criarMuscia.setBackground(new Color(201, 201, 201)); // cor personalizada para o bot  ao
        MusicaGraficaAction action = new MusicaGraficaAction(nomeMusicaField,ArtistaField,DuracaoField,genero,AnoLancamentoField); //cria o objeto q vai fazer a escuta
        criarMuscia.addActionListener(action); //fica observando quando o botão for ativado

        gbc.gridx = 0;
        gbc.gridy = 0;
        MusicaPainel.add(nomeMusicaLabel, gbc);
        gbc.gridy++;
        MusicaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        MusicaPainel.add(nomeMusicaField, gbc);
        gbc.gridy++;
        MusicaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        MusicaPainel.add(ArtistaLabel, gbc);
        gbc.gridy++;
        MusicaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        MusicaPainel.add(ArtistaField, gbc);
        gbc.gridy++;
        MusicaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        MusicaPainel.add(DuracaoLabel, gbc);
        gbc.gridy++;
        MusicaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        MusicaPainel.add(DuracaoField, gbc);
        gbc.gridy++;
        MusicaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        MusicaPainel.add(genero, gbc);
        gbc.gridy++;
        MusicaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        MusicaPainel.add(AnoLancamentoLabel, gbc);
        gbc.gridy++;
        MusicaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        MusicaPainel.add(AnoLancamentoField, gbc);
        gbc.gridy++;
        MusicaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        MusicaPainel.add(criarMuscia, gbc);
        gbc.gridy++;
        MusicaPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        MusicaPainel.add(Box.createVerticalGlue(), gbc); // Ao adicionar Box.createVerticalGlue() ao painel, você está inserindo esse espaçador elástico vertical,
        // permitindo que os componentes sejam posicionados conforme necessário dentro do layout, ajustando-se ao espaço disponível verticalmente( RESPONSIVIDADE).

        // Adiciona o painel à janela
        Musicajanela.add(MusicaPainel); // adiciona o painel
        Musicajanela.setVisible(true); // torna ele visivel

    }
}
