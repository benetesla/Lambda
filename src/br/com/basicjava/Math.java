package br.com.basicjava;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        x = input.nextDouble();
        System.out.println("Digite o valor de y: ");
        y = input.nextDouble();
        System.out.println("Digite o valor de z: ");
        z = input.nextDouble();
        // hipotenusa
        double h = java.lang.Math.sqrt(java.lang.Math.pow(x, 2) + java.lang.Math.pow(y, 2));
        // area do triangulo
        double a = (x * y) / 2;
        // area do circulo
        double c = java.lang.Math.PI * java.lang.Math.pow(z, 2);
        // area do trapezio
        double t = ((x + y) * z) / 2;
        // area do quadrado
        double q = java.lang.Math.pow(y, 2);
        // area do retangulo
        double r = x * y;
        System.out.println("Hipotenusa: " + h + "A are do triangulo: " + a + "A area do circulo: " + c + "A area do trapezio: " + t + "A area do quadrado: " + q + "A area do retangulo: " + r + "");
        input.close();

    }

}
