package view;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("nome");
		System.out.println(pf.getNome());
		pf.falar();
		pj.setRazaoSocial("Empresa");
		System.out.println(pj.getRazaoSocial());
		pj.falar();
	}

}
