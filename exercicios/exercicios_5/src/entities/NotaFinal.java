package entities;

public class NotaFinal {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double SomaNotas() {
		return nota1 + nota2 + nota3;
	}
	
	public String toString() {
		if ((nota1 + nota2 + nota3)> 60) {
			return nome + " Passou!";
		}else {
			double nota = 60 -(nota1 + nota2 + nota3);
			return nome + " Reprovou! Faltou " + String.format("%.2f", nota) + " pontos.";
		}
	}
}
