package Aula4.exercicio1M;

public class program {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(157.50, "23423424", 2346, 48825);
        ContaCorrente cc2 = new ContaCorrente(cc1);
        System.out.println(cc1);
        System.out.println(cc2);
    }
}
