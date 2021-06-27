package Aula3;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Empresa implements Comparable<Empresa> {
    private final String nome;
    private double avaliacao;
    private final int taxaCrescimentoAnual;
    private LocalDate dataAtual;

    public Empresa(String nome, double avaliacao, int taxaCrescimentoAnual) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.taxaCrescimentoAnual = taxaCrescimentoAnual;
        this.dataAtual = LocalDate.of(2021, 1, 1);
    }

    public void evolucaoAnual() {
        this.avaliacao += this.avaliacao * this.taxaCrescimentoAnual / 100;
        this.dataAtual = this.dataAtual.plusYears(1);
    }

    @Override
    public int compareTo(Empresa e) {
        return Double.compare(this.avaliacao, e.avaliacao);

    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Empresa " + nome + " - " + this.dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - Valor da empresa " + df.format(this.avaliacao) + 'm';
    }
}

public class exercicio2_2 {

    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("x", 1.13, 148);
        Empresa empresa2 = new Empresa("y", 18.4, 32);
        while (empresa1.compareTo(empresa2) != 1) {
            System.out.println(empresa1);
            System.out.println(empresa2);
            System.out.println("---------- Evolução anual ----------");
            empresa1.evolucaoAnual();
            empresa2.evolucaoAnual();
        }
        System.out.println(empresa1);
        System.out.println(empresa2);
    }

}
