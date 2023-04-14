package br.com.basicjava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList0 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        nomes.add(nome);
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        nomes.add(nome);
        sc.close();
        nomes.set(0, "João");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
