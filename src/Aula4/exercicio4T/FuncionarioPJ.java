package Aula4.exercicio4T;

public class FuncionarioPJ extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioPJ(String nome, int horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public void pagarSalario() {
        this.setSalario(this.horasTrabalhadas * this.valorHora);
    }

    public static void main(String[] args) {
        FuncionarioPJ angelo = new FuncionarioPJ("Angelo", 10, 153.24);
        System.out.println(angelo);
        angelo.pagarSalario();
        System.out.println(angelo);
    }
}
