package AulaTres;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double altura; // altura
        double peso; // peso
        int idade; // idade
        double imc; // indice de massa corporal
        
        System.out.println("bom dia!!");
        System.out.println("bem vindo a calculadora de imc");
        System.out.println("insira aqui a sua idade: ");
        idade = sc.nextInt(); // recebe idade
        
        System.out.println("otimo!! insira agora a sua altura: ");
        altura = sc.nextDouble(); // recebe altura
        
        System.out.println("muito bem!! agora pra finalizar me diga seu peso: ");
        peso = sc.nextDouble(); // recebe peso
        
        imc = (peso) / (altura * altura); // calcula o imc (peso dividido pela altura ao quadrado)
        System.out.println("o valor do seu imc é: " + String.format("%.2f", imc));
    
    }

}
