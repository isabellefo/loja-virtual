package br.com.fatec;

public class Produto {
	private String nome;
	private double valor;
	public  Desconto desconto;
	public  CalculadorPreco calculador;
	
	public Produto(String nome, double valor, Desconto desconto) {
		this.nome = nome;
		this.valor = valor;
		
		// se não foi especificado nenhum desconto, cria um desconto de 0%
		if(desconto == null)
			desconto = new Desconto(0);
		this.desconto = desconto;

		this.calculador = new CalculadorPreco(this);
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValorProduto() {
		return valor;
	}

}
