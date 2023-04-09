package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce ira informar os dados? ");
		int n = sc.nextInt();

		double[] vetorAltura = new double[n];
		char[] vetorGenero = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			sc.nextLine();
			vetorAltura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			vetorGenero[i] = sc.next().charAt(0);
		}

		double somaAlturaFeminina = 0.0;
		double MenorAltura = 5.0;
		double MaiorAltura = 0.0;
		int quantidadeDeHomens = 0;

		for (int i = 0; i < n; i++) {
			if (vetorGenero[i] == 'F') {
				somaAlturaFeminina += vetorAltura[i];
			} else {
				quantidadeDeHomens++;
			}
			if (MaiorAltura < vetorAltura[i]) {
				MaiorAltura = vetorAltura[i];
			}
			if (MenorAltura > vetorAltura[i]) {
				MenorAltura = vetorAltura[i];
			}
		}

		System.out.printf("Menor altura = %.2f\n", MenorAltura);
		System.out.printf("Maior altura = %.2f\n", MaiorAltura);

		double media = 0.0;
		media = somaAlturaFeminina / (n - quantidadeDeHomens);
		System.out.printf("Media das alturas das mulheres = %.2f\n", media);

		System.out.println("Quantidade de homens: " + quantidadeDeHomens);

		sc.close();
	}

}
