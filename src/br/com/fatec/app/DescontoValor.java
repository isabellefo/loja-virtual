package br.com.fatec;

public class DescontoValor extends Desconto{
	//public double valorDesconto;
	
	public DescontoValor(double valorDesconto, Produto produto) {
		super(valorDesconto/*, produto*/);
	}

	@Override
	public double getValorDesconto() {
		return valorDesconto;
	}
}
