package model;

public abstract class Pessoa {
	/* 
	 Criação de variáveis com visibilidade privada.
	 */
	private String endereco;
	private long telefone;
	private String cidade;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	//Método abstrato que vai obrigar seu uso em classes especializadas.
	//Chama-se polimorfismo.
	public abstract void falar ();
	
	
	
}
