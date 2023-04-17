package br.com.Polimorfismo;

public class Veiculo {
    private String nome;
    private double velocidadeMaxima;
    private double aceleracao;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getAceleracao() {
        return this.aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public Veiculo(String nome, double velocidadeMaxima, double aceleracao) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.aceleracao = aceleracao;
    }

    

}
