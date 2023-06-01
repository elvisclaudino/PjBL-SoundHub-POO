package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    public class MusicaGraficaAcao implements ActionListener {
        private javax.swing.JTextField catchNomeMusica;
        private javax.swing.JTextField catchArtista;
        private javax.swing.JTextField catchDuracao;
        private javax.swing.JComboBox catchGenero;
        private javax.swing.JTextField catchAnoLancamento;

        public MusicaGraficaAcao(JTextField catchNomeMusica, JTextField catchArtista, JTextField catchDuracao, JComboBox catchGenero, JTextField catchAnoLancamento) {
            this.catchNomeMusica = catchNomeMusica;
            this.catchArtista = catchArtista;
            this.catchDuracao= catchDuracao;
            this.catchGenero = catchGenero;
            this.catchAnoLancamento = catchAnoLancamento;
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            String NomeMusica = catchNomeMusica.getText(); // GET recebe o valor do input
            String NomeArtista = catchArtista.getText();
            String Duracao = catchDuracao.getText();
            String Genero = (String)catchGenero.getSelectedItem();
            String AnoLancamento = catchAnoLancamento.getText();

            String dados = "Nome musica = " + NomeMusica + " Nome Artista = " + NomeArtista + " Durcao = " + Duracao + " Genero = " + Genero + " Ano Lançamento " + AnoLancamento;

            JOptionPane.showMessageDialog(null,dados);
            JOptionPane.showMessageDialog(null,"Usuario Criado");
        }
    }

