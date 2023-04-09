package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println();
		list.add(2, "Marco");
		list.add(2, "Antonio");
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println(list.size());

		System.out.println();
		list.remove("Anna");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("Posicao do Bob:" + list.indexOf("Bob"));
		System.out.println("Posicao do Marco:" + list.indexOf("Marco"));
		// * Quando não encontra na lista sempre devolve -1 //*

		System.out.println();
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println();
		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);

	}

}
