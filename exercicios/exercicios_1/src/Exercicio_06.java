import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, c, tri, cir, tra, qua, ret;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		tri = (a * c) / 2;
		cir = (Math.pow(c, 2)) * 3.14159;
		tra = ((a + b) * c) / 2;
		qua = (Math.pow(b, 2));
		ret = a * b;

		System.out.printf("Triangulo: %.3f%n", tri);
		System.out.printf("Circulo: %.3f%n", cir);
		System.out.printf("Trapezio: %.3f%n", tra);
		System.out.printf("Quadrado: %.3f%n", qua);
		System.out.printf("Retangulo: %.3f%n", ret);

		sc.close();
	}

}
