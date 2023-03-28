package entities;

public class Product {

	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
}
