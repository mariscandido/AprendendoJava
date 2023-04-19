import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("Digite um numero");
		x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("Numero digitado é PAR");
		} else {
			System.out.println("Numero digitado é IMPAR");
		}

		sc.close();
	}

}
