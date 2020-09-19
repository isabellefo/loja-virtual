package br.com.fatec;

public class CalculadorPreco {
	public Produto produto;
	public Desconto desconto;
	
	public CalculadorPreco(Desconto desconto, Produto produto){
		this.desconto = desconto;
		this.produto = produto;
	}
	
	public double desconto() {
		return desconto.getValorDesconto();
	}
	
	public double calcularDescontos() {
		System.out.println(desconto.getValorDesconto());
		return (produto.getValorProduto() - desconto.getValorDesconto());
	}
}
