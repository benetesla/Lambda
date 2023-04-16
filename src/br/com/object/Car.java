package br.com.object;

public class Car {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Car(String name) {
        this.name = name;
    }

    public void drive() {
        System.out.println("Driving " + this.name);
    }

    public void stop() {
        System.out.println("Stopping " + this.name);
    }
    

}
