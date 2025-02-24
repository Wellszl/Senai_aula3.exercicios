package AulaTres;

import java.util.Scanner;

public class PrestaçãoAtrasada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor;
		double taxa;
		double tempo;
		double prest;
		//Primeiro coloquei as 3 variaveis da formula
		
		System.out.println("---Calculadora de Prestação atrasada");
		System.out.println("Insira aqui o valor da Prestação: ");
		valor = sc.nextDouble();
		System.out.println("Otimo!! Agora diga o valor da taxa: ");
		taxa = sc.nextDouble();
		System.out.println("Muito bem!! E a quanto tempo a prestação esta atrasada?: ");
		tempo = sc.nextDouble();
		
		prest = valor +(valor * (taxa/100)) * tempo;
		System.out.println(String.format("Certo!! Então o valor da Prestação ficou %.2f BRL", prest));
		
	}

}
