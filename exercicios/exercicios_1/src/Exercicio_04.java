import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int id, hrt;
		double vl, salario;

		id = sc.nextInt();
		hrt = sc.nextInt();
		vl = sc.nextDouble();

		salario = hrt * vl;

		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f", salario);

		sc.close();
	}

}
