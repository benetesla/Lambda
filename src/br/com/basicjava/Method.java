package br.com.basicjava;

public class Method {
    public static void main(String[] args) {
        String name = "Bene";
        int age = 25;
        Hello(name, age);
        int x = 3;
        int y = 4;
        int result = add(x, y);
        System.out.println(result);
        result = sub(x, y);
        System.out.println(result);
    
    }

    static void Hello(String name, int age) {
        System.out.println("Hello " + name + " you are " + age + " years old");
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }
}
