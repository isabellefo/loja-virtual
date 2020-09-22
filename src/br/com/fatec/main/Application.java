package br.com.fatec.main;

import br.com.fatec.app.*;

public class Application {

	public static void main(String[] args) {
		Produto p1 = new Produto("Computador", 1000.0);
		
		Desconto valor = new DescontoValor();
		Desconto porcentagem = new DescontoPorcentagem();
		Desconto nenhum = new SemDesconto();
		
		//Desconto por valor
		valor.setDesconto(200);
	
		
		//Desconto por porcentagem
		porcentagem.setDesconto(10);
		
		
		CalculadorPreco calculador1 = new CalculadorPreco(valor,p1);
		CalculadorPreco calculador2 = new CalculadorPreco(porcentagem,p1);	
		CalculadorPreco calculador3 = new CalculadorPreco(nenhum,p1);	
		
		System.out.println(
				"Nome do produto: " + p1.getNome() + "\n" +
				"Valor original: R$ " + p1.getValorProduto() + "\n" +
				"Valor com desconto: R$ " + calculador1.calcularPreco() + "\n"
		);
		
		System.out.println(
				"Nome do produto: " + p1.getNome() + "\n" +
				"Valor original: R$ " + p1.getValorProduto() + "\n" +
				"Valor com desconto: R$ " + calculador2.calcularPreco() + "\n"
		);
		
		System.out.println(
				"Nome do produto: " + p1.getNome() + "\n" +
				"Valor original: R$ " + p1.getValorProduto() + "\n" +
				"Valor com desconto: R$ " + calculador3.calcularPreco() + "\n"
		);
		
		
	}

}
