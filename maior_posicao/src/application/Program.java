package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		double x = 0.0;
		int y = 0;
		
		for (int i = 0; i < n; i++) {
			if(vetor[i]> x) {
				x = vetor[i];
				y = i;
			}
		}

		System.out.println("Maior valor: " + x);
		System.out.println("Posicao do maior valor: " + y);
		
		sc.close();
	}

}
