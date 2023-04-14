package br.com.basicjava;
import java.util.Scanner;
public class Repeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();
        /*
         * while (a < 10) {
         * System.out.println("A é menor que 10");
         * a++;
         * }
         */
        do {
            if (a >= 10) {
                System.out.println("A é maior ou igual a 10");
            } else {
                System.out.println("A é menor que 10");
            }
            a++;
        } while (a < 10);

        scanner.close();
    }
}
