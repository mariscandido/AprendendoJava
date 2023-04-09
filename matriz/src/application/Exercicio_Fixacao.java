package application;

import java.util.Scanner;

public class Exercicio_Fixacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe quantas linhas terá na matriz: ");
		int m = sc.nextInt();
		System.out.print("Informe quantas colunas terá na matriz: ");
		int n = sc.nextInt();
		int[][] matriz = new int[m][n];

		System.out.println("\nInforme os dados da matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("\nDigite o numero que deseja saber a posição: ");
		int x = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("\nPosição: " + i + "," + j);
					if (j > 0) {
						System.out.println("Numero a esquerda: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Numero acima: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Numero a direita: " + matriz[i][j + 1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Numero abaixo: " + matriz[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
