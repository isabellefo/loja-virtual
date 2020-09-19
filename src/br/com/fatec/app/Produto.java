package br.com.fatec;

public class Produto {
	private String nome;
	private double valor;

	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		// se não foi especificado nenhum desconto, cria um desconto de 0%
		/*if(desconto == null)
			desconto = new Desconto(0);*/
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValorProduto() {
		return valor;
	}

}
