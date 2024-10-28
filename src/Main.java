import challenges.Question01;
import challenges.Question02;
import challenges.Question03;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        manager();
    }

    public static void manager () {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a number from 1 to 3: ");
            int opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    Question01.execute();
                    System.out.println("\n");
                    System.out.println("------------------------------------------------------");
                    System.out.println("\n");
                    break;
                case 2:
                    Question02.execute();
                    System.out.println("\n");
                    System.out.println("------------------------------------------------------");
                    System.out.println("\n");
                    break;
                case 3:
                    Question03.execute();
                    System.out.println("\n");
                    System.out.println("------------------------------------------------------");
                    System.out.println("\n");
                    break;
                // Continue com os outros casos
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}