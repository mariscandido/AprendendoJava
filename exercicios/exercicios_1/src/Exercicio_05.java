import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, npec1, npec2;
		double val1, val2, valt;

		cod1 = sc.nextInt();
		npec1 = sc.nextInt();
		val1 = sc.nextDouble();

		cod2 = sc.nextInt();
		npec2 = sc.nextInt();
		val2 = sc.nextDouble();

		valt = ((npec1 * val1) + (npec2 * val2));

		System.out.printf("Valor a pagar: R$ %.2f", valt);

		sc.close();
	}

}
