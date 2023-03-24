import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o codigo do combustivel abastecido");

		int x = sc.nextInt();
		int a = 0, g = 0, d = 0;

		while (x != 4) {
			if (x == 1) {
				a += 1;
			} else if (x == 2) {
				g += 1;
			} else if (x == 3) {
				d += 1;
			} else {
				System.out.println("Codigo Invalido");
			}

			x = sc.nextInt();
		}

		System.out.println("Muito obrigada");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Disel: " + d);

		sc.close();
	}

}
