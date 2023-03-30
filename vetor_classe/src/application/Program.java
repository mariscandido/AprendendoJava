package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de produtos a serem inseridos: ");
		int n = sc.nextInt();
		
		Produto[] vect = new Produto[n];
		
		System.out.println("Digite o nome e o valor dos " + n + " produtos: ");
		
		for (int i=0;i<vect.length;i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco);
		}
		double soma = 0.0;

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getValor();
		}
		System.out.printf("Soma dos valores corresponde a %.2f%n", soma);
		
		double media = soma / vect.length;
		System.out.printf("Media dos valores corresponde a %.2f%n", media);

		sc.close();
	}

}
