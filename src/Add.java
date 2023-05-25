import java.util.ArrayList;

public interface Add {
   void adicionarMusica(Musica musica);
   ArrayList<Musica> obterListaMusicas();

   ArrayList<Album> obterAlbumMusicas();

   String getNome();
}