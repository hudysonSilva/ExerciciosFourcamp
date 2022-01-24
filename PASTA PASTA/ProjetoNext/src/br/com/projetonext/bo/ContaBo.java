package br.com.projetonext.bo;
import br.com.projetonext.beans.*;

public class ContaBo {


    public Conta cadastraConta (TipoConta tipoConta, Cliente cliente, int idConta, int senha){
        Conta conta = new Conta();

        conta.setAgencia("0001");
        conta.setConta(idConta);
        conta.setTipoConta(tipoConta);
        conta.setCliente(cliente);         //Cliente que usa a conta
        conta.setIdConta(idConta);         //ID da conta
        conta.setSaldo(0);                 //Saldo default da conta é 0
        conta.setSenha(senha);

        return conta;

    }

    public void saldo(Conta conta){

        System.out.print("Seu saldo é de R$"+conta.getSaldo());
    }

    public void deposito(Conta conta, double valor){

        conta.setSaldo((conta.getSaldo()+valor));

    }
    public void saque(Conta conta,double valor){
        boolean check = checaSaldo(conta, valor);
        if (check == false){

        }
        else {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque Efetuado com sucesso");
            System.out.println("Seu saldo atual é R$" + conta.getSaldo());
        }
    }

    public void transferencia (double valor,Conta contaEnvia, Conta contaRecebe){
        double envia;
        double recebe;
        double taxa = 5.60;

        saque(contaEnvia,valor);
        deposito(contaRecebe,valor);

    }

    public boolean checaExistenciaConta(Conta conta, int idConta){
        try { conta.getTipoConta(); }

        catch (Exception e) {
            if     (idConta == 0) {
                System.out.printf("O usuario não possui conta corrente ");
                return false;
            }
            else if(idConta == 1) {
                System.out.printf("O usuario não possui conta Poupança ");
                return false;
            }
        }
        return true;
    }

    public boolean checaSaldo(Conta conta, double valor){
        if(conta.getSaldo()< valor){
            System.out.println("Saldo insuficiente");
            System.out.println("Seu saldo é de R$"+conta.getSaldo());
            return  false;
        }
        return true;

    }

}
