import java.util.ArrayList;

public interface Add {
   void adicionarMusica(Musica musica);
   ArrayList<Musica> obterListaMusicas();
   String getNome();
   void setDuracao();
   int getDuracao();
}