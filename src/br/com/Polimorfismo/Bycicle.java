package br.com.Polimorfismo;

public class Bycicle extends Veiculo{
    public Bycicle(String nome, double velocidadeMaxima, double aceleracao) {
        super(nome, velocidadeMaxima, aceleracao);
    }
    public void acelerar(){
        System.out.println("Acelerando a bicicleta");
    }

}
