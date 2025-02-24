package AulaTres;

import java.util.Scanner;

public class VelocidadeMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double temp;
		double vel;
		double dis;
		double gas;
		
		System.out.println("---calculo de G/H---");
		System.out.println("quanto tempo vc vai passar na estrada essa viagem?");
		temp = sc.nextDouble();
		System.out.println("Qual a velocidade media que vc vai manter na viagem");
		vel = sc.nextDouble();
		
		dis = temp * vel;
		gas = dis / 12;
		System.out.println(String.format("a distancia percorrida sera de: %.2f", dis));
		System.out.println(String.format("sendo assim a gasolina gasta nessa viagem sera de: %.2f litros", gas));
	}

}
