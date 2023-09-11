package application;

import java.util.HashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		// verifica se contem na lista o produto
		System.out.println(set.contains("Notebook"));

		System.out.println();
		for (String p : set) {
			System.out.println(p);
		}

		// para remover um produto da lista
		set.remove("TV");

		System.out.println();
		System.out.println();
		for (String p : set) {
			System.out.println(p);
		}

		set.add("CD");
		// para remover um produto com tamanho maior que 3
		set.removeIf(x -> x.length() >= 3);

		System.out.println();
		System.out.println();
		for (String p : set) {
			System.out.println(p);
		}

		set.add("PC");
		set.add("Panela");
		// para remover um produto que comece com a letra C
		set.removeIf(x -> x.charAt(0) == 'C');

		System.out.println();
		System.out.println();
		for (String p : set) {
			System.out.println(p);
		}
	}
}