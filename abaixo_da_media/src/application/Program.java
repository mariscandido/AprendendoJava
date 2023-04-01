package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros terá o vetor? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		double soma = 0.0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}

		double media = soma / n;
		System.out.println("Media do vetor = " + media);

		System.out.println("Numeros abaixo da media:");

		for (int i = 0; i < n; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}

		sc.close();
	}

}
