package br.com.lambda;
public class Usuario {
    private String nome;
    private int pontos;
    private String cpf;
    private boolean moderador;
    public Usuario(String nome, int pontos, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pontos = pontos;
        this.moderador = false;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public boolean isModerador() {
        return moderador;
    }
    public void tornaModerador() {
        this.moderador = true;
    }

    public boolean matches(String string) {
        return false;
    }
}