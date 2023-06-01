import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void exibirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Criar artista");
        System.out.println("2. Criar ouvinte");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static Artista criarArtista(Scanner scanner) {
        System.out.println("==== Criar Artista ====");
        System.out.print("Nome do artista: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do artista: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Gênero do artista: ");
        String genero = scanner.nextLine();

        System.out.print("Nacionalidade do artista: ");
        String nacionalidade = scanner.nextLine();

        System.out.print("Gênero musical do artista: ");
        String generoMusical = scanner.nextLine();

        System.out.print("Apelido do artista: ");
        String apelido = scanner.nextLine();

        Artista artista = new Artista(nome, idade, genero, nacionalidade, generoMusical, apelido);
        System.out.println("Artista criado com sucesso!");

        return artista;
    }

    public static Ouvinte criarOuvinte(Scanner scanner) {
        System.out.println("==== Criar Ouvinte ====");
        System.out.print("Nome do ouvinte: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do ouvinte: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Gênero do ouvinte: ");
        String genero = scanner.nextLine();

        System.out.print("Nacionalidade do ouvinte: ");
        String nacionalidade = scanner.nextLine();

        Ouvinte ouvinte = new Ouvinte(nome, idade, genero, nacionalidade);
        System.out.println("Ouvinte criado com sucesso!");

        return ouvinte;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Artista artista = criarArtista(scanner);
                    Writer.adicionarArtistaEmArquivo(artista);
                    break;
                case 2:
                    Ouvinte ouvinte = criarOuvinte(scanner);
                    Writer.adicionarOuvinteEmArquivo(ouvinte);
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamento!");
            }
        }
    }
}
