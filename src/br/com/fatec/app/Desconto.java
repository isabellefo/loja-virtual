package br.com.fatec;

public abstract class Desconto {

	protected double valorDesconto;
	protected Produto produto;

	public Desconto(double valorDesconto/*, Produto produto*/) {
		this.valorDesconto = valorDesconto;
		//this.produto = produto;
	}
	
	public abstract double getValorDesconto();

}
