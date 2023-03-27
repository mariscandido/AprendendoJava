import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de vezes que deseja dividir");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite dois numeros");
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("Divisao por 0 é impossivel");
			} else {
				double d = (double) x / y;
				System.out.printf("%.1f%n", d);
			}
		}

		sc.close();
	}

}
