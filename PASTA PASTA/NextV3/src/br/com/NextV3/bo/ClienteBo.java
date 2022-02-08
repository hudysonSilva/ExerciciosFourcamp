package br.com.NextV3.bo;

import br.com.NextV3.bo.*;
import br.com.NextV3.beans.*;

import java.util.Scanner;

public class ClienteBo {


    public Cliente cadastraCliente(int idCliente,String nome, String cpf, String dataDeNascimento,Endereco endereco, int senha) {

        Cliente cliente = new Cliente();

        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEndereco(endereco);
        cliente.setIdCliente(idCliente);
        cliente.setDataDeNascimento(dataDeNascimento);
        cliente.setTipoCliente(TipoCliente.COMUM);
        cliente.setSenha(senha);

        return cliente;

    }

    public void checaDestinatario(Cliente cliente) {


        System.out.println("O dono da conta destino é " + cliente.getNome() + "?");
        System.out.println("Digite sua opção ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

    }


}
