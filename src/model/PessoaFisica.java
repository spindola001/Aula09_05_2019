package model;

public class PessoaFisica extends Pessoa {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// chamando m�todo abstrato.
	
	public void falar () {
		System.out.println("Falando - Pessoa F�sica");
	}
	
	
}
