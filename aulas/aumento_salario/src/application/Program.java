package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("Quantos funcionários serão cadastrados?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nFuncionario #" + (i + 1) + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id utilizado, tente novamente: ");
				id = sc.nextInt();
			}

			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			list.add(new Funcionario(id, name, salary));

		}

		System.out.println();
		System.out.print("Insira o ID do funcionário que terá aumento salarial: ");
		int id = sc.nextInt();

		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Este id não existe");
		} else {
			System.out.print("Digite a porcentagem: ");
			double percentage = sc.nextDouble();
			emp.aumentarSalario(percentage);
		}

		System.out.println();
		System.out.println("Lista dos funcionarios:");
		for (Funcionario obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
