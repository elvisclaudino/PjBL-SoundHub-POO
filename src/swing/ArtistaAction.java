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
        String nomeArtista = catchNomeArtista.getText();
        String sexoArtista = (String) catchSexoArtista.getSelectedItem();
        int idadeArtista = Integer.parseInt(catchIdadeArtista.getText());
        String apelidoArtista = catchArtistaApelido.getText();
        String nacionalidadeArtista = catchNacionalidadeArtista.getText();
        String generoArtista = (String) catchGeneroArtista.getSelectedItem();

        Artista artista = new Artista(nomeArtista, idadeArtista, sexoArtista, nacionalidadeArtista, generoArtista, apelidoArtista);
        JTextField nomeAlbum = new JTextField();
        JTextField generoAlbum = new JTextField();
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
            String title = nomeAlbum.getText();
            String genre = generoAlbum.getText();
            int year = Integer.parseInt(anoAlbum.getText());

            Album album = new Album(title, genre, year, artista);
            album.adicionarAlbumAoArtista(artista, album);

            boolean adicionarMaisMusicas = true;

            while (adicionarMaisMusicas) {
                JTextField nomeMusica = new JTextField();
                JTextField duracaoMusica = new JTextField();
                JTextField generoMusica = new JTextField();
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
                    String titleMusic = nomeMusica.getText();
                    int durationMusic = Integer.parseInt(duracaoMusica.getText());
                    String genreMusic = generoMusica.getText();
                    int yearMusic = Integer.parseInt(anoMusica.getText());

                    Musica musica = new Musica(titleMusic, artista, durationMusic, genreMusic, yearMusic);
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

            JOptionPane.showMessageDialog(null, "Artista e Álbum criados com sucesso!");
        }
        frame.dispose();
    }
}
