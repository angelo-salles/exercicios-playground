package Aula1;

import java.util.Scanner;

public class exercicio1_1 {

    public static void main(String[] args) {
        // Exercicio 1
	    Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = ler.nextInt();
        for (int i = 0; i <= n; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
}
