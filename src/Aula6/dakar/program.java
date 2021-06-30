package Aula6.dakar;

public class program {
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
