import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora inicial do jogo ");
		int hi = sc.nextInt();
		System.out.println("Digite a hora final do jogo ");
		int hf = sc.nextInt();

		int duracao;

		if (hi < hf) {
			duracao = hf - hi;
		} else {
			duracao = 24 - hi + hf;
		}

		System.out.println("O jogo durou: " + duracao + "hora(s)");

		sc.close();
	}

}
