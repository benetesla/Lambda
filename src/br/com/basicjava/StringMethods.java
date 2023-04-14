package br.com.basicjava;

public class StringMethods {
    public static void main(String[] args) {
        //string methods
       String [][] names = {{"Mr. ", "Mrs. ", "Ms. "}, {"Smith ", " Jones"}};
       for (String[] name : names) {
           for (String title : name) {
               System.out.print(title);
           }
           System.out.println();
       }
    }
}
