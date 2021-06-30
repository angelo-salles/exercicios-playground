package Aula3;

import java.util.Scanner;

public class exercicio1_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero de repeticoes");
        int n = ler.nextInt();
        System.out.println("Digite o numero desejado");
        int m = ler.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i * m);
        }
    }
}
