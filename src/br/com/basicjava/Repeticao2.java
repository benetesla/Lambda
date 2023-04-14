package br.com.basicjava;

import java.util.Scanner;

public class Repeticao2 {
    public static void main(String[] args) {
        //for 
        //foreach
        //forin

        int a = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de A: " + a);
            a++;
        }

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array: " + array[i]);
        }
        //foreach
        for (int i : array) {
            System.out.println("Array foreach: " + i);
        }
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "*";

        System.out.println("Digite o número de linhas: ");
        rows = scanner.nextInt();
        System.out.println("Digite o número de colunas: ");
        columns = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println("");
        }
        scanner.close();

    }
}
