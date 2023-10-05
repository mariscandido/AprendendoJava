package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Mariana Silveira", "marisilveira@gmail.com");
		Pessoa p2 = new Pessoa(1, "Maria Silvestre", "marisilvestre@gmail.com");
		Pessoa p3 = new Pessoa(1, "Mariane Silva", "marisilva@gmail.com");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
