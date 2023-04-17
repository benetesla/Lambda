package br.com.Polimorfismo;

public class Car extends Veiculo{
    public Car(String nome, double velocidadeMaxima, double aceleracao) {
        super(nome, velocidadeMaxima, aceleracao);
    }

    public void acelerar(){
        System.out.println("Acelerando o carro");
    }
}
