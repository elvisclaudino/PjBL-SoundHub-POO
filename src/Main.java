import swing.ArtistaGrafica;
import swing.CriarUsuario;
import swing.OuvinteInterface;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void exibirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Criar artista");
        System.out.println("2. Criar ouvinte");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
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
                    ArtistaGrafica artistaGrafica = new ArtistaGrafica();
                    break;
                case 2:
                    OuvinteInterface CriarOuvinte = new OuvinteInterface();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamento!");
            }
        }
    }
}
