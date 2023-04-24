package etities;

public class ProdutoImportado extends Produto {
	private Double customsFee;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double customsFee) {
		super(nome, preco);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double precoTotal() {
		return getPreco() + customsFee;
	}

	@Override
	public String etiquetaPreco() {
		return getNome() + " $ " + precoTotal() + "(Taxa alfandegária: " + customsFee + ")";
	}

}
