package br.com.fatec.main;

import br.com.fatec.app.Desconto;
import br.com.fatec.app.Produto;

public class Application {

	public static void main(String[] args) {
		var prod = new Produto("Notebook", 1000, new Desconto(100));
		
		System.out.println(
			"Nome do produto: " + prod.getNome() + "\n" +
			"Valor original: R$ " + prod.getValorProduto() + "\n" +
			"Valor com desconto: R$ " + prod.calculador.calcularDescontos()
		);
	}

}
