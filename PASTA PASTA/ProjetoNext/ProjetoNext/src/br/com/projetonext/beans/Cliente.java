package br.com.projetonext.beans;

import java.util.Scanner;

public class Cliente {
	
	String nome;
	String cpf;
	TipoCliente tipo;
	
	//constru��o de m�todo:
	public void cadastrarCliente() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira seu  nome: ");
		this.nome = s.nextLine();
		System.out.println("Insira seu cpf: ");
		this.cpf = s.next();
		
		while (cpf.length()!=11 || !cpf.matches("[0-9]*")) {
			System.out.println("N�mero inv�lido! Tente novamente: ");
			cpf = s.next();
		}
		System.out.println("Cadastrado com sucesso!");
		
	}

}
