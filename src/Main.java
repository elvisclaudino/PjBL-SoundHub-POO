public class Main {
    public static void main(String[] args) {
        Artista artista1 = new Artista("WIU", 23, "Homem", "Brasileiro", "Trap", "aaa");
        Musica musica1 = new Musica("Música 1", artista1, 180, "Pop", 2022);
        Musica musica2 = new Musica("Música 2", artista1, 210, "Pop", 2021);

        Ouvinte ouvinte = new Ouvinte("João", 25, "Masculino", "Brasil");
        Playlist playlist1 = new Playlist("Playlist 1", "Sertanejo", 2003, ouvinte);
        Album album1 = new Album("Album 1", "Rock", 2020, artista1);

        album1.adicionarMusica(musica1);
        album1.adicionarMusica(musica2);
        artista1.adicionarAlbum(album1);

        playlist1.adicionarMusica(musica1);
        playlist1.adicionarMusica(musica2);
        ouvinte.adicionarPlaylist(playlist1);

        System.out.println("Usuário: " + ouvinte.getNome());
        System.out.println("Playlist: " + playlist1.getNome());
        System.out.println("Músicas da playlist:");
        for (Musica musica : playlist1.obterListaMusicas()) {
            System.out.println("- " + musica.getNome());
        }
        playlist1.setDuracao();
        System.out.println("Duração da playlist: " + playlist1.getDuracao() + " segundos");

        System.out.println("Usuário: " + album1.getNome());
        System.out.println("Playlist: " + album1.getNome());
        System.out.println("Músicas do album:");
        for (Musica musica : album1.obterListaMusicas()) {
            System.out.println("- " + musica.getNome() + " - " + musica.getDuracao() + "s");
        }
        album1.setDuracao();
        System.out.println("Duração do album: " + album1.getDuracao() + " segundos");
    }
}