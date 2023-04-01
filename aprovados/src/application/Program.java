package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce ira informar a idade? ");
		int n = sc.nextInt();

		double[] vetorNota1 = new double[n];
		double[] vetorNota2 = new double[n];
		String[] vetorNome = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			sc.nextLine();
			vetorNome[i] = sc.nextLine();
			vetorNota1[i] = sc.nextDouble();
			vetorNota2[i] = sc.nextDouble();
		}

		double media = 0.0;
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {
			media = (vetorNota1[i] + vetorNota2[i]) / 2;
			if (media >= 6.0) {
				System.out.println(vetorNome[i]);
			}
		}

		sc.close();
	}

}
