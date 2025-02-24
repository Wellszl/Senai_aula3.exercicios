package AulaTres;

import java.util.Scanner;

public class CalculoGrausF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int C;
		int F;
		
		System.out.println("---Calculadora de Graus F° para C°---");
		System.out.println("insira aqui quantos graus F está agora: ");
		F = sc.nextInt();
		
		C = ((F -32) * 5) / 9;
		System.out.println("convertendo para graus F° fica: " + C + "° Celsius");
		
	}

}
