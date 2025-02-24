package AulaTres;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double altura;
		double peso;
		int idade;
		double IMC;
		
		System.out.println("Bom dia!!");
		System.out.println("bem vindo a calculadora de IMC");
		System.out.println("Insira aqui a sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Otimo!! insira agora a sua altura: ");
		altura = sc.nextDouble();
		
		System.out.println("Muito bem!! agora pra finalizar me diga seu peso: ");
		peso = sc.nextDouble();
		
		IMC = (altura * altura) / peso;
		System.out.println("o valor do seu IMC é: " + String.format("%2f", IMC));
	
	}

}
