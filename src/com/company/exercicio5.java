package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a ser exibida");
        int n = ler.nextInt();
        System.out.println("Digite a ocorrencia dos digitos");
        int m = ler.nextInt();
        System.out.println("Digite o digito a ser repetido");
        Integer d = ler.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 0;
        while (numbers.size() < n) {
                String parsedNumber = Integer.toString(i);
                int occurrences = 0;
                for (int j = 0; j < parsedNumber.length(); j++) {
                    if (Character.toString(parsedNumber.charAt(j)).equals(d.toString())) {
                        occurrences++;
                    }
                }
                if (occurrences >= m) {
                    numbers.add(i);
                }
                i++;
        }
        for (int number :
                numbers) {
            System.out.println(number);
        }


        /* String teste;
        teste = Integer.toString(23);
        System.out.println(teste.charAt(teste.length() - 1));
        int a = 2;
        char b = '2';
        System.out.println(Integer.toString(a).equals(Character.toString(b))); */
    }

}
