package br.com.basicjava;
import javax.swing.JOptionPane;
public class Basic {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "Olá, " + nome);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade?"));
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos");

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua altura?"));
        JOptionPane.showMessageDialog(null, "Você tem " + altura + " metros de altura");

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu peso?"));
        JOptionPane.showMessageDialog(null, "Você tem " + peso + " quilos");

        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é " + imc);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            JOptionPane.showMessageDialog(null, "Você está no peso ideal");
        } else if (imc >= 25 && imc < 30) {
            JOptionPane.showMessageDialog(null, "Você está com sobrepeso");
        } else if (imc >= 30 && imc < 40) {
            JOptionPane.showMessageDialog(null, "Você está com obesidade");
        } else {
            JOptionPane.showMessageDialog(null, "Você está com obesidade mórbida");
        }

        //saudacao do usuario

          }
}
