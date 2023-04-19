package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual é o preço do dólar? ");
		double vd = sc.nextDouble();

		System.out.print("Quantos dólares serão comprados? ");
		double vc = sc.nextDouble();

		double resutado = Conversao.Converter(vd, vc);
		System.out.printf("Valor a ser pago em reais = %.2f%n", resutado);

		sc.close();
	}

}
