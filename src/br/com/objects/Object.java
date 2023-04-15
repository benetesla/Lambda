package br.com.objects;

public class Object {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", "Red", 2019, 1000000);
        System.out.println(car.getModel()+ " " + car.getColor() + " " + car.getYear() + " " + car.getPrice());
        car.drive();

        Human human = new Human("John", 25, 1.75, 70);
        System.out.println(human.getName() + " " + human.getAge() + " " + human.getHeight() + " " + human.getWeight());
        human.eat();
        human.sleep();
    }
}
