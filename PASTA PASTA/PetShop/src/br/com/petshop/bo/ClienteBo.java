package br.com.petshop.bo;

import java.util.UUID;

import br.com.petshop.beans.Cliente;

public class ClienteBo {
	
	//criacao de metodos
	
	public void cadastraCliente(String nome, String cpf, String endereco) {
		//INSTANCIACAO
		Cliente c = new Cliente();
		//CRIA ID RANDOMICO NÃO REPETITIVO
		c.setIdCliente(UUID.randomUUID().toString());
		c.setNome(nome);
		c.setCpf(cpf);
		c.setEndereco(endereco);
	}
}
