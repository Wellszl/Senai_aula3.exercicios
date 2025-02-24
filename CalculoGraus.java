package AulaTres;

import java.util.Scanner;

public class CalculoGraus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int C;
		int F;
		
		System.out.println("---Calculadora de Graus C° para F°---");
		System.out.println("insira aqui quantos graus C está agora: ");
		C = sc.nextInt();
		
		F = C * 9 / 5 + 32;
		System.out.println("convertendo para graus F° fica: " + F + " Fahrenheit");
	}

}
;