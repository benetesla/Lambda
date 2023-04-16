package br.com.object;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari");
        car.drive();
        car.stop();
        Garage garage = new Garage();
        garage.park(car);
    }
}
