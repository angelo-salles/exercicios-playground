package Aula4.dakar;

public class Veiculo {
    private int velocidade;
    private int aceleracao;
    private double anguloDeGiro;
    private String placa;
    private double peso;
    private int rodas;

    public Veiculo(int velocidade, int aceleracao, double anguloDeGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPeso() {
        return peso;
    }

    public int getRodas() {
        return rodas;
    }

    @Override
    public String toString() {
        return "Velocidade: " + velocidade +
                " - aceleracao: " + aceleracao +
                " - anguloDeGiro: " + anguloDeGiro +
                " - placa: '" + placa + '\'' +
                " - peso: " + peso +
                " - rodas: " + rodas + "\n";
    }
}
