import java.util.Locale;
import java.util.Scanner;

public class a10_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de valores a serem somados: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		System.out.println("Informe os " + n + " valores abaixo:");
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double soma = 0.0;

		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}

		System.out.printf("Soma dos valores corresponde a %.2f%n", soma);

		double media = soma / n;
		System.out.printf("Media dos valores corresponde a %.2f%n", media);

		sc.close();
	}

}
