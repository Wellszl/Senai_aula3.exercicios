package AulaTres;

import java.util.Scanner;

public class TrocaNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1;
		double n2;
		// variaveis para guardar os numeros
		
		System.out.println("olá, bom dia!");
		System.out.println("me dia o seu priemrio numero");
		n1 = sc.nextDouble();
		System.out.println("me diga o segundo numero");
		n2 = sc.nextDouble();
		
		double aux = n1;
		n1 = n2;
		n2 = aux;
		// troca os valores usando uma variavel auxiliar
		
		System.out.println("o valor do n1 é:" + n1);
		System.out.println("o valor do n2 é:" + n2);
		// mostra os valores trocados
	}

}
