package br.com.basicjava;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        //2d ArrayList
        ArrayList<String> bakery = new ArrayList<String>();
        bakery.add("Bread");//0
        bakery.add("Cake");//1
        bakery.add("Cookies");//2

        bakery.set(2, "Muffins");
        int bakery1 [] = {1,2,3,4,5,6,7,8,9,10};
        int bakery2 [] = {11,12,13,14,15,16,17,18,19,20};
        ArrayList<int[]> bakery3 = new ArrayList<int[]>();
        bakery3.add(bakery1);//0
        bakery3.add(bakery2);//1
        System.out.println(bakery3.get(1)[3]);
        System.out.println(bakery3.get(0)[3]);

        //1d ArrayList
        ArrayList<String> bakery4 = new ArrayList<String>();
        bakery4.add("Bread");//0
        bakery4.add("Cake");//1
        bakery4.add("Cookies");//2

        System.out.println(bakery4.get(0));

        Products  p1 = new Products("Bread", 2.50, 10);
        Products  p2 = new Products("Cake", 3.50, 10);
        Products  p3 = new Products("Cookies", 4.50, 10);
        ArrayList<Products> bakery5 = new ArrayList<Products>();
        bakery5.add(p1);//0
        bakery5.add(p2);//1
        bakery5.add(p3);//2

        System.out.println(bakery5.get(0).getName()+ " " + bakery5.get(0).getPrice());

    }
}
