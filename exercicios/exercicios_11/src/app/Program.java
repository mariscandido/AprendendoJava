package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.print("Digite o número de contribuintes:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte nº " + i + ": ");
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Rendimento anual: ");
			double rendaAnual = sc.nextDouble();
			if (ch == 'f') {
				System.out.print("Despesas com saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else if (ch == 'j') {
				System.out.print("Número de Funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}

		double total = 0;
		System.out.println();
		System.out.println("Impostos Pagos: ");
		for (Pessoa pessoa : list) {
			double taxa = pessoa.imposto();
			System.out.println(pessoa.getNome() + ": $" + String.format("%.2f", taxa));
			total += taxa;
		}

		System.out.println();
		System.out.println("Impostos Pagos: $" + String.format("%.2f", total));

		sc.close();
	}

}
