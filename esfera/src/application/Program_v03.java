package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator_v03;

public class Program_v03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o raio: ");
		double radius = sc.nextDouble();
		double c = Calculator_v03.circumference(radius);
		double v = Calculator_v03.volume(radius);

		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculator_v03.PI);

		sc.close();
	}

}
