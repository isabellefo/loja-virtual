package br.com.fatec;

public class SemDesconto extends Desconto{
	
	double valorDesconto = 0.0;
	
	@Override
	public double getValorDesconto(double valorProduto) {
		return valorDesconto;
	}

}
