package br.com.fatec;

public class CalculadorPreco {
	public Produto produto;
	public Desconto desconto;
	
	public CalculadorPreco(Desconto desconto, Produto produto){
		this.desconto = desconto;
		this.produto = produto;
	}
	
	public double calcularDescontos() {
		double valorProduto = produto.getValorProduto();
		double valorDesconto = desconto.getValorDesconto(valorProduto);
		return (valorProduto - valorDesconto);
	}
}
