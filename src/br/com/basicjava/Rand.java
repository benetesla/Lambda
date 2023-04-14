package br.com.basicjava;
import java.util.Random;
public class Rand {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(1000);
        System.out.println(num);         
    }   
}
