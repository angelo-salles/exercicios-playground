package Aula4.exercicio1M;

public class ContaCorrente {
    private double balance;
    private String document;
    private int agency;
    private int accountNumber;

    public ContaCorrente(double balance, String document, int agency, int accountNumber) {
        this.balance = balance;
        this.document = document;
        this.agency = agency;
        this.accountNumber = accountNumber;
    }

    public ContaCorrente(ContaCorrente acc) {
        this.balance = acc.balance;
        this.document = acc.document;
        this.agency = acc.agency;
        this.accountNumber = acc.accountNumber;
    }

    public void deposito() {

    }

    public void saque() {

    }

    public void devolucao() {

    }

    public void transferencia() {

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "balance= " + balance +
                ", document= " + document +
                ", agency= " + agency +
                ", accountNumber= " + accountNumber +
                '}';
    }

    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente(57.23, "05685053525", 2346, 431259);
        ContaCorrente contaCorrente2 = new ContaCorrente(contaCorrente1);
        System.out.println(contaCorrente1);
        System.out.println(contaCorrente2);
    }
}
