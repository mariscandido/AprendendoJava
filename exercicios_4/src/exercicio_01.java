import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero de 1 a 1000");
		int x = sc.nextInt();

		System.out.println("Numeros impares de 1 a " + x + ":");

		for (int y = 1; y <= x; y += 2) {
			System.out.println(y);
		}

		sc.close();
	}

}
