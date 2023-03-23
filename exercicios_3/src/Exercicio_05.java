import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o codigo do produto desejado");
		int item = sc.nextInt();
		System.out.println("Digite a quantidade do produto desejado");
		int qnt = sc.nextInt();

		double valort;

		if (item == 1) {
			valort = qnt * 4.00;
			System.out.println(qnt + " Cachorro Quente");
			System.out.printf("Valor total a ser pago R$ %.2f", valort);
		} else if (item == 2) {
			valort = qnt * 4.50;
			System.out.println(qnt + " X-Salada");
			System.out.printf("Valor total a ser pago R$ %.2f", valort);
		} else if (item == 3) {
			valort = qnt * 5.00;
			System.out.println(qnt + " X-Bacon");
			System.out.printf("Valor total a ser pago R$ %.2f", valort);
		} else if (item == 4) {
			valort = qnt * 2.00;
			System.out.println(qnt + " Torrada(s) simples");
			System.out.printf("Valor total a ser pago R$ %.2f", valort);
		} else if (item == 5) {
			valort = qnt * 1.50;
			System.out.println(qnt + " Refrigerante(s)");
			System.out.printf("Valor total a ser pago R$ %.2f", valort);
		}

		sc.close();
	}

}
