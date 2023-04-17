package br.com.Polimorfismo;

public class Boat extends Veiculo{
    public Boat(String nome, double velocidadeMaxima, double aceleracao) {
        super(nome, velocidadeMaxima, aceleracao);
    }
    public void acelerar(){
        System.out.println("Acelerando o barco");
    }

    
}
