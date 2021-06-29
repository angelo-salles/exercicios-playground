package Aula2.exercicio4T;

public class FuncionarioCLT extends Funcionario{
    private Cargo cargo;

    public FuncionarioCLT(String nome, Cargo cargo) {
        super(nome);
        this.cargo = cargo;
    }

    @Override
    public void pagarSalario() {
        if (this.cargo == Cargo.Diretor) {
            this.setSalario(this.cargo.getSalarioBase() + 6000);
        } else {
            this.setSalario(this.cargo.getSalarioBase() + (this.cargo.getSalarioBase() * this.cargo.getBonificacao() / 100));
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " - Salário: " + getSalario() + " - Cargo: " + this.cargo;
    }

    public static void main(String[] args) {
        FuncionarioCLT angelo = new FuncionarioCLT("angelo", Cargo.Analista);
        System.out.println(angelo);
        angelo.pagarSalario();
        System.out.println(angelo);
    }
}
