package br.com.fatec.app;

public class DescontoPorcentagem extends Desconto{
	
	@Override
	public double getValorDesconto(double valorProduto) {
		return (valorProduto*valorDesconto)/100;
	}
}
