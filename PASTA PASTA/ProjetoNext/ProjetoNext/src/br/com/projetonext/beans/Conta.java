package br.com.projetonext.beans;

import java.util.Scanner;

public class Conta {
	Cliente cliente;
	String numeroConta;
	static Integer contasCriadas = 0;
	double saldo;
	String senha;

	Scanner s = new Scanner(System.in);

	// paramento cliente aponta quem é o cliente dono da conta;
	public void cadastrarConta(Cliente cliente) {
		this.cliente = cliente;
		this.numeroConta = novaConta();
		System.out.println("Cadastre uma senha (apenas 4 digitos): ");
		String senhaCadastrada = s.next();
		while (senhaCadastrada.length() != 4 || !senhaCadastrada.matches("[0-9]*")) {
			System.out.println("Senha inválida! Tente novamente: ");
			senhaCadastrada = s.next();
		}
		this.senha = senhaCadastrada;
		this.saldo = 0.0;
		System.out.println("Cadastrado com sucesso! :)");
	}

	public String novaConta() {
		// transformando o int contaCriadas em String, pois o numero da conta é um
		// String:
		return String.valueOf(contasCriadas++);
	}

	public boolean logar() {
		System.out.println("Insira numero do CPF: ");
		String cpf = s.next();
		System.out.println("Insira senha: ");
		String senha = s.next();
		if(!cpf.equals(cliente.cpf) || !senha.equals(this.senha)) {
			System.out.println("CPF ou senha inváidos. Tente novamente ");
			senha = s.next();
			return false;
		}else {
			System.out.println("Logado!");
			return true;
		}
	}

	public void saque() {
		System.out.println("Digite o valor do saque: R$");
		double valor = s.nextDouble();
		while (this.saldo < valor) {
			System.out.println("Saldo insuficiente! Tente novamente: R$");
			valor = s.nextDouble();
		}
		this.saldo = -valor;
		System.out.println("Saque realizado com sucesso!");
		System.out.println("Seu saldo atual é: R$" + this.saldo);
	}

	public void deposito() {
		System.out.println("Digite o valor do depósito: R$");
		double valor = s.nextDouble();
		this.saldo = +valor;
		System.out.println("Depósito realizado com sucesso!");
		System.out.println("Seu saldo atual é: R$" + this.saldo);
	}

	public void consultarSaldo() {
		System.out.println("Nome: " + cliente.nome);
		System.out.println("CPF: " + cliente.cpf);
		System.out.println("Numero da conta: " + numeroConta);
		System.out.println("Saldo: R$" + saldo);
		if (this.saldo <= 5000) {
			this.cliente.tipo = TipoCliente.COMUM;
		} else if (this.saldo > 5000 && this.saldo <= 14999) {
			this.cliente.tipo = TipoCliente.SUPER;
		} else {
			this.cliente.tipo = TipoCliente.PREMIUM;
		}
		System.out.println("Atualmente seu tipo de conta é: " + cliente.tipo);
	}

	/*
	 * public void transferencia(double valor, Conta contaDestino) {
	 * 
	 * contaDestino.deposito(valor);
	 * System.out.println("Digite o valor da transferencia: "); valor =
	 * s.nextDouble(); while (this.saldo < valor) {
	 * System.out.println("Saldo insuficiente! Tente novamente: "); valor =
	 * s.nextDouble(); }
	 */
}
