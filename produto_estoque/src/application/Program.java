package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product produto = new Product();

		System.out.println("Inserir dados do Produto");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();

		System.out.println();
		System.out.println("Produto em estoque: " + produto);
		System.out.println();

		System.out.print("Insira a quantidade do produtos para ser adicionado no estoque: ");
		int quantity = sc.nextInt();
		produto.addProduto(quantity);
		System.out.println();
		System.out.println("Estoque alterado: " + produto);
		System.out.println();

		System.out.print("Insira a quantidade do produtos para ser removido no estoque: ");
		quantity = sc.nextInt();
		produto.removeProduto(quantity);
		System.out.println();
		System.out.println("Estoque alterado: " + produto);

		sc.close();
	}

}
