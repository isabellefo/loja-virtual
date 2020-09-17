package br.com.fatec.app;

public class Produto {
	private String nome;
	private double valor;
	public Desconto desconto;
	public CalculadorPreco calculador;
	
	public Produto(String nome, double valor, Desconto desconto) {
		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
		this.calculador = new CalculadorPreco(this);
	}

	public Produto (String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		this.desconto = new Desconto(0);
		this.calculador = new CalculadorPreco( this);
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValorProduto() {
		return valor;
	}

}
