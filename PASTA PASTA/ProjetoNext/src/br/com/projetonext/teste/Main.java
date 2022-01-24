package br.com.projetonext.teste;
import br.com.projetonext.beans.*;
import br.com.projetonext.bo.*;


public class Main {
    public static void main(String[] args) {
        //VARIAVEIS

        boolean check;
        String nome;
        String cpf;
        String dataDeNascimento;
        String cep;
        String uf;
        String cidade;
        String bairro;
        String logradouro;
        String celular;
        String email;

        int opcao = -1;
        int idCliente;
        int numero;
        int senha;
        int index = 0;                                  // ESTOU USANDO ESSE INDICE PARA GERAR UM ID DE CLIENTE ME JULGUE !!
        int tipoConta;
        double valor;                                   // Variavel usada para deposito e saque
        int idConta;                                    //Id do TIPO CONTA CORRENTE OU POUPANÇA

        //OBJETOS E METODOS
        Utils util = new Utils();
        Cliente[] cliente               = new Cliente[3];       //Objeto
        ClienteBo clienteBo             = new ClienteBo();      //Metodo que preenche objeto acima

        Endereco endereco               = new Endereco();       //Objeto
        EnderecoBo enderecoBo           = new EnderecoBo();     //Metodo que preenche o objeto acima
                                        //   idCliente/idConta
        Conta[][] conta                 = new Conta[3] [2];         // ...
        ContaBo contaBo                 = new ContaBo();        // ...

        Pix pix[]                       = new Pix[3];           // ...
        PixBo pixBo                     = new PixBo();          // ...


            //ENDERECO CLI 2
            endereco = enderecoBo.cadastraEndereco("33", "33", "33", "33", "33", 33);
            //CLIENTE 2
            cliente[2] = clienteBo.cadastraCliente("Elizabete", "12312312333", endereco);


            cliente[2].setIdCliente(2);
            cliente[2].setDataDeNascimento("11/11/1111");

            //PIX CLI 2

            //CLI 2 categoria

            // N-U-L-L



        do {
            System.out.println("\n\n==========MENU NEXT==========");
            System.out.println("1 - Cadastra Cliente");
            System.out.println("2 - Cadastra Conta");
            System.out.println("3 - Deposito");
            System.out.println("4 - Loguin");
            System.out.println("5 - Sair");
            System.out.println("=============================");

            opcao = util.lerInteiro("Uma Opçao");
            switch (opcao) {

                case 1: {


                    //INSERSAO DE DADOS DO CLIENTE
                    System.out.println                  ("====DADOS PESSOAIS====");

                    nome = util.lerSring                ("Nome");
                    cpf = util.lerSring                 ("CPF");
                    dataDeNascimento = util.lerSring    ("Data de nascimento (EX: dd/mm/aaaa");

                    System.out.println("Dados pessoais recebidos com sucesso ...");

                    //INSERSAO DE DADOS DO ENDEREÇO DESSE CLIENTE
                    System.out.println          ("====DADOS DE ENDEREÇO====");

                    cep = util.lerSring         ("CEP");
                    uf = util.lerSring          ("UF");
                    cidade = util.lerSring      ("Cidade");
                    bairro = util.lerSring      ("Bairro");
                    logradouro = util.lerSring  ("Logradouro");
                    numero = util.lerInteiro    ("Numero");
                    idCliente = index;                                                                                  //INDEX TA SERVINDO DE ID PRA CLIENTE TBM hehe

                    System.out.println          ("Dados de endereço recebidos com sucesso ...");
                    System.out.printf           ("\nEstá quase pronto você é nosso cliente ID:%d",index);

                    //METODO DE CADASTRO DE CLIENTE DO "ClienteBO"
                    endereco = enderecoBo.cadastraEndereco(cep, uf, cidade, bairro, logradouro, numero);

                    System.out.println("\n============================\nINDICE ANTES DE ARMASENAR"+index);                                                                                                         //Armazenando os dados recebidos acima em "cliente[0]" DALE !!!!!!
                    cliente[index] = clienteBo.cadastraCliente(nome, cpf, endereco);


                    index = index + 1;                                                                                            //QUANDO 1 Cliente é cadastrado o indice sobe para o proximo cliente

                    //ESSA PARTE TESTA PRA VER SE OS DADOS CHEGARAM
                    //System.out.println(cliente[index].toString());

                } break; //Cadastro de cliente sem tramaento de variaveis

                case 2: {

                    //INSERINDO DADOS DA CONTA
                    System.out.println("=====ATRIBUIR UMA CONTA PARA UM CLIENTE=====");
                    idCliente = util.lerInteiro("O ID do cliente a receber uma conta");                    //ESSE TBM VAI SER O ID DA      CONTA HEHE
                                                                                                                        //ESSE TBM VAI SER O NUMERO DA  CONTA kkkjkjk
                    do {
                        System.out.println("===Modalidades da conta===");
                        System.out.println("1 - Corrente");
                        System.out.println("2 - Poupança");

                        idConta = util.lerInteiro("Modalidade:")-1;
                    }while (idConta<0 || idConta>1);                                                         // Valida se a conta é 1 ou 2 e limita ela a ser 1 ou 2

                    do {
                        senha = util.lerInteiro("Digite uma senha de 4 digitos");
                    }while (senha <1000 || senha>9999); // Valida se a senha tem 4 digitos

                    if(idConta == 0) {
                        conta[idCliente][idConta] = contaBo.cadastraConta(TipoConta.CORRENTE, cliente[idCliente], idCliente, senha);
                    }
                    else {
                        conta[idCliente][idConta] = contaBo.cadastraConta(TipoConta.POUPANCA, cliente[idCliente], idCliente, senha);
                    }
                    idConta = -1;
                } break; //Cadastro de conta sem tratamento de **nome**

                case 3: {

                    idCliente = util.lerInteiro("o ID do cliente a receber o DEPOSITO");
                    do {
                            idConta = util.lerInteiro("O tipo da conta \n1 - Corrente\n2 - Poupança") - 1;
                            check = contaBo.checaExistenciaConta(conta[idCliente][idConta], idConta);

                        if(idConta <0 || idConta >1){
                            System.out.println("Id Errado digite novamente...");
                        }

                    }while (idConta <0 || idConta >1);

                    if (check == false){
                        break;
                    }

                    clienteBo.checaDestinatario(cliente[idCliente]);                                                    // METODO DE CHECK E LEITURA DE DADOS ANDAM JUNTOS
                    opcao = util.lerInteiro("sua opção");                                                  // TIPO ASSIM <-----

                    if (opcao == 1 ) {
                        valor = util.lerDouble("o valor do deposito");
                        conta[idCliente][idConta].setSaldo(valor + conta[idCliente][idConta].getSaldo());
                    }
                    else break;

                } break; //DEPOSITO sem TRATAMENTO DE LIMITE ?!?!?!?

                case 4: {

                    idCliente = 0;
                    idConta = 0;
                    senha = 0;
                    idCliente = util.lerInteiro("Digite 0 Numedo da Conta");
                    senha = util.lerInteiro("Senha de 4 digitos");


                    if(senha == conta[idCliente][idConta].getSenha() && idCliente == conta[idCliente][idConta].getConta() ){

                        System.out.println("Loguin efetuado com sucesso !!");
                        do {
                            System.out.println("    =====MENU DO USUARIO=====");
                            System.out.println("    1 - Saque");
                            System.out.println("    2 - Saldo");
                            System.out.println("    3 - Deposito");
                            System.out.println("    4 - Transferencia");
                            System.out.println("    5 - Pix");
                            System.out.println("    6 - Sair");
                            opcao = -1;
                            opcao = util.lerInteiro("sua opção:");

                            switch (opcao) {

                                case 1: {

                                    valor = util.lerDouble("Valor do Saque R$");


                                        idConta = util.lerInteiro("O tipo da conta \n1 - Corrente\n2 - Poupança") - 1;
                                        check = contaBo.checaExistenciaConta(conta[idCliente][idConta],idConta);

                                    if (check == false){
                                        break;
                                    }
                                    contaBo.saque(conta[idCliente][idConta],valor);



                                } break;  //SAQUE TA SEM TRATAMENTO DE SALDO !!!! CONSERTA ANIMAL
                                case 2: {
                                    System.out.println("Seu saldo é R$" + conta[idCliente][idConta].getSaldo());
                                } break;  //SALDO FUNCIONANCO NORMALMENTE
                                case 3: {

                                    idCliente = util.lerInteiro("o ID do cliente a receber o DEPOSITO");
                                    do {
                                        idConta = util.lerInteiro("O tipo da conta \n1 - Corrente\n2 - Poupança") - 1;
                                        check = contaBo.checaExistenciaConta(conta[idCliente][idConta], idConta);

                                        if (idConta < 0 || idConta > 1) {
                                            System.out.println("Id Errado digite novamente...");
                                        }

                                    } while (idConta < 0 || idConta > 1);

                                    if (check == false) {
                                        break;
                                    }

                                    clienteBo.checaDestinatario(cliente[idCliente]);                                                    // METODO DE CHECK E LEITURA DE DADOS ANDAM JUNTOS
                                    opcao = util.lerInteiro("sua opção");                                                  // TIPO ASSIM <-----

                                    if (opcao == 1) {
                                        valor = util.lerDouble("o valor do deposito");
                                        conta[idCliente][idConta].setSaldo(valor + conta[idCliente][idConta].getSaldo());
                                    } else break;

                                }break;
                                case 4: {

                                      int idClienteRecebe = -1;
                                      idClienteRecebe = util.lerInteiro(" o numero da conta a receber a transferencia");
                                      valor = util.lerDouble("o valor da transferencia");
                                      System.out.println("Debitar o valor da conta");
                                      System.out.println("1 - Corrente");
                                      System.out.println("2 - Pouppança");
                                      idConta = util.lerInteiro("o tipo")-1;
                                      contaBo.transferencia(valor,conta[idCliente][idConta],conta[idClienteRecebe][0]);


                                } break;  //!


                                case 5: {

                                    do {
                                        System.out.println("        =======MENU PIX========");
                                        System.out.println("        1 - Fazer Pix");                //ISSO AQUI É UM SWITCH CASE
                                        System.out.println("        2 - Cadastrar chave Pix");      //ISSO AQUI É UM SWITCH CASE
                                        System.out.println("        3 - Sair");

                                        opcao = -1;
                                        opcao = util.lerInteiro("Sua opção");

                                        switch (opcao){
                                            case 1:{
                                                System.out.println("ESSA DLC NÂO FOI LIBERADA");
                                            } break;
                                            case 2:{
                                                do {
                                                    System.out.println("            1 - Cadastrar chave CPF");
                                                    System.out.println("            2 - Cadastrar chave E-mail");
                                                    System.out.println("            3 - Cadastrar chave Celular");
                                                    System.out.println("            4 - Sair");

                                                    opcao= -1;
                                                    opcao = util.lerInteiro("A sua opção");

                                                    switch (opcao){
                                                        case 1:{
                                                                cpf =cliente[idCliente].getCpf();
                                                                pixBo.cadastraCpfPix(pix[idCliente],cpf);
                                                        } break; //CADASTRO DE CHAVE PIX CPF
                                                        case 2:{
                                                            System.out.println("SEM DLC SEM JOOJ");
                                                        } break; //CADASTRO DE CHAVE PIX EMAIL
                                                        case 3:{} break; //CADASTRO DE CHAVE PIX CELULAR
                                                        case 4:{} break; //SAIR
                                                    }

                                                }while (opcao != 4);
                                            } break;
                                            case 3:{} break;

                                        }
                                    }while (opcao != 3);

                                } break;  //MENU DO PIX
                                case 6: {

                                    System.out.println("Muito obrigado por usar o SERVIÇO NEXT");

                                }
                                break;
                                default: {
                                    System.out.println("Opção invalida digite outra opção");
                                }

                            }
                        }while (opcao != 6); opcao = -1; //Menu do PIX


                    }

                } break; //Loguin + MENU DO USUARIO

                case 5: {
                    System.out.println("Obrigado por USAR O SERVIÇO NEXT");
                } break; //SAIR funcionando ;)

            }
        }while(opcao != 5);
    }
}
