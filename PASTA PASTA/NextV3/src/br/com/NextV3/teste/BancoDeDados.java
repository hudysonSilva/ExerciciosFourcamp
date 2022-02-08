package br.com.NextV3.teste;

import br.com.NextV3.beans.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancoDeDados {
    static int autoIncremento = -1;
//---------------------------------INFRAESTRUTURA DA CONTA DENTRO DO SERVIDOR---------------------------
    private static ArrayList<Cliente>ListaDeClientes                    = new ArrayList<>();
    private static ArrayList<Conta>  ListaDeContaPoupanca               = new ArrayList<>();
    private static ArrayList<Conta>  ListaDeContaCorrente               = new ArrayList<>();
//------------------------------------------------------------------------------------------------------
//---------------------------------INFRAESTRUTURA DE CARTOES DENTRO DA CONTRA---------------------------

    private static Map<Integer,CartaoDeDebito> ListaDeCartaoDeDebito    = new HashMap<>();
    private static Map<Integer,CartaoDeCredito> ListaDeCartaoDeCredito  = new HashMap<>();
    private static Map<Integer,List> FaturaDoCartao                     = new HashMap<>();
//------------------------------------------------------------------------------------------------------
//---------------------------------INFRAESTRUTURA DE HISTORICO DENTRO DAS CONTAS------------------------

    private static Map<String,Double> Fatura                            = new HashMap<>();
//------------------------------------------------------------------------------------------------------




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
        //cartaocredito(id, cartaocredito)

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
    public static void adicionaCartaoDeDebito(CartaoDeDebito cartaoD, int idCliente){
        BancoDeDados.ListaDeCartaoDeDebito.put    (idCliente, cartaoD);


    }
    public static void adicionaCartaoDeCredito(CartaoDeCredito cartaoC, int idCliente){
        BancoDeDados.ListaDeCartaoDeCredito.put    (idCliente, cartaoC);

    }
    public Cartao buscaCartaoDeCreditoPorConta(Conta conta ){

        return null;
    }

}