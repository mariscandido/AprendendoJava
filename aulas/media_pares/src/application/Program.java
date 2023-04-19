package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros terá o vetor? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		int soma = 0;
		int aux = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				aux ++;
			}
		}

		if (soma != 0) {
			double media = (double) soma / aux;
			System.out.printf("Media dos numeros PARES = %.2f\n", media);
		} else {
			System.out.println("Nenhum dos numeros digitados é PAR");
		}

		sc.close();
	}

}
