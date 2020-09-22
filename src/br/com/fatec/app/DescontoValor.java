package br.com.fatec.app;

public class DescontoValor extends Desconto{

	@Override
	public double getValorDesconto(double valorProduto) {
		return valorDesconto;
	}
}
