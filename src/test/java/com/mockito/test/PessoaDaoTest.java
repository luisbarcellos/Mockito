package com.mockito.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;

import com.mockito.dao.PessoaDao;
import com.mockito.model.Pessoa;

public class PessoaDaoTest {
	
	@Test
	public void testaTotalPessoaMockito(){
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		
		Pessoa auxPessoa = new Pessoa();
		auxPessoa.setIdPessoa(1);
		auxPessoa.setNome("Teste1");
		auxPessoa.setIdade(1);
		listaPessoas.add(auxPessoa);
				
		PessoaDao mockito = mock(PessoaDao.class);
		
		when(mockito.listarPessoasPorNome("Teste1")).thenReturn(listaPessoas);
		
		int qty = mockito.listarPessoasPorNome("Teste1").size();
		
		assertThat(qty, is(1));
	}	
}