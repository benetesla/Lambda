package br.com.objects;

public class Human {
    /*
     * Primeirra parte
     * Temos os atributos da classe
     * Segunda partte os metodos
     */

    /*
     * 
     * Atributos
     * Nome
     * Idade
     * Altura
     * Peso
     */
    private String name;
    private int age;
    private double height;
    private double weight;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Human(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    /*
     * Metodos
     * Falar
     * Comer
     * Dormir
     */
    
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void speak() {
        System.out.println("Speaking...");
    }
    
}
