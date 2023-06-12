package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.example.Album;
import com.example.Artista;
import com.example.Musica;
import com.example.Writer;

public class ArtistaAction implements ActionListener {
    private JTextField catchNomeArtista;
    private JComboBox<String> catchSexoArtista;
    private JTextField catchIdadeArtista;
    private JTextField catchArtistaApelido;
    private JTextField catchNacionalidadeArtista;
    private JComboBox<String> catchGeneroArtista;
    private JFrame frame;

    public ArtistaAction(JTextField catchNomeArtista, JComboBox<String> catchSexoArtista, JTextField catchIdadeArtista,
                         JTextField catchArtistaApelido, JTextField catchNacionalidadeArtista, JComboBox<String> catchGeneroArtista, JFrame frame) {
        this.catchNomeArtista = catchNomeArtista;
        this.catchSexoArtista = catchSexoArtista;
        this.catchIdadeArtista = catchIdadeArtista;
        this.catchArtistaApelido = catchArtistaApelido;
        this.catchNacionalidadeArtista = catchNacionalidadeArtista;
        this.catchGeneroArtista = catchGeneroArtista;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nomeArtista;
        String sexoArtista;
        int idadeArtista;
        String apelidoArtista;
        String nacionalidadeArtista;
        String generoArtista;

        try {
            nomeArtista = catchNomeArtista.getText().trim();
            sexoArtista = (String) catchSexoArtista.getSelectedItem();
            idadeArtista = Integer.parseInt(catchIdadeArtista.getText());
            apelidoArtista = catchArtistaApelido.getText();
            nacionalidadeArtista = catchNacionalidadeArtista.getText();
            generoArtista = (String) catchGeneroArtista.getSelectedItem();

            if (nomeArtista.isEmpty()) {
                throw new Exception("O campo nome está vazio!");
            }
            if (sexoArtista == "Selecione o seu sexo") {
                throw new Exception("O campo sexo está vazio!");
            }
            if (idadeArtista < 18) {
                throw new Exception("O artista não pode ser menor de idade!");
            }
            if (nacionalidadeArtista.isEmpty()) {
                throw new Exception("O campo nacionalidade está vazio!");
            }
            for (char c : nacionalidadeArtista.toCharArray()) {
                if (!Character.isLetter(c)) {
                    throw new Exception("O campo nacionalidade não deve conter números.");
                }
            }
            if (generoArtista == "Selecione o seu genero") {
                throw new Exception("O campo gênero está vázio");
            }
        } catch (Exception error) {
            if (error instanceof NumberFormatException) {
                JOptionPane.showMessageDialog(null, "Erro: O valor da idade não é um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, error.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
            return;
        }

        Artista artista = new Artista(nomeArtista, idadeArtista, sexoArtista, nacionalidadeArtista, generoArtista, apelidoArtista);
        JTextField nomeAlbum = new JTextField();
        JComboBox generoAlbum = new JComboBox(); // Cria uma caixa de seleção
        generoAlbum.addItem("Selecione..."); //opções
        generoAlbum.addItem("Sertanejo");
        generoAlbum.addItem("Trap");
        generoAlbum.addItem("Funk");
        generoAlbum.addItem("Mega Funk");
        generoAlbum.addItem("Pagode");
        generoAlbum.addItem("Samba");
        generoAlbum.addItem("Eletronica");
        generoAlbum.addItem("Pop");
        generoAlbum.addItem("Kpop");
        generoAlbum.addItem("Rap");
        generoAlbum.addItem("Rock");
        JTextField anoAlbum = new JTextField();

        JPanel panelAlbum = new JPanel();
        panelAlbum.setLayout(new GridLayout(4, 2));
        panelAlbum.add(new JLabel("Título:"));
        panelAlbum.add(nomeAlbum);
        panelAlbum.add(new JLabel("Gênero:"));
        panelAlbum.add(generoAlbum);
        panelAlbum.add(new JLabel("Ano:"));
        panelAlbum.add(anoAlbum);

        int result = JOptionPane.showConfirmDialog(null, panelAlbum, "Criar Álbum", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String title;
            String genre;
            int year;

            try {
                title = nomeAlbum.getText().trim();
                genre = (String) generoAlbum.getSelectedItem();
                year = Integer.parseInt(anoAlbum.getText());

                if (title.isEmpty()) {
                    throw new Exception("O campo título está vazio!");
                }
                if (genre == "Selecione...") {
                    throw new Exception("O campo gênero está vazio!");
                }
                if (year > 2023) {
                    throw new Exception("O ano é inválido");
                }
            } catch (Exception error) {
                if (error instanceof NumberFormatException) {
                    JOptionPane.showMessageDialog(null, "Erro: O ano não é um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, error.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
                return;
            }

            Album album = new Album(title, genre, year, artista);
            album.adicionarAlbumAoArtista(artista, album);

            boolean adicionarMaisMusicas = true;

            while (adicionarMaisMusicas) {
                JTextField nomeMusica = new JTextField();
                JTextField duracaoMusica = new JTextField();
                JComboBox generoMusica = new JComboBox(); // Cria uma caixa de seleção
                generoMusica.addItem("Selecione..."); //opções
                generoMusica.addItem("Sertanejo");
                generoMusica.addItem("Trap");
                generoMusica.addItem("Funk");
                generoMusica.addItem("Mega Funk");
                generoMusica.addItem("Pagode");
                generoMusica.addItem("Samba");
                generoMusica.addItem("Eletronica");
                generoMusica.addItem("Pop");
                generoMusica.addItem("Kpop");
                generoMusica.addItem("Rap");
                generoMusica.addItem("Rock");
                JTextField anoMusica = new JTextField();

                JPanel panelMusica = new JPanel();
                panelMusica.setLayout(new GridLayout(6, 2));
                panelMusica.add(new JLabel("Título:"));
                panelMusica.add(nomeMusica);
                panelMusica.add(new JLabel("Duração:"));
                panelMusica.add(duracaoMusica);
                panelMusica.add(new JLabel("Gênero:"));
                panelMusica.add(generoMusica);
                panelMusica.add(new JLabel("Ano:"));
                panelMusica.add(anoMusica);

                int resultMusica = JOptionPane.showConfirmDialog(null, panelMusica, "Adicionar Música", JOptionPane.OK_CANCEL_OPTION);

                if (resultMusica == JOptionPane.OK_OPTION) {
                    String titleMusic;
                    int durationMusic;
                    String genreMusic;
                    int yearMusic;

                    try {
                        titleMusic = nomeMusica.getText().trim();
                        durationMusic = Integer.parseInt(duracaoMusica.getText());
                        genreMusic = (String) generoMusica.getSelectedItem();
                        yearMusic = Integer.parseInt(anoMusica.getText());

                        if (titleMusic.isEmpty()) {
                            throw new Exception("O campo título está vazio!");
                        }
                        if (durationMusic <= 0) {
                            throw new Exception("A duração é inválida!");
                        }
                        if (genreMusic == "Selecione...") {
                            throw new Exception("O campo gênero está vazio!");
                        }
                        if(yearMusic > year) {
                            throw new Exception("O ano de lançamento da música não pode ser maior que o ano de lançamento do álbum!");
                        }
                    } catch (Exception error) {
                        if (error instanceof NumberFormatException) {
                            JOptionPane.showMessageDialog(null, "Erro: O valor do ano não é um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, error.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                        continue;
                    }

                    Musica musica = new Musica(titleMusic, artista, durationMusic, genreMusic, yearMusic);
                    Writer.adicionarMusicaEmArquivo(musica, album);
                    musica.adicionarMusicaAoAlbum(album, musica);

                    int continuar = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais músicas?", "Adicionar Música", JOptionPane.YES_NO_OPTION);

                    if (continuar == JOptionPane.NO_OPTION) {
                        adicionarMaisMusicas = false;
                    }
                } else {
                    adicionarMaisMusicas = false;
                }
            }

            Writer.adicionarArtistaEmArquivo(artista);
            Writer.adicionarAlbumEmArquivo(album);

            JOptionPane.showMessageDialog(null, "Artista criado com sucesso!");
            frame.dispose();
        }
    }
}
