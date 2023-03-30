package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator_v02;

public class Program_v02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator_v02 calc = new Calculator_v02();

		System.out.print("Informe o raio: ");
		double radius = sc.nextDouble();
		double c = calc.circumference(radius);
		double v = calc.volume(radius);

		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", calc.PI);

		sc.close();
	}

}
