package br.com.NextV3.teste;

import br.com.NextV3.beans.*;
import br.com.NextV3.bo.ClienteBo;
import br.com.NextV3.bo.ContaBo;
import br.com.NextV3.bo.EnderecoBo;

import javax.sound.midi.Soundbank;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {


        int opcao = -1;
//-----------------------------------------------OBJETOS E METODOS------------------------------------------------------

        Utils utils = new Utils();
        ContaBo contaBo = new ContaBo();
        BancoDeDados bancoDeDados = new BancoDeDados();
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();
        Conta conta = new Conta();
        Endereco endereco = new Endereco();
        EnderecoBo enderecoBo = new EnderecoBo();
        Cliente cliente = new Cliente();
        ClienteBo clienteBo = new ClienteBo();


//----------------------------------------------------------------------------------------------------------------------
        {
            int teste = 1;
            if (teste == 1) {
                //Cliente Hudyson Pre cadastrado
                int idCliente = bancoDeDados.autoIncrementoConta();
                Endereco endereco1 = enderecoBo.cadastraEndereco("06330-111", "SP", "Osasco", "Helena maria", "Rua dos Bobos", 10);
                Cliente cliente1 = clienteBo.cadastraCliente(idCliente, "Hudyson Silva", "12312312311", "26/07/1994", endereco, 1234);
                Conta conta1 = new ContaCorrente();
                conta1 = contaBo.cadastraConta(conta1, cliente1, ModalidadeConta.CORRENTE);
                Conta conta2 = new ContaPoupanca();
                conta2 = contaBo.cadastraConta(conta2, cliente, ModalidadeConta.POUPANCA);
                BancoDeDados.novoCliente(idCliente, conta1, conta2, cliente1);
                CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
                CartaoDeDebito cartaoDeDebito = new CartaoDeDebito();
                contaBo.solicitaCartaoDeDebito(cartaoDeDebito,"MsterCard",1234,conta1);
                contaBo.solicitaCartaoDeCredito(cartaoDeCredito,"MasterCard",2000,1234,conta1);
            }

            if (teste == 1) {

                //Cliente Bruna Vieira
                int idCliente = bancoDeDados.autoIncrementoConta();
                Endereco endereco1 = enderecoBo.cadastraEndereco("06330-111", "SP", "São Paulo", "Jaguaré", "Rua 1", 10);
                Cliente cliente1 = clienteBo.cadastraCliente(idCliente, "Bruna Vieira", "12312312322", "13/07/1994", endereco, 1234);
                Conta conta1 = new ContaCorrente();
                conta1 = contaBo.cadastraConta(conta1, cliente1, ModalidadeConta.CORRENTE);
                Conta conta2 = new ContaPoupanca();
                conta2 = contaBo.cadastraConta(conta2, cliente, ModalidadeConta.POUPANCA);
                BancoDeDados.novoCliente(idCliente, conta1, conta2, cliente1);
                CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
                CartaoDeDebito cartaoDeDebito = new CartaoDeDebito();
                contaBo.solicitaCartaoDeDebito(cartaoDeDebito,"MsterCard",1234,conta1);
                contaBo.solicitaCartaoDeCredito(cartaoDeCredito,"MasterCard",2000,1234,conta1);
            }
        }
//----------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------


//----------------------------------MENU DO CLIENTE LOGADO -------------------------------------------------------------


        do {
            System.out.println("============= MENU NEXT =============");
            System.out.println("| 1 - Cadastro novos clientes        |");
            System.out.println("| 2 - Loguin                         |");
            System.out.println("| 3 - Deposito                       |");
            System.out.println("|99 - Sair                           |");
            System.out.println("=====================================");
            opcao = utils.lerInteiro("Digite sua opção:");
            switch (opcao) {
                case 1: {
                    System.out.println("=======================DADOS DE ENDERECO=======================");
                    endereco = new Endereco();           //Objeto
                    enderecoBo = new EnderecoBo();     //Metodo que preenche o objeto acima

                    String cep = utils.lerSring("Digite seu Cep:");
                    String uf = utils.lerSring("Digite seu UF:");
                    String cidade = utils.lerSring("Digite sua Cidade:");
                    String bairro = utils.lerSring("Digite seu Bairro:");
                    String logradouro = utils.lerSring("Digite seu Logradouro:");
                    int numero = utils.lerInteiro("Digite o numero:");

                    endereco = enderecoBo.cadastraEndereco(cep, uf, cidade, bairro, logradouro, numero);
                    System.out.println("===============================================================");

                    System.out.println("=======================DADOS DO CLIENTE========================");


                    int idCliente = bancoDeDados.autoIncrementoConta();
                    String cpf;
                    do {
                        cpf = utils.lerSring("Digite seu CPF:");
                        if (cpf.length() != 11 || !cpf.matches("[0-9]*")) {
                            System.out.println("CPF invalido digite novamente");
                        }
                    } while (cpf.length() != 11 || !cpf.matches("[0-9]*"));

                    String nome = utils.lerSring("Digite seu Nome:");
                    String dataDeNascimento = utils.lerSring("Digite sua data de nascmento no formato dd/mm/aaaa");

                    int senha;
                    do {
                        senha = utils.lerInteiro("Digite uma senha de 4 digitos");
                        if (senha < 1000 || senha > 9999) {
                            System.out.println("Senha invalida digite novamente");
                        }
                    } while (senha < 1000 || senha > 9999);

                    cliente = new Cliente();       //Objeto
                    clienteBo = new ClienteBo();      //Metodo que preenche objeto acima

                    cliente = clienteBo.cadastraCliente(idCliente, cpf, nome, dataDeNascimento, endereco, senha);
                    System.out.println("===============================================================");

                    System.out.println("======================PREENCHENDO CONTA========================");


                    System.out.println("informe a modalidade de conta que deseja abrir");
                    System.out.println("1 - Para corrente");
                    System.out.println("2 - Para poupança");
                    System.out.println("3 - Para ambas");
                    int modalidadeConta = -1;
                    do {
                        modalidadeConta = utils.lerInteiro("Digite uma opção:");
                        if (modalidadeConta < 1 || modalidadeConta > 3) {
                            System.out.println("Opção invalida digite novamente");
                        }
                    } while (modalidadeConta < 1 || modalidadeConta > 3);
                    if (modalidadeConta == 1) {

                        contaCorrente = contaBo.cadastraConta(contaCorrente, cliente, ModalidadeConta.CORRENTE);
                        contaPoupanca = null;
                        BancoDeDados.novoCliente(idCliente, contaCorrente, contaPoupanca, cliente);
                        Pix pix = new Pix();
                        contaCorrente.setPix(pix);

                    }
                    else if (modalidadeConta == 2) {

                        contaCorrente = null;
                        contaPoupanca = contaBo.cadastraConta(contaPoupanca, cliente, ModalidadeConta.POUPANCA);
                        BancoDeDados.novoCliente(idCliente, contaCorrente, contaPoupanca, cliente);

                    } else if (modalidadeConta == 3) {

                        contaCorrente = contaBo.cadastraConta(contaCorrente, cliente, ModalidadeConta.CORRENTE);
                        contaPoupanca = contaBo.cadastraConta(contaPoupanca, cliente, ModalidadeConta.POUPANCA);
                        BancoDeDados.novoCliente(idCliente, contaCorrente, contaPoupanca, cliente);
                        Pix pix = new Pix();
                        contaCorrente.setPix(pix);
                    }

                    System.out.println("===============================================================");


                    System.out.println("===================NEXT INFORMA================================");
                    System.out.println("As informaçoes da sua conta chegaram em instantes por email    ");
                    System.out.println("♥♥♥[...] (instantes depois) no seu email  ...                  ");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("[O email]  sua conta é: 000" + cliente.getIdCliente());
                    System.out.println("Para logar utilise o numero da conta mais a senha cadastrada   ");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("===============================================================");


                }
                break;
                case 2: {
                    System.out.println("===============================================================");

                    //////////SE CLIENTE TIVER CONTA ISSO FICA BEM MAIS FACIL MAIS SEGUE O BAILE MANITO

                    int contaConfere = utils.lerInteiro("Digite sua conta");
                    int senhaConfere = utils.lerInteiro("Digite sua senha");
                    contaCorrente = bancoDeDados.buscaContaCorrenteComId(contaConfere);
                    contaPoupanca = bancoDeDados.buscaContaPoupancaComId(contaConfere);

                    if (contaPoupanca == null || contaCorrente != null) {
                        conta = contaCorrente;
                    } else if (contaCorrente == null || contaPoupanca != null) {
                        conta = contaPoupanca;
                    } else {
                        conta = contaCorrente;
                    }

                    if (conta.getCliente().getSenha() == senhaConfere) {
                        menuCliente(contaCorrente, contaPoupanca);
                    }

                }
                break;
                case 3: {
                    System.out.println("===============================================================");
                    int idDeposito = utils.lerInteiro("Digite o id da conta que deseja depositar:");
                    double valor = utils.lerDouble("Digite o valor a ser depositado R$");

                    int modalidadeConta = -1;
                    do {
                        modalidadeConta = utils.lerInteiro("Qual a modalidade da conta" +
                                "\n1 - Corrente" +
                                "\n2 - Poupanca" +
                                "\nDigite a opção:");
                        if (modalidadeConta < 1 || modalidadeConta > 2) {
                            System.out.println("opção invalidad digite novamente");
                        }
                    } while (modalidadeConta < 1 || modalidadeConta > 2);
                    if (modalidadeConta == 1) {
                        contaCorrente = bancoDeDados.buscaContaCorrenteComId(idDeposito);
                        contaBo.depositoContaCorrente(contaCorrente, valor);
                    } else {
                        contaPoupanca = bancoDeDados.buscaContaPoupancaComId(idDeposito);
                        contaBo.depositoContaPoupanca(contaPoupanca, valor);
                    }

                    System.out.println("===============================================================");
                }
                break;
                case 99: {
                    System.out.println("OBrigado por usar o serviço NEXT !!");

                }
                break;
            }
        } while (opcao != 99);


    }

    public static void menuCliente(Conta contaCorrente, Conta contaPoupanca) {
        Utils utils = new Utils();
        ContaBo contaBo = new ContaBo();
        BancoDeDados bancoDeDados = new BancoDeDados();
        Conta contaRecebe = new Conta();
        int opcao1 = -1;
        Menu menu = new Menu();
        int opcao = -1;
//-----------------------------------------MENU NO METODO---------------------------------------------------------------
        do {
            menu.menuDoCliente();

            opcao = utils.lerInteiro("Digite sua opção");
            switch (opcao) {
                case 1: {
                    contaBo.consultaSaldo(contaCorrente, contaPoupanca);

                }
                break; //Saldo
                case 2: {
                    System.out.println("===============================================================");
                    int idDeposito = utils.lerInteiro("Digite o id da conta que deseja depositar:");
                    double valor = utils.lerDouble("Digite o valor a ser depositado R$");

                    int modalidadeConta = -1;
                    do {
                        modalidadeConta = utils.lerInteiro("Qual a modalidade da conta" +
                                "\n1 - Corrente" +
                                "\n2 - Poupanca" +
                                "\nDigite a opção:");
                        if (modalidadeConta < 1 || modalidadeConta > 2) {
                            System.out.println("opção invalidad digite novamente");
                        }
                    } while (modalidadeConta < 1 || modalidadeConta > 2);
                    if (modalidadeConta == 1) {
                        contaCorrente = bancoDeDados.buscaContaCorrenteComId(idDeposito);
                        contaBo.depositoContaCorrente(contaCorrente, valor);
                    } else {
                        contaPoupanca = bancoDeDados.buscaContaPoupancaComId(idDeposito);
                        contaBo.depositoContaPoupanca(contaPoupanca, valor);
                    }
                    contaBo.consultaSaldo(contaCorrente, contaPoupanca);
                    System.out.println("===============================================================");
                }
                break; //Deposito
                case 3: {
//------------------------DEBITANDO TRANSFERENCIA OU DE CORRENTE OU DE POUPANCA ----------------------------------------
                    int idContaDestino = utils.lerInteiro("Digite o Numero da conta destino");
                    do {
                        opcao1 = utils.lerInteiro("Qual a modalidade da conta destino?" +
                                "\n1 - Conta corrente" +
                                "\n2 - Conta Poupanca" +
                                "\nDigite uma opção:");
                        if (opcao != 1 || opcao != 2) {
                            System.out.println("Opcao invalida Digite novamente...");
                        }
                    } while (opcao != 1 || opcao != 2);
                    if (opcao1 == 1) {
                        contaRecebe = bancoDeDados.buscaContaCorrenteComId(idContaDestino);    //Se 1 conta destino corrente
                    } else {
                        contaRecebe = bancoDeDados.buscaContaPoupancaComId(idContaDestino);    //Se 2 conta destino poupanca
                    }

                    Double valor = utils.lerDouble("Digite o valor da Transferencia R$");
                    do {
                        opcao = utils.lerInteiro("Debitar o valor de" +
                                "\n1 - Conta corrente" +
                                "\n2 - Conta Poupanca" +
                                "\nDigite uma opção:");
                        if (opcao != 1 || opcao != 2) {
                            System.out.println("Opcao invalida Digite novamente...");
                        }
                    } while (opcao != 1 && opcao != 2);

                    if (opcao == 1) {
                        contaBo.transferencia(contaCorrente, contaRecebe, valor);
                    } else {
                        contaBo.transferencia(contaPoupanca, contaRecebe, valor);
                    }

//----------------------------------------------------------------------------------------------------------------------

                }
                break; //Transferencia
                case 4: {
                    menuPix(contaCorrente, contaPoupanca);
                }
                break; //Pix
                case 5: {
                    menuCartoes(contaCorrente);
                }
                break; //Cartões
                case 99: {
                    System.out.println("Vlw por usar o NEXT");
                }
                break; //sair
            }
        } while (opcao != 99);
//----------------------------------------------------------------------------------------------------------------------

    }

    public static void menuPix(Conta contaCorrente, Conta contaPoupanca) {
        Menu menu = new Menu();
        TipoChavePix tipoChavePix;
        ContaBo contaBo = new ContaBo();
        BancoDeDados bancoDeDados = new BancoDeDados();
        Utils utils = new Utils();
        int opcao = -1;
        do {
            menu.menuPix();
            opcao = utils.lerInteiro("Digite sua opção:");

            switch (opcao) {
                case 1: {
                }
                break;
                case 2: {
                    System.out.println("DLC chega em breve");
                }
                break;
                case 99: {
                    System.out.println("Meu nome é fui");
                }
                break;

            }
        }while (opcao != 99);


    }//Realizar pix não funfa ainda

    public static void menuCadastraPix(Conta contaCorrente, Pix pix) {
        Menu menu = new Menu();
        TipoChavePix tipoChavePix;
        ContaBo contaBo = new ContaBo();
        BancoDeDados bancoDeDados = new BancoDeDados();
        Utils utils = new Utils();
        int opcao = -1;
        String vet[] = new String[4];

        do {
            menu.menuCadastraPix();
            opcao = utils.lerInteiro("Digite sua opção :");
            String conteudoPix;

            switch (opcao) {
                case 1: {

                }
                break;
                case 2: {}
                break;
                case 3: {}
                break;
                case 4: {}
                break;
                case 99: {
                    System.out.println("eu ja saí");

                }
                break;

            }
        } while (opcao != 99);

    } //100%

    public static void menuCartoes(Conta conta) {
        int opcao = -1;
        Utils utils = new Utils();
        Cartao cartao[] = new Cartao[2];
        ContaBo contaBo = new ContaBo();

        do {
            System.out.println("==============Menu Cartoes==============");
            if (cartao[0] != null || cartao[1] != null) {
                System.out.println("╔============================================╗");
                System.out.println("║                                     ┌─┬─┐  ║");
                System.out.println("║                                     ├┼┴┼┤  ║");
                System.out.println("║                                     └┴─┴┘  ║");
                System.out.println("║                                            ║");
                System.out.println("║                                            ║");
                System.out.println("║NOME:"+conta.getCliente().getNome()+" NUMERO:" + cartao);
                System.out.println("║                                   ┌────┐   ║");
                System.out.println("║                                   │VISA│   ║");
                System.out.println("║                                   └────┘   ║");
                System.out.println("╚============================================╝");
            }



            System.out.println(" 1 - extrato credito                     ");
            System.out.println(" 2 - extrato debito                      ");
            System.out.println(" 3 - Solicitar cartão                    ");
            System.out.println(" 4 - Meus cartoes                        ");
            System.out.println("99 - Sair                                ");
            opcao = utils.lerInteiro("Digite sua opção :");

            switch (opcao) {
                case 1: {
                    System.out.println("Aqui é só por as tranzaçoes numa array e varrer ela com for dando sysout");
                }
                break;
                case 2: {
                    System.out.println("Aqui é só por as tranzaçoes numa array e varrer ela com for dando sysout tambem");

                }
                break;
                case 3: {
                    opcao = utils.lerInteiro("Qual tipo de cartao deseja solicitar " +
                            "\n1 - Cartao de debito" +
                            "\n2 - Cartao de Credito" +
                            "\n3 - Solicitar Ambos" +
                            "\nDigite sua opção:");

                    if (opcao == 1) {
                        CartaoDeDebito cartaoDeDebito = new CartaoDeDebito();
                        String bandeira = utils.lerSring("Digite a bandeira desejada:");
                        int senha = utils.lerInteiro("Digite  uma senha de 4 digitos:");

                        contaBo.solicitaCartaoDeDebito(cartaoDeDebito, bandeira, senha, conta);

                    } else if (opcao == 2) {
                        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
                        String bandeira = utils.lerSring("Digite a bandeira desejada:");
                        int senha = utils.lerInteiro("Digite  uma senha de 4 digitos:");
                        double renda = utils.lerDouble("Digite sua renda:");

                        contaBo.solicitaCartaoDeCredito(cartaoDeCredito, bandeira, renda, senha, conta);
                    } else if (opcao == 3) {
                        System.out.println("============== DADOS DO CARTAO DE DEBITO ==============");
                        CartaoDeDebito cartaoDeDebito = new CartaoDeDebito();
                        String bandeira = utils.lerSring("Digite a bandeira desejada:");
                        int senha = utils.lerInteiro("Digite  uma senha de 4 digitos:");

                        contaBo.solicitaCartaoDeDebito(cartaoDeDebito, bandeira, senha, conta);
                        System.out.println("cartão de debito criado com sucesso");
                        System.out.println("=======================================================");

                        System.out.println("============== DADOS DO CARTAO DE CREDITO ==============");

                        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
                         bandeira = utils.lerSring("Digite a bandeira desejada:");
                         senha = utils.lerInteiro("Digite  uma senha de 4 digitos:");
                        double renda = utils.lerDouble("Digite sua renda:");

                        contaBo.solicitaCartaoDeCredito(cartaoDeCredito, bandeira, renda, senha, conta);
                        System.out.println("Cartão de credito criado com sucesso");
                        System.out.println("========================================================");


                    }
                }
                break; //cadastro de cartoes credito e debito
                case 4: {
                    BancoDeDados bancoDeDados = new BancoDeDados();
                    Cartao cartaoC = bancoDeDados.buscaCartaoDeCreditoPorConta((conta));
                    CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
                   MenuDeTestes((CartaoDeCredito) cartaoC);
                }
                break;
                case 99: {
                    System.out.println("Vazando !!");
                }
                break;  //Sair 100% funcionando

            }
            break;
        } while (opcao != 99);

    }

    public static void MenuDeTestes(CartaoDeCredito cartaoDeCredito) {
        Utils utils = new Utils();
        int opcao = -1;
        System.out.println("Fazer compra com cartão" +
                "1 - Compra de teste");
        double valor = utils.lerDouble("Digite valor da compra :");

        if (opcao == 1) {
            System.out.println("Viagem no tempo Pro futuro");
        }


    }
}
