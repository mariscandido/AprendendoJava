package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce ira informar a idade? ");
		int n = sc.nextInt();

		int[] vetorIdade = new int[n];
		String[] vetorNome = new String[n];

		int auxIdade = 0;
		String auxNome = null;

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			vetorNome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vetorIdade[i] = sc.nextInt();
			if (auxIdade < vetorIdade[i]) {
				auxIdade = vetorIdade[i];
				auxNome = vetorNome[i];
			}
		}

		System.out.println("Pessoa mais velha: " + auxNome);
		sc.close();
	}

}
