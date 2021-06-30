package Aula4.exercicio4T;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        Locale locale = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void pagarSalario();

    @Override
    public String toString() {
        return "Nome: " + nome + " - Salário: " + salario;
    }
}
