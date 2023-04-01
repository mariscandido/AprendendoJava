package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		if (n <= 10) {
			int[] vetor = new int[n];

			for (int i = 0; i < n; i++) {
				System.out.print("Digite um numero: ");
				vetor[i] = sc.nextInt();
			}

			System.out.println("");
			System.out.println("Numeros negativos:");

			for (int i = 0; i < n; i++) {
				if (vetor[i] < 0) {
					System.out.printf("%d\n", vetor[i]);
				}
			}
		} else {
			System.out.print("Maximo de numeros = 10 ");
		}

		sc.close();
	}

}
