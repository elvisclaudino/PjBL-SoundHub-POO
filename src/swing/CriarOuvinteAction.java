package swing;

import com.example.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class CriarOuvinteAction implements ActionListener {
        private JTextField catchNomeOuvinte; // cria o atributo texto que posteriormente vai captar o usuario
        private JComboBox catchSexoOuvinte;
        private JTextField catchIdadeOuvinte;
        private JTextField catchNacionalidadeOuvinte;
        private JFrame frame;
        public CriarOuvinteAction(JTextField catchNomeOuvinte, JComboBox catchSexoOuvinte, JTextField catchIdadeOuvinte, JTextField catchNacionalidadeOuvinte, JFrame frame){ //construtor
            this.catchNomeOuvinte = catchNomeOuvinte;
            this.catchSexoOuvinte = catchSexoOuvinte;
            this.catchIdadeOuvinte = catchIdadeOuvinte;
            this.catchNacionalidadeOuvinte = catchNacionalidadeOuvinte;
            this.frame = frame;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            String nomeOuvinte = catchNomeOuvinte.getText(); // GET recebe o valor do input
            String sexoOuvinte = (String)catchSexoOuvinte.getSelectedItem();
            int idadeOuvinte;
            try {
                idadeOuvinte = Integer.parseInt(catchIdadeOuvinte.getText());
                if (idadeOuvinte < 16) {
                    JOptionPane.showMessageDialog(null, "A ouvinte deve ter no mínimo 16 anos!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para a idade.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String nacionalidadeOuvinte = catchNacionalidadeOuvinte.getText();

            Ouvinte ouvinte = new Ouvinte(nomeOuvinte, idadeOuvinte, sexoOuvinte, nacionalidadeOuvinte);
            JTextField nomePlaylist = new JTextField();
            JTextField generoPlaylist = new JTextField();
            JTextField anoPlaylist = new JTextField();

            JPanel panelAlbum = new JPanel();
            panelAlbum.setLayout(new GridLayout(4, 2));
            panelAlbum.add(new JLabel("Título:"));
            panelAlbum.add(nomePlaylist);
            panelAlbum.add(new JLabel("Gênero:"));
            panelAlbum.add(generoPlaylist);
            panelAlbum.add(new JLabel("Ano:"));
            panelAlbum.add(anoPlaylist);

            int result = JOptionPane.showConfirmDialog(null, panelAlbum, "Criar Playlist", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                String title = nomePlaylist.getText();
                String genre = generoPlaylist.getText();
                int year = Integer.parseInt(anoPlaylist.getText());

                Playlist playlist = new Playlist(title, genre, year, ouvinte);
                playlist.adicionarPlaylistAoOuvinte(ouvinte, playlist);

                boolean adicionarMaisMusicas = true;

                while (adicionarMaisMusicas) {
                    JTextField nomeMusica = new JTextField();
                    JTextField duracaoMusica = new JTextField();
                    JTextField generoMusica = new JTextField();
                    JTextField anoMusica = new JTextField();
                    JTextField artistaMusica = new JTextField();

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
                    panelMusica.add(new JLabel("Artista:"));
                    panelMusica.add(artistaMusica);

                    int resultMusica = JOptionPane.showConfirmDialog(null, panelMusica, "Adicionar Música", JOptionPane.OK_CANCEL_OPTION);

                    if (resultMusica == JOptionPane.OK_OPTION) {
                        String titleMusic = nomeMusica.getText();
                        int durationMusic = Integer.parseInt(duracaoMusica.getText());
                        String genreMusic = generoMusica.getText();
                        int yearMusic = Integer.parseInt(anoMusica.getText());
                        String artistaMusic = artistaMusica.getText();

                        MusicaPlaylist musicaPlaylist = new MusicaPlaylist(titleMusic, durationMusic, genreMusic, yearMusic, artistaMusic);
                        Writer.adicionarMusicaPlaylistEmArquivo(musicaPlaylist, playlist);
                        playlist.adicionarMusicaPlaylist(musicaPlaylist);

                        int continuar = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais músicas?", "Adicionar Música", JOptionPane.YES_NO_OPTION);

                        if (continuar == JOptionPane.NO_OPTION) {
                            adicionarMaisMusicas = false;
                        }
                    } else {
                        adicionarMaisMusicas = false;
                    }
                }

                Writer.adicionarOuvinteEmArquivo(ouvinte);
                Writer.adicionarPlaylistEmArquivo(playlist);

            JOptionPane.showMessageDialog(null,"Usuario Criado");
            frame.dispose();
        }

    }}

