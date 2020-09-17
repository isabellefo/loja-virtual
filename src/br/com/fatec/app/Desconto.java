package br.com.fatec.app;

public class Desconto {
	private double porcentagem;
	
	public Desconto(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	public double getPorcentagem() {
		return porcentagem;
	}

	public double getValorDesconto(double valorProduto) {
		return porcentagem / 100 * valorProduto;
	}
}
