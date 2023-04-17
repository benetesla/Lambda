package br.com.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", 300, 20);
        Bycicle bycicle = new Bycicle("BMX", 100, 2);
        Boat boat = new Boat("Canoa", 50, 2);
        boat.acelerar();
        car.acelerar();
        bycicle.acelerar();
        System.out.println(car.getNome() + " " + car.getVelocidadeMaxima() + " " + car.getAceleracao());
        System.out.println(bycicle.getNome() + " " + bycicle.getVelocidadeMaxima() + " " + bycicle.getAceleracao());
        System.out.println(boat.getNome() + " " + boat.getVelocidadeMaxima() + " " + boat.getAceleracao());
    }
}
