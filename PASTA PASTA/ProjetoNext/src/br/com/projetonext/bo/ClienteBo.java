package br.com.projetonext.bo;

import br.com.projetonext.beans.*;

import java.util.Scanner;

public class ClienteBo {


    public Cliente cadastraCliente(String nome, String cpf, Endereco endereco) {
        Cliente cliente = new Cliente();

        if (!nome.matches("[a-zA-Z]*")) {
            System.out.println("O nome possui caracteres invalidos digite novamente");
            return null;
        }
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEndereco(endereco);

        return cliente;

    }

    public void checaDestinatario(Cliente cliente) {

        System.out.println("O dono da conta destino é " + cliente.getNome() + "?");
        System.out.println("Digite sua opção ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

    }


}
