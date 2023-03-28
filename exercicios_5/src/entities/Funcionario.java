package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double taxa;

	public double SalarioLiquido() {
		return salarioBruto - taxa;
	}

	public void AtualizaSalario(double porcentagem) {
		salarioBruto += (salarioBruto * (porcentagem / 100));
	}
}
