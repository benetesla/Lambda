package br.com.overloading;

import java.util.Scanner;

public class Pizza {
    String massa;
    String molho;
    String queijo;
    String bacon;
    String salada;

    Pizza(String massa, String molho, String queijo, String bacon, String salada) {
        this.massa = massa;
        this.molho = molho;
        this.queijo = queijo;
        this.bacon = bacon;
        this.salada = salada;
    }

    Pizza(String massa, String molho, String queijo){
        this.massa = massa;
        this.molho = molho;
        this.queijo = queijo;
    }
    @Override
    public String toString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo de mass");
        massa = sc.nextLine();
        System.out.println("Tipo de molho");
        molho = sc.nextLine();
        System.out.println("Tipo de queijo");
        queijo = sc.nextLine();
        System.out.println("Tipo de bacon");
        bacon = sc.nextLine();
        System.out.println("Tipo de salada");
        salada = sc.nextLine();
        sc.close();
        return "Pizza{" +
                "massa='" + massa + '\'' +
                ", molho='" + molho + '\'' +
                ", queijo='" + queijo + '\'' +
                ", bacon='" + bacon + '\'' +
                ", salada='" + salada + '\'' +
                '}';
    }
}
