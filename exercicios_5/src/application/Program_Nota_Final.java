package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NotaFinal;

public class Program_Nota_Final {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		NotaFinal notaFinal = new NotaFinal();
		
		System.out.print("Digite o nome do aluno: ");
		notaFinal.nome = sc.nextLine();
		
		System.out.println("Digite as tres notas do aluno(a) " + notaFinal.nome + " : " );
		notaFinal.nota1 = sc.nextDouble();
		notaFinal.nota2 = sc.nextDouble();		
		notaFinal.nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f%n", notaFinal.SomaNotas());
		System.out.println(notaFinal.toString());
		sc.close();
	}

}
