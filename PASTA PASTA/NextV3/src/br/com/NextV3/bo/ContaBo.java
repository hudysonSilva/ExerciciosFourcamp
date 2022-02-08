package br.com.NextV3.bo;


import br.com.NextV3.beans.*;
import br.com.NextV3.teste.BancoDeDados;

import java.sql.Struct;
import java.util.List;
import java.util.UUID;

public class ContaBo {

    double taxa = 5.60;

    public Conta   cadastraConta(Conta conta, Cliente cliente,ModalidadeConta modalidadeConta) {

        conta.setIdConta(cliente.getIdCliente());
        conta.setCliente(cliente);         //Cliente que usa a conta
        conta.setSaldo(0);                 //Saldo default da conta é 0
        conta.setModalidadeConta(modalidadeConta);
        return  conta;
    }
    public boolean transferencia(Conta contaTransfere, Conta contaRecebe,double valor){
        if(contaTransfere.getSaldo() < valor){
            return false;
        }
        else{

            if (contaTransfere.getModalidadeConta().getId() == contaRecebe.getModalidadeConta().getId()) {
                contaTransfere.setSaldo(contaTransfere.getSaldo() - valor);
                contaRecebe.setSaldo(contaRecebe.getSaldo() + valor);
                return true;
            } else if (contaTransfere.getModalidadeConta().getId() != contaRecebe.getModalidadeConta().getId())
                if(contaTransfere.getSaldo() < valor+taxa) {
                    return false;
                }else {
                    contaTransfere.setSaldo(contaTransfere.getSaldo() - valor + taxa);
                    contaRecebe.setSaldo(contaRecebe.getSaldo() + valor);
                    return true;
                }
        }
        return false;
    }
    public boolean deposito(Conta conta, double valor){
        conta.setSaldo(conta.getSaldo()+valor);
        alteraTipoCliente(conta);                            //CONTA TEM CLIENTE
        return true;
    }
    public boolean saque(Conta conta, double valor){
        conta.setSaldo(conta.getSaldo()-valor);
        alteraTipoCliente(conta);                            //CONTA TEM CLIENTE
        return true;
    }
    public void    alteraTipoCliente(Conta conta){
        if          (conta.getSaldo() < 5000){
            conta.getCliente().setTipoCliente(TipoCliente.COMUM);
        } else if   (conta.getSaldo() >= 5000 || conta.getSaldo() <=14.999){
            conta.getCliente().setTipoCliente(TipoCliente.PREMIUM);
        } else if   (conta.getSaldo() > 14.999){
            conta.getCliente().setTipoCliente(TipoCliente.SUPER);
        }

    }


    public void    consultaSaldo(Conta contaCorrente,Conta contaPoupanca){

        if      (contaPoupanca == null && contaCorrente != null){
            System.out.println(contaCorrente.getSaldo());
        }else if( contaCorrente == null && contaPoupanca != null){
            System.out.println(contaPoupanca.getSaldo());
        }else {
            System.out.println("Saldo conta"+contaCorrente.getModalidadeConta()+" R$"+contaCorrente.getSaldo());
            System.out.println("Saldo conta"+contaPoupanca.getModalidadeConta()+" R$"+contaPoupanca.getSaldo());
        }

    }
    public Boolean depositoContaCorrente(Conta conta,double valor){

        conta.setSaldo(conta.getSaldo()+valor);

        return true;
    }
    public Boolean depositoContaPoupanca(Conta conta,double valor){

        conta.setSaldo(conta.getSaldo()+valor);

        return true;
    }
//----------------------------------------------------------------------------------------------------------------------

    public Cartao solicitaCartaoDeDebito(CartaoDeDebito cartaoDeDebito, String bandeira, int senha,Conta conta) {

        cartaoDeDebito.setAtivo(true);
        cartaoDeDebito.setBandeira(bandeira);
        cartaoDeDebito.setSenha(senha);
        cartaoDeDebito.setId(conta.getIdConta());
        cartaoDeDebito.setNumero(UUID.randomUUID().toString()/*autoincremento*/);
        cartaoDeDebito.setLimiteDeTranzaçoes(1000);//MUDAR PARA SER POR TIPO DE CLIENTE
        cartaoDeDebito.setConta(conta);

        int id = conta.getIdConta();


        BancoDeDados.adicionaCartaoDeDebito(cartaoDeDebito, id);

        return cartaoDeDebito;
    }
    public Cartao solicitaCartaoDeCredito(CartaoDeCredito cartaoDeCredito, String bandeira, double renda, int senha,Conta conta) {

        cartaoDeCredito.setAtivo(true);
        cartaoDeCredito.setBandeira(bandeira);
        cartaoDeCredito.setSenha(senha);
        cartaoDeCredito.setId(conta.getIdConta());
        cartaoDeCredito.setNumero(UUID.randomUUID().toString()/*autoincremento*/);
        cartaoDeCredito.setLimite(renda*1.10);//MUDAR PARA SER POR TIPO DE CLIENTE
        cartaoDeCredito.setConta(conta);

        int id = conta.getIdConta();

        BancoDeDados.adicionaCartaoDeCredito(cartaoDeCredito,id);

        return cartaoDeCredito;
    }
//----------------------------------------------------------------------------------------------------------------------
//------------------------------------DESATIVAR CARTAO------------------------------------------------------------------

    public Cartao desativaCartao(Cartao cartao){
        cartao.setAtivo(false);
        return cartao;
    }
//----------------------------------------------------------------------------------------------------------------------
//-----------------------------------USOS DOS CARTOES-------------------------------------------------------------------
    public boolean comprasCartao(Cartao cartao, Conta conta, double valor){
        if (cartao.isAtivo() == false){
            return false;
        }

        if (((CartaoDeDebito)cartao).getLimiteDeTranzaçoes() < valor) {
            return false;
        }else {
            saque(conta,valor);
        }
        if (((CartaoDeCredito)cartao).getLimite() < valor) {
            return false;
        }else {
            saque(conta,valor);
        }


        return true;
    }
//----------------------------------------------------------------------------------------------------------------------
    public boolean TestecompraCredito(CartaoDeCredito cartaoDeCredito,double valor){
        cartaoDeCredito.getConta().setSaldo(cartaoDeCredito.getConta().getSaldo()-valor);
        return true;
    }
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

}
