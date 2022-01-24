package br.com.NextV3.bo;


import br.com.NextV3.beans.*;

public class ContaBo {

    double taxa = 5.60;

    public Conta cadastraConta(Conta conta, Cliente cliente,ModalidadeConta modalidadeConta) {

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

    public void alteraTipoCliente(Conta conta){
        if          (conta.getSaldo() < 5000){
            conta.getCliente().setTipoCliente(TipoCliente.COMUM);
        } else if   (conta.getSaldo() >= 5000 || conta.getSaldo() <=14.999){
            conta.getCliente().setTipoCliente(TipoCliente.PREMIUM);
        } else if   (conta.getSaldo() > 14.999){
            conta.getCliente().setTipoCliente(TipoCliente.SUPER);
        }

    }

    public Conta cadastroPixContaCorrente (int tipoChavePix, Conta conta, String conteudoChavePix){
        String conteudoChavePixNovo[] = new String[4];

        conteudoChavePixNovo[tipoChavePix] = conteudoChavePix;

        Pix pix = conta.getPix();
        pix.setIdPix(conta.getIdConta());
        pix.setConteudoChavePix(conteudoChavePixNovo);

        conta.setPix(pix);



        return conta;
    }
    public void consultaSaldo(Conta contaCorrente,Conta contaPoupanca){

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

}
