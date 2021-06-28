package Aula1;

import java.util.Arrays;
import java.util.Collections;

public class exercicio2_1 {

    public static void main(String[] args) {
        Integer[] array = {52, 10, 85,  1324, 01, 13, 62, 30, 12, 127};

        // Array crescente
        System.out.println("Array em ordem crescente");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // Array descrescente
        System.out.println("Array em ordem decrescente");
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }

}
