package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_sem_OO {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;

		System.out.println("Digite o tamanho dos lados do triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		System.out.println("Digite o tamanho dos lados do triangulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Area do triangulo X é : %.4f%n", areaX);
		System.out.printf("Area do triangulo Y é : %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Area do triangulo X é Maior");
		} else {
			System.out.println("Area do triangulo Y é Maior");
		}

		sc.close();
	}

}
