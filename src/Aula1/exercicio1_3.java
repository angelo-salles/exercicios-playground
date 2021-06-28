package Aula1;

import java.util.Scanner;

public class exercicio1_3 {

    public static boolean ehPrimo(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Exercicio 3
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = ler.nextInt();


        if (ehPrimo(n)) {
            System.out.printf("O número %d é primo", n);
        } else {
            System.out.printf("O número %d não é primo", n);
        }
    }

}
