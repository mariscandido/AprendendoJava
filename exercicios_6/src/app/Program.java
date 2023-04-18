package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Digite o nome do Departamento: ");
		String dep = sc.nextLine();
		System.out.println("Digite dados do funcionario: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Salario Base: ");
		double salario = sc.nextDouble();
		Worker worker = new Worker(nome, WorkerLevel.valueOf(level), salario, new Departament(dep));

		System.out.print("Quantos contratos o funcionario tem? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do #" + i + " contrato: ");
			System.out.print("Data (DD/MM/AAAA): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valhr = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int d = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valhr, d);
			worker.addContrato(contract);
		}

		System.out.println();
		System.out.print("Digite o mês e o ano para calcular o rendimento (MM/AAAA): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + worker.getNome());
		System.out.println("Departamento: " + worker.getDepartamento().getName());
		System.out.println("Rendimento em " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}

}
