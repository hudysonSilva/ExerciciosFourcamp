package br.com.BancoNext.beans;

public class Cliente {
    String cpf;
    String nome;
    String rg;
    Endereco endereco;
    int tipoCliente;                    //1 comum 2 premium 3 super
    String dataDeNascimento;
    Conta conta;

    public static Cliente cadastraCLiente(Cliente cliente) {
        //                                      ↑
        //Cadastro                          cliente
        Utils ajuda = new Utils();
        do {
            cliente.cpf = ajuda.lerSring("CPF");
            if(cliente.cpf.length() != 11){
                System.out.println("CPF invalido o CPF possui 11 digitos");
            }
        }while(cliente.cpf.length() != 11 );
        cliente.nome = ajuda.lerSring("Nome");
        /*
        do {
            cliente.rg = ajuda.lerSring("RG");
            if(cliente.rg.length() != 9){
                System.out.println("Quantidade de digitos invalida");
            }
        }while (cliente.rg.length() != 9);
        cliente.dataDeNascimento = ajuda.lerSring("Data de nascimento");
        cliente.tipoCliente = 1;

        //Dados de endereço
        cliente.endereco = new Endereco();

        cliente.endereco.cep  = ajuda.lerSring("CEP"); ;
        cliente.endereco.logradouro = ajuda.lerSring("Logradouro");
        cliente.endereco.numero = ajuda.lerInteiro("Numero") ;
        cliente.endereco.uf = ajuda.lerSring("UF");;
        cliente.endereco.cidade = ajuda.lerSring("Cidade"); ;
        cliente.endereco.bairro = ajuda.lerSring("Bairro");;
        */

        Conta conta = new Conta();
        /*
            conta.loguin = cliente.cpf;
        do{
         conta.senha = ajuda.lerInteiro("senha de 4 digitos");
        }while(conta.senha.);
        */
        System.out.println("Seja Bem vindo ao NEXT");

        return cliente;
    }
}
