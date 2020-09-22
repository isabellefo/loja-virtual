package br.com.fatec.app;

public class SemDesconto extends Desconto{
	
	double valorDesconto = 0.0;
	
	@Override
	public double getValorDesconto(double valorProduto) {
		return valorDesconto;
	}

}
