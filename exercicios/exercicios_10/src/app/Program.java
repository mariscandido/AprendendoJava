package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import etities.Produto;
import etities.ProdutoImportado;
import etities.ProdutoUsado;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do produto nº " + i);
			System.out.print("Comum, usado ou importado (c/u/i)?");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Taxa de entrega: ");
				double taxa = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, taxa));
			} else if (ch == 'u') {
				System.out.print("Data de fabricação (DD/MM/AAAA): ");
				LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new ProdutoUsado(nome, preco, data));
			} else if (ch == 'c') {
				list.add(new Produto(nome, preco));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Produto prod : list) {
			System.out.println(prod.etiquetaPreco());
		}
		
		sc.close();
	}

}
