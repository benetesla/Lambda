package br.com.objects;

import java.util.Scanner;

public class Object {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", "Red", 2019, 1000000);
        System.out.println(car.getModel()+ " " + car.getColor() + " " + car.getYear() + " " + car.getPrice());
        car.drive();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();
        Human human = new Human(name, age, height, weight);
        System.out.println("Your user Name is: " + human.getName() + " and your age is: " + human.getAge() + " and your height is: " + human.getHeight() + " and your weight is: " + human.getWeight());
        human.eat();
        human.sleep();
        scanner.close();
    }
}
