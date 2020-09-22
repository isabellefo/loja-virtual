package br.com.fatec.app;

public class DescontoValor extends Desconto{
	
	public DescontoValor(double valorDesconto) {
		super(valorDesconto);
	}
	
	@Override
	public double getValorDesconto(double valorProduto) {
		return valorDesconto < valorProduto ? valorDesconto : valorProduto;
	}
}
