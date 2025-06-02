package AulaTres;

import java.util.Scanner;

public class CalculoGraus {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int c; // grau celsius
        int f; // grau fahrenheit
        
        System.out.println("---calculadora de graus c° para f°---");
        System.out.println("insira aqui quantos graus c está agora: ");
        c = sc.nextInt();
        
        f = c * 9 / 5 + 32; // formula para converter c para f
        System.out.println("convertendo para graus f° fica: " + f + " fahrenheit"); // mostra resultado
    }

}
