package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_TryCatch {

	public static void main(String[] args) {

		method1();

		System.out.println("Fim do programa");

	}

	public static void method1() {
		System.out.println("***Inicio Method1***");

		method2();

		System.out.println("***Fim Method2***");
	}

	public static void method2() {
		System.out.println("***Inicio Method2***");

		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) { // exceção de posição invalida dentro de um vetor
			System.out.println("Posição invalida!");
			e.printStackTrace(); // para verificar o caminho do erro e onde acarretou a exceção

		} catch (InputMismatchException e) { // exceção de um valor invalido para um campo inteiro
			System.out.println("Erro de entrada");

		}

		sc.close();

		System.out.println("***Fim Method2***");
	}

}
