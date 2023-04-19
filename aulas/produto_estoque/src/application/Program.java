package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Inserir dados do Produto");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();

		Product produto = new Product(nome, preco, quantidade);

		
		System.out.println();
		System.out.println("Produto em estoque: " + produto);
		System.out.println();

		System.out.print("Insira a quantidade do produtos para ser adicionado no estoque: ");
		quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println();
		System.out.println("Estoque alterado: " + produto);
		System.out.println();

		System.out.print("Insira a quantidade do produtos para ser removido no estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println();
		System.out.println("Estoque alterado: " + produto);

		sc.close();
	}

}
