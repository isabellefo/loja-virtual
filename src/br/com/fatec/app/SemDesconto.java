package br.com.fatec;

public class SemDesconto extends Desconto{
	
	//double valorDesconto = 0;
	public SemDesconto(double valorDesconto/*, Produto produto*/) {
		super(valorDesconto/*, produto*/);
	}
	
	@Override
	public double getValorDesconto() {
		return 0.0;
	}

}
