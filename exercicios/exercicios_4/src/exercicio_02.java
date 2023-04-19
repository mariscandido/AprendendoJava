import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de numeros a serem digitados");
		int x = sc.nextInt();
		int in = 0, out = 0;

		System.out.println("Digite os " + x + " numeros");
		for (int i = 0; i < x; i++) {
			int y = sc.nextInt();
			if (y >= 10 && y <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}

		System.out.println("Dentro do intervalo de 10 a 20: " + in);
		System.out.println("Fora do intervalo de 10 a 20: " + out);

		sc.close();
	}

}
