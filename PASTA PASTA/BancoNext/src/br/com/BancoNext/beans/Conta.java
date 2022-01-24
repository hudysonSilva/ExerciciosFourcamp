package br.com.BancoNext.beans;

import com.sun.source.tree.WhileLoopTree;

public class Conta {
    //MEU SCANER
    Utils util = new Utils();

    Cliente cliente;
    String agencia;
    String conta = "0";
    static  Integer contaCriada=0;
    double saldo;
    String loguin;              //
    String senha;                  //4 digitos
    //TipoCliente tipoCliente;    // não interessa nesse momento


    public void cadastrarConta(Cliente cliente ){
        this.cliente = cliente;
        this.conta = novaConta();
        this.saldo = 0.0;
        String senhaCadastrada ;
        do {
             senhaCadastrada = util.lerSring("uma senha de 4 digitos numericos:");
        } while (senhaCadastrada.length() !=4 || !senhaCadastrada.matches("[0-9]*"));
        this.senha = senhaCadastrada;
        System.out.println("Conta Criada !");

    }

    public Boolean loguin(){
        System.out.println("Loguin");
        String cpf = util.lerSring("CPF");
        // vetor = util.lerVetor()
        String senha = util.lerSring("Senha");

        if ( cpf.equals(this.cliente.cpf) && senha.equals(this.senha)) {
            return true;
        }else {
            return false;
        }
    }

    public void deposito(){
        this.saldo = this.saldo + util.lerDouble("o valor do deposito");
        System.out.println("Seu saldo atual:"+this.saldo);

    }
    public void saque() {
        double saque;

        do {
            saque = util.lerDouble("o Valor do saque:");
            if (saque > this.saldo){
                System.out.println("Valor do saque superior ao Saldo digite outro valor");
            }
        } while (saque > saldo);

        this.saldo = this.saldo - saque;
        System.out.println("Saque efetuado com sucesso");
        System.out.println("Seu saldo atual:"+this.saldo);
    }

    public void transferencia() {
        double saque;

        do {
            saque = util.lerDouble("o Valor da transferencia:");
            if (saque > this.saldo){
                System.out.println("Valor da transferencia superior ao Saldo digite outro valor");
            }
        } while (saque > saldo);

        this.saldo = this.saldo - saque;
        System.out.println("Transferencia efetuada com sucesso");
        System.out.println("Seu saldo atual:"+this.saldo);
    }

    public String novaConta(){
        return String.valueOf(contaCriada++);
    }


}
