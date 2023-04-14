package br;

public class Supplier <T> {
    private T value;
    public Supplier(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}
