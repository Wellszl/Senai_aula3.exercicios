package AulaTres;

import java.util.Scanner;

public class VolumeCilindro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double V;
		double R;
		double H;
		
		
		System.out.println("---Calculadora de Volume---");
		System.out.println("Bem vndo!!!, qual é o raio da base da da lata que vc quer descobrir?");
		R = sc.nextDouble();
		
		System.out.println("Certo! Agora me diga o valor da altura desse cilindro");
		H = sc.nextDouble();
		
		V = 3.14 * (R * R) * H;
		System.out.println(String.format("O volume da sua lata de oléo é igual a: %.2f", V));
		
	}

}
