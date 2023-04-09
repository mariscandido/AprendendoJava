package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas irão alugar um quarto? ");
		int n = sc.nextInt();

		String[] vetorNome = new String[10];
		String[] vetorEmail = new String[10];

		for (int i = 0; i < n; i++) {
			System.out.println("\nInforme os seguintes dados da " + (i + 1) + "a pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int numeroQuarto = sc.nextInt();

			vetorNome[numeroQuarto] = nome;
			vetorEmail[numeroQuarto] = email;
		}

		System.out.println("\nQuartos alugados: ");

		for (int i = 0; i < 10; i++) {
			if (vetorNome[i] != null) {
				System.out.println(i + ": " + vetorNome[i] + ", " + vetorEmail[i]);
			}
		}

		sc.close();
	}

}
