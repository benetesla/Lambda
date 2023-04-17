package br.com.Interfaces;

public  interface Predator {
    public default void hunt() {
        System.out.println("This is a predator class");
    }
}
