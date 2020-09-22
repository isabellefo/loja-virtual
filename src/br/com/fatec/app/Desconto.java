package br.com.fatec.app;

public abstract class Desconto {

	protected double valorDesconto;
		
	public void setDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	public abstract double getValorDesconto(double valorProduto);

}
