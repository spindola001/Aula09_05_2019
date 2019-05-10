package model;

public class PessoaJuridica extends Pessoa {
	private String razaoSocial;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	//Chamando o método abstrato.
	
	public void falar () {
		System.out.println("Falando - Pessoa Juridica");
	}
	
	
}
