package br.com.Interfaces;

public class Fish implements Prey, Predator {
    public void flee() {
        System.out.println("Fish is fleeing");
    }
    public void hunt() {
        System.out.println("Fish is hunting");
    }
}
