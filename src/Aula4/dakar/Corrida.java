package Aula4.dakar;

import java.util.*;
import java.util.stream.Stream;

public class Corrida {
    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;

    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = new ArrayList<>();
    }

    public void registrarCarro(int velocidade, int aceleracao, double anguloDeGiro, String placa) {
        if (this.listaVeiculos.size() < this.quantidadeVeiculosPermitidos)
            this.listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void registrarCarro(Carro carro) {
        if (this.listaVeiculos.size() < this.quantidadeVeiculosPermitidos)
            this.listaVeiculos.add(carro);
    }

    public void registrarMoto(int velocidade, int aceleracao, double anguloDeGiro, String placa) {
        if (this.listaVeiculos.size() < this.quantidadeVeiculosPermitidos)
            this.listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void registrarMoto(Moto moto) {
        if (this.listaVeiculos.size() < this.quantidadeVeiculosPermitidos)
            this.listaVeiculos.add(moto);
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        this.listaVeiculos.removeIf(veiculo -> veiculo.getPlaca() == placa);
    }

    public Veiculo vencedorCorrida() {
        Veiculo maisRapido = this.listaVeiculos.get(0);
        for (Veiculo veiculo :
                this.listaVeiculos) {
            Double velocidadeVeiculo = veiculo.getVelocidade() * veiculo.getAceleracao() / (veiculo.getAnguloDeGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100));
            Double velocidadeMaisRapido = maisRapido.getVelocidade() * maisRapido.getAceleracao() / (maisRapido.getAnguloDeGiro() * (maisRapido.getPeso() - maisRapido.getRodas() * 100));
            if (velocidadeVeiculo > velocidadeMaisRapido)
                maisRapido = veiculo;
        }
        return maisRapido;
    }

    public void socorrerCarro(String placa) {
        Optional<Veiculo> carro = this.listaVeiculos
                .stream()
                .filter(veiculo -> veiculo.getPlaca() == placa)
                .findAny();
        if (carro.isPresent())
            SocorristaCarro.socorrer((Carro) carro.get());
        else
            System.out.println("Nao existe carro com essa placa");
    }

    public void socorrerMoto(String placa) {
        Optional<Veiculo> moto = this.listaVeiculos
                .stream()
                .filter(veiculo -> veiculo.getPlaca() == placa)
                .findAny();
        if (moto.isPresent())
            SocorristaMoto.socorrer((Moto) moto.get());
        else
            System.out.println("Nao existe moto com essa placa");
    }

    public List<Veiculo> listarVeiculos() {
        return this.listaVeiculos;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro(100, 10, 2.4, "KUV9F12");
        Moto moto1 = new Moto(200, 60, 5.8, "FYP3I57");
        Corrida corrida = new Corrida(1000, 2500.90, "Velozes e Furiosos 10: Corrida nas galaxias", 10);

        corrida.registrarCarro(carro1);
        corrida.registrarCarro(50, 25, 7.3, "EAR4T456");
        corrida.registrarMoto(moto1);
        corrida.registrarMoto(80, 74, 3.5, "DUT9Z021");
        System.out.println("VENCEDOR: " + corrida.vencedorCorrida());
        corrida.removerVeiculo(carro1);
        corrida.removerVeiculoPorPlaca("FYP3I57");
        corrida.socorrerMoto("DUT9Z21");
        corrida.socorrerMoto("DUT9Z021");
        corrida.socorrerCarro("EAR4T456");
    }
}
