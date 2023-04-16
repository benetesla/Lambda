package br.com.stringmethods;

public class StrinM {
    public static void main(String[] args) {
    
        Food [] foods = new Food[3];
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburguer");
        Food food3 = new Food("Hot Dog");
        foods[0] = food1;
        foods[1] = food2;
        foods[2] = food3;
        for (Food food : foods) {
            System.out.println(food.getName());
        }
        food1.cozinha();
    }
}
