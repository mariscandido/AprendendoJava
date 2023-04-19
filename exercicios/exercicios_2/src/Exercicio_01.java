import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;

		System.out.println("Digite um numero: ");
		x = sc.nextInt();

		if (x >= 0) {
			System.out.println("O numero digitado não é negativo");
		} else {
			System.out.println("O numero digitado é negativo");
		}

		sc.close();
	}

}
