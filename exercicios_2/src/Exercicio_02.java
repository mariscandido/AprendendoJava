import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double pi;
		double area;
		
		raio = sc.nextDouble();
		pi = 3.14159;
		
		area = pi * (Math.pow(raio, 2));
		System.out.printf("A= %.4f", area);

		sc.close();
	}

}
