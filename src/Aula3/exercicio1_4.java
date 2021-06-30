package Aula3;

import java.util.Scanner;

public class exercicio1_4 {
    public static boolean ehPrimo(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero de repetiçao");
        int n = ler.nextInt();
        int i = 2, count = 0;
        while (count < n) {
            if (ehPrimo(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
