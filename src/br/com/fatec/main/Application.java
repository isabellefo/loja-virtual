package br.com.fatec.main;

import br.com.fatec.app.*;

public class Application {

	public static void main(String[] args) {
		Produto p1 = new Produto("Computador", 1000.0);
		
		Desconto valor = FabricaDesconto.criarDescontoValor(200);
		Desconto porcentagem = FabricaDesconto.criarDescontoPorcentagem(10);
		Desconto nenhum = FabricaDesconto.criarSemDesconto();
		
		CalculadorPreco calculador1 = new CalculadorPreco(valor,p1);
		CalculadorPreco calculador2 = new CalculadorPreco(porcentagem,p1);	
		CalculadorPreco calculador3 = new CalculadorPreco(nenhum,p1);	
		
		printResultado(calculador1);
		printResultado(calculador2);
		printResultado(calculador3);
	
	}
	
	static void printResultado(CalculadorPreco calc) {
		System.out.println(
				"Nome do produto: " + calc.produto.getNome() + "\n" +
				"Valor original: R$ " + calc.produto.getValorProduto() + "\n" +
				"Valor com desconto: R$ " + calc.calcularPreco() + "\n"
		);	
	}

}
