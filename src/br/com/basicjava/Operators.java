package br.com.basicjava;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        /*
         * Operadores logicos
         * and &&
         * or ||
         * not !
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = scanner.nextInt();
        System.out.println("Digite o valor de D: ");
        int d = scanner.nextInt();

        if (a > b && c > d) {
            System.out.println("A é maior que B e C é maior que D");
        } else {
            System.out.println("A não é maior que B e C não é maior que D");
        }

        if (a > b || c > d) {
            System.out.println("A é maior que B ou C é maior que D");
        } else {
            System.out.println("A não é maior que B ou C não é maior que D");
        }

        if(!(a > b && c > d)) {
            System.out.println("A não é maior que B e C não é maior que D");
        } else {
            System.out.println("A é maior que B e C é maior que D");
        }

        scanner.close();
    }
}
