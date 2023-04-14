package br.com.basicjava;

public class StringMethods {
    public static void main(String[] args) {
        // string methods
        String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith ", " Jones" } };
        for (String[] name : names) {
            for (String title : name) {
                System.out.print(title);
            }
            System.out.println();
        }

        String name = "Mr. Smith";
        Boolean b1 = name.startsWith("Mr.");
        Boolean b2 = name.endsWith("Smith");
        Boolean b3 = name.contains("Smi");
        Boolean b4 = name.equals("Mr. Smith");
        Boolean b5 = name.equalsIgnoreCase("mr. smith");
        Boolean b6 = name.isEmpty();
        Boolean b7 = name.isBlank();
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5 + " " + b6 + " " + b7);

 }
}
