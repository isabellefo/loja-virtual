package br.com.fatec;

public class Application {

	public static void main(String[] args) {
		var teste = new Produto("Notebook", 1800, new Desconto(10));
		
		System.out.println(
			"Nome do produto: " + teste.getNome() + "\n" +
			"Valor original: R$ " + teste.getValorProduto() + "\n" +
			"Valor com desconto: R$ " + teste.calculador.calcularDescontos()
		);
	}

}
