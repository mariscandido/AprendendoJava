package application;

import java.util.Locale;
import java.util.Scanner;

import etities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			int x = i + 1;
			System.out.println("Dados da " + x + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
		}

		double soma = 0;
		double nmenores = 0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				nmenores++;
			}
			soma += vect[i].getAltura();
		}

		double media = soma / vect.length;
		System.out.printf("Altura média: %.2f%n", media);

		double y = ((double) nmenores / n) * 100.0;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", y);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.printf("%s\n", vect[i].getNome());
			}
		}

		sc.close();
	}

}
