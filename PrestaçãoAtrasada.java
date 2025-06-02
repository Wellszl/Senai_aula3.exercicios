package AulaTres;

import java.util.Scanner;

public class PrestaçãoAtrasada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor;
		double taxa;
		double tempo;
		double prest;
		// variaveis para calcular o valor total
		
		System.out.println("---calculadora de prestação atrasada");
		System.out.println("insira aqui o valor da prestação: ");
		valor = sc.nextDouble();
		System.out.println("otimo!! agora diga o valor da taxa: ");
		taxa = sc.nextDouble();
		System.out.println("muito bem!! e a quanto tempo a prestação esta atrasada?: ");
		tempo = sc.nextDouble();
		
		prest = valor + (valor * (taxa / 100)) * tempo; // formula da prestação 
		System.out.println(String.format("certo!! então o valor da prestação ficou %.2f brl", prest));
	}

}
