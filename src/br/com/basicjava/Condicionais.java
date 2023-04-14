package br.com.basicjava;

public class Condicionais {            
        public static void main(String[] args) {
            int idade = 79;
            if (idade>=75) {
                System.out.println("Idoso");
            } else if (idade>=18) {
                System.out.println("Adulto");
            } else if (idade>=12) {
                System.out.println("Adolescente");
            } else {
                System.out.println("Criança");
            }
        }
}
