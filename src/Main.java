public class Main {
    public static void main(String[] args) {
        Artista artista1 = new Artista("WIU", 23, "Homem", "Brasileiro", "Trap", "aaa");
        Musica musica1 = new Musica("Música 1", artista1, 180, "Pop", 2022);
        Musica musica2 = new Musica("Música 2", artista1, 210, "Pop", 2021);

        Playlist playlist1 = new Playlist("Playlist 1");
        playlist1.adicionarMusica(musica1);
        playlist1.adicionarMusica(musica2);

        Ouvinte ouvinte = new Ouvinte("João", 25, "Masculino", "Brasil");
        ouvinte.adicionarPlaylist(playlist1);

        System.out.println("Usuário: " + ouvinte.getNome());
        System.out.println("Playlist: " + playlist1.getNome());
        System.out.println("Músicas da playlist:");
        for (Musica musica : playlist1.obterListaMusicas()) {
            System.out.println("- " + musica.getNome());
        }
    }
}