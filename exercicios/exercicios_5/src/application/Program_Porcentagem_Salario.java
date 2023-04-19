package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program_Porcentagem_Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario empregado = new Funcionario();
		
		System.out.println("Insira os dados do funcionario.");
		
		System.out.print("Nome:");
		empregado.nome = sc.nextLine();
		System.out.print("Salario Bruto:");
		empregado.salarioBruto = sc.nextDouble();
		System.out.print("Taxa:");
		empregado.taxa = sc.nextDouble();

		System.out.printf("Funcionario: " + empregado.nome + ", $ %.2f%n" ,empregado.SalarioLiquido());
		
		System.out.print("Digite a porcentagem de aumento no salario de " + empregado.nome + " : ");
		double porcentagem = sc.nextDouble();
		empregado.AtualizaSalario(porcentagem);
		System.out.println();
		System.out.println("Salario Atualizado.");
		System.out.printf("Funcionario: " + empregado.nome + ", $ %.2f%n" , empregado.SalarioLiquido());
		
		sc.close();
	}

}
