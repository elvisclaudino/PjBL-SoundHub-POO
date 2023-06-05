package swing;

import javax.swing.*;
import java.awt.*;


public class AlbumGrafica {
    public static void main(String[] args) {
        JFrame Albumjanela = new JFrame(); // Declara o JFrame para criar a janela
        Albumjanela.setTitle("Registrar Musica - SoundHub -"); //seta o titulo
        Albumjanela.setSize(400, 400);// seta tamanho da janela
        Albumjanela.setLocationRelativeTo(null); //posiciona a janela no centro da tela
        Albumjanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quando fechar a janela para o codigo
        int espacamentoVertical = 8; // seta o tamanho do espaçamento

        // Cria o painel
        JPanel AlbumPainel = new JPanel();
        AlbumPainel.setLayout(new GridBagLayout()); // seta o grid layout(parecido com flex(modelo estilização)

        GridBagConstraints gbc = new GridBagConstraints();// Cria o objeto GridBagConstraints
        gbc.anchor = GridBagConstraints.WEST; //Posiciona a esquerda o objeto
        gbc.insets = new Insets(0, 10, 0, 10); // cria a margin semelhante ao css

        // Componentes
        JLabel nomeAlbumLabel = new JLabel("Digite o nome do album"); // label musica
        JTextField nomeAlbumField = new JTextField(18); // input type text(campo)
        nomeAlbumField.setMaximumSize(new Dimension(200, nomeAlbumField.getPreferredSize().height)); // seta um tamanho para os campos de texto

        JLabel ArtistaAlbumLabel = new JLabel("Digite o nome do artista"); // label muscia
        JTextField ArtistaAlbumField = new JTextField(18); // input type text(campo)
        ArtistaAlbumField.setMaximumSize(new Dimension(200, ArtistaAlbumField.getPreferredSize().height)); // seta um tamanho para os campos de texto


        JButton criarAlbum = new JButton("Criar Album"); // cria o botao para criar o usuario
        criarAlbum.setBackground(new Color(201, 201, 201)); // cor personalizada para o bot  ao
        AlbumGraficoAcao action = new AlbumGraficoAcao(nomeAlbumField,ArtistaAlbumField); //cria o objeto q vai fazer a escuta
        criarAlbum.addActionListener(action); //fica observando quando o botão for ativado


        gbc.gridx = 0;
        gbc.gridy = 0;
        AlbumPainel.add(nomeAlbumLabel, gbc);
        gbc.gridy++;
        AlbumPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        AlbumPainel.add(nomeAlbumField, gbc);
        gbc.gridy++;
        AlbumPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        AlbumPainel.add(ArtistaAlbumLabel, gbc);
        gbc.gridy++;
        AlbumPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        AlbumPainel.add(ArtistaAlbumField, gbc);
        gbc.gridy++;
        AlbumPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        AlbumPainel.add(criarAlbum, gbc);
        gbc.gridy++;
        AlbumPainel.add(Box.createVerticalStrut(espacamentoVertical), gbc);
        gbc.gridy++;
        AlbumPainel.add(Box.createVerticalGlue(), gbc); // Ao adicionar Box.createVerticalGlue() ao painel, você está inserindo esse espaçador elástico vertical,
        // permitindo que os componentes sejam posicionados conforme necessário dentro do layout, ajustando-se ao espaço disponível verticalmente( RESPONSIVIDADE).

        // Adiciona o painel à janela
        Albumjanela.add(AlbumPainel); // adiciona o painel
        Albumjanela.setVisible(true); // torna ele visivel

    }
}


