package AulaTres;

import java.util.Scanner;

public class CalculoGrausF {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int c; // graus celsius
        int f; // graus fahrenheit
        
        System.out.println("---calculadora de graus f° para c°---");
        System.out.println("insira aqui quantos graus f está agora: ");
        f = sc.nextInt();
        
        c = ((f - 32) * 5) / 9; // formula pra converter f para c
        System.out.println("convertendo para graus f° fica: " + c + "° celsius"); // mostra resultado
    }

}
