package br.com.NextV3.teste;

import br.com.NextV3.beans.Cliente;
import br.com.NextV3.beans.Conta;
import br.com.NextV3.beans.ContaCorrente;
import br.com.NextV3.beans.ContaPoupanca;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BancoDeDados {
    static int autoIncremento = -1;

    private static ArrayList<Cliente>ListaDeClientes                = new ArrayList<>();
    private static ArrayList<Conta>  ListaDeContaPoupanca           = new ArrayList<>();
    private static ArrayList<Conta>  ListaDeContaCorrente           = new ArrayList<>();



    //private Map<Integer,Conta> bancoDeDados = new HashMap<~>;


    public int autoIncrementoConta(){
        autoIncremento++;
        int conta = autoIncremento;

        return (autoIncremento);

    }

    public static void novoCliente(int idCliente,Conta contaCorrente,Conta contaPoupanca,Cliente cliente){

        BancoDeDados.ListaDeClientes.add         (idCliente, cliente);
        BancoDeDados.ListaDeContaCorrente.add    (idCliente, contaCorrente);
        BancoDeDados.ListaDeContaPoupanca.add    (idCliente, contaPoupanca);

    }
    public Cliente buscaClienteComId(int idCliente){
        Cliente cliente = new Cliente();
        cliente = (ListaDeClientes.get(idCliente));

        return cliente;

    }
    public Conta buscaContaCorrenteComId(int idConta){
        Conta conta = new Conta();
        conta = (ListaDeContaCorrente.get(idConta));

        return conta;

    }
    public Conta buscaContaPoupancaComId(int idConta){
        Conta conta = new Conta();
        conta = (ListaDeContaPoupanca.get(idConta));

        return conta;

    }



}
