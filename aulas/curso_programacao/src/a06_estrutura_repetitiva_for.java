import java.util.Scanner;

public class a06_estrutura_repetitiva_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de numeros a serem somados");
		int N = sc.nextInt();

		int soma = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;
		}

		System.out.println(soma);

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}

		sc.close();
	}

}
