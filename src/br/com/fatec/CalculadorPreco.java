package br.com.fatec;

public class CalculadorPreco {
	private Produto produto;
	
	public CalculadorPreco(Produto produto) {
		this.produto = produto;
	}
	
	public double calcularDescontos() {
		double valor_produto = produto.getValorProduto();
		return valor_produto - (valor_produto * produto.desconto.getPorcentagem() / 100);
	}
}
