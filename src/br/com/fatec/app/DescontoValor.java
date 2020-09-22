package br.com.fatec;

public class DescontoValor extends Desconto{

	@Override
	public double getValorDesconto(double valorProduto) {
		return valorDesconto;
	}
}
