package AulaTres;

import java.util.Scanner;

public class VolumeCaixa {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double altura;
		double comp;
		double larg;
		double vol;
		
		System.out.println("---Calculadora de Volume de Caixa---");
		System.out.println("Bom dia!! vamos calcular o volume da sua caixa");
		System.out.println("Insiria aqui o valor da altura da caixa: ");
		altura = sc.nextDouble();
		System.out.println("Otimo!! agora insira o comprimento da caixa: ");
		comp = sc.nextDouble();
		System.out.println("e agora pra finalizar me de o valor da largura da caixa: ");
		larg = sc.nextDouble();
		
		vol = comp * altura * larg;
		System.out.println(String.format("O volume total da sua caixa é de: %.2f", vol));
	}

}
