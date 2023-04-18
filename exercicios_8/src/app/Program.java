package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de Aniversario (DD/MM/AAAA): ");
		Date aniversarioData = sdf.parse(sc.next());

		Client cliente = new Client(nome, email, aniversarioData);

		System.out.println("Digite os dados do pedido: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, cliente);

		System.out.print("Quantos itens para este pedido? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do #" + i + " item: ");
			System.out.print("Nome do Produto: ");
			sc.nextLine();
			String nomeProd = sc.nextLine();
			System.out.print("Valor do Produto: ");
			double valProd = sc.nextDouble();

			Product produto = new Product(nomeProd, valProd);

			System.out.print("Quantidade: ");
			int qnt = sc.nextInt();

			OrderItem itens = new OrderItem(produto, qnt, valProd);
			order.addItem(itens);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		sc.close();
	}

}
