package br.com.fatec.app;

import br.com.fatec.app.Produto;

public class CalculadorPreco {
	private Produto produto;
	
	public CalculadorPreco(Produto produto) {
		this.produto = produto;
	}
	
	public double calcularDescontos() {
		double valorProduto = produto.getValorProduto();
		return valorProduto - produto.desconto.getValorDesconto(valorProduto);
//		return valorProduto - (valorProduto * produto.desconto.getPorcentagem() / 100);
	}
}
