package br.com.stringmethods;

public class Food {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Food(String name) {
        this.name = name;
    }
    public void cozinha() {
        System.out.println("Cozinhando " + this.name);
    }
}
