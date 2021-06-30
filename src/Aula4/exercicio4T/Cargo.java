package Aula4.exercicio4T;

public enum Cargo {
    Tecnico(5, 40, 0, 3200),
    Analista(8, 40, 4, 4000),
    Gerente(12.5, 36, 4, 6000),
    Diretor(0, 40, 0, 15000);

    private final double bonificacao;
    private final int cargaHoraria;
    private final int descansoSemanal;
    private final double salarioBase;

    Cargo(double bonificacao, int cargaHoraria, int descansoSemanal, double salarioBase) {
        this.bonificacao = bonificacao;
        this.cargaHoraria = cargaHoraria;
        this.descansoSemanal = descansoSemanal;
        this.salarioBase = salarioBase;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getDescansoSemanal() {
        return descansoSemanal;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
