package com.mockito.dao;

import java.util.ArrayList;

import com.mockito.model.Pessoa;

public class PessoaDao {
	private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
	
	public PessoaDao(){
		Pessoa auxPessoa1 = new Pessoa();
		auxPessoa1.setIdPessoa(1);
		auxPessoa1.setNome("Teste1");
		auxPessoa1.setIdade(1);
		
		Pessoa auxPessoa2 = new Pessoa();
		auxPessoa2.setIdPessoa(2);
		auxPessoa2.setNome("Teste2");
		auxPessoa2.setIdade(2);
		
		Pessoa auxPessoa3 = new Pessoa();
		auxPessoa3.setIdPessoa(3);
		auxPessoa3.setNome("Teste3");
		auxPessoa3.setIdade(3);
		
		listaPessoas.add(auxPessoa1);
		listaPessoas.add(auxPessoa2);
		listaPessoas.add(auxPessoa3);
	}
	
	public ArrayList<Pessoa> listarPessoas(){
		return listaPessoas;
	}
	
	public ArrayList<Pessoa> listarPessoasPorNome(String nome){
		ArrayList<Pessoa> listaPessoasPorNome = new ArrayList<>();
		for(Pessoa pessoa: listaPessoas){
			if(pessoa.getNome().equalsIgnoreCase(nome)){
				listaPessoasPorNome.add(pessoa);
			}
		}
		return listaPessoasPorNome;
	}
}