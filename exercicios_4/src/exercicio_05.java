import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 1;

		for (int i = 1; i <= n; i++) {
			x = x * i;
		}

		System.out.println("Fatorial de " + n + " é " + x);

		sc.close();

	}

}
