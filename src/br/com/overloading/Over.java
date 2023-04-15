package br.com.overloading;

import java.util.Random;

public class Over {
    Random r;
    int number;
    Over(){
        r = new Random();
        roll();
    }
    void roll(){
        number = r.nextInt(6) + 1;
        System.out.println("Rolling the dice: " + number);
    }       
}
