package br.com.projetonext.beans;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		Scanner s = new Scanner(System.in);

		int opcao = 0;

		do {

			System.out.println("MENU NEXT");
			System.out.println("" + "\n1 - Cadastro Cliente" + "\n2 - Cadastro Conta" + "\n3 - Logar" + "\n4 - Sair");
			opcao = s.nextInt();
			switch (opcao) {
			case 1:
				cliente.cadastrarCliente();
				break;
			case 2:
				conta.cadastrarConta(cliente);
				break;
			case 3:
				
				if (conta.logar()) {
					do {
						System.out.println("\n1 - Saque" + "\n2 - Depósito" + "\n3 - Consultar Saldo" + "\n4 - Sair");
						opcao = s.nextInt();
						switch (opcao) {
						case 1:
							conta.saque();
							break;
						case 2:
							conta.deposito();
							break;
						case 3:
							conta.consultarSaldo();
							break;
						case 4:
							System.out.println("Sistema encerrado");
							s.close();
							break;
						default:
							System.out.println("Opção inválida!");
							break;
						}
					} while (opcao != 4);

				}
				break;
			case 4:
				System.out.println("Sistema encerrado");
				s.close();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (opcao != 6);

	}

}
