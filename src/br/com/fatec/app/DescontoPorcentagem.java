package br.com.fatec;

public class DescontoPorcentagem extends Desconto{
	//public double valorDesconto;
	private Produto produto;
	
	
	public DescontoPorcentagem(double valorDesconto, Produto produto) {
		super(valorDesconto);
		this.produto = produto;
	}
	
	@Override
	public double getValorDesconto() {
		System.out.println(produto.getValorProduto());
		return (produto.getValorProduto()*valorDesconto)/100;
	}
}
