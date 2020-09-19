package br.com.fatec;

public class Application {

	public static void main(String[] args) {
		Produto p1 = new Produto("Computador", 1000.0);
		Desconto d1 = new DescontoValor(10.0,p1);
		CalculadorPreco calculador = new CalculadorPreco(d1,p1);		
		
		System.out.println(calculador.calcularDescontos());
		
		
	}

}
