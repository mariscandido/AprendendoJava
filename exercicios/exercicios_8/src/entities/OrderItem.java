package entities;

public class OrderItem {

	private Product produto;
	private Integer quantidade;
	private Double preco;

	public OrderItem() {
	}

	public OrderItem(Product produto, Integer quantidade, Double preco) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public double subTotal() {
		return preco * quantidade;
	}

	@Override
	public String toString() {
		return produto.getNome() + ", R$" + String.format("%.2f", preco) + ", Quantity: " + quantidade + ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
