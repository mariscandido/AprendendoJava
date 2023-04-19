package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matr = new int[n][n];

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Numeros na diagonal: ");
		for (int i = 0; i < matr.length; i++) {
			System.out.println(matr[i][i] + "");
		}

		int count = 0;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (matr[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("Quantidade de Numeros negativos: " + count);

		sc.close();
	}

}
