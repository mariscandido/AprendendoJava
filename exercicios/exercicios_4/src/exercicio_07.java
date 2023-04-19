import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int q = (int) Math.pow(i, 2);
			int c = (int) Math.pow(i, 3);
			System.out.println(i + " " + q + " " + c);

		}

		sc.close();
	}

}
