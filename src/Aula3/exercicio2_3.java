package Aula3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco * quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return nome  + "\n" + currencyFormatter.format(preco) + "\nQuantidade: " + quantidade;
    }
}

public class exercicio2_3 {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o nome do produto");
            String nome = ler.next();
            System.out.println("Digite o preço do produto");
            double preco = ler.nextDouble();
            System.out.println("Digite a quantidade de produtos");
            int qtd = ler.nextInt();
            produtos.add(new Produto(nome, preco, qtd));
        }

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("Produto " + (i + 1));
            System.out.println(produtos.get(i));
        }
        Locale locale = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        double precoTotal = produtos
                .stream()
                .mapToDouble(Produto::getPreco)
                .sum();
        System.out.println("Valor total: " + currencyFormatter.format(precoTotal));
    }

}
