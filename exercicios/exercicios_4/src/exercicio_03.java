import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de casos de teste desejado");
		int n = sc.nextInt();

		for (int i = 0; n > i; i++) {
			double x1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double mp;

			mp = ((x1 * 2) + (x2 * 3) + (x3 * 5)) / (2 + 3 + 5);

			System.out.printf("A media ponderada dos valores %.1f , %.1f e %.1f é: %.1f%n", x1, x2, x3, mp);
		}

		sc.close();
	}

}
