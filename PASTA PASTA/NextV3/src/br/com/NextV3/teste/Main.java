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

//----------------------------------------------------------------------------------------------------------------------


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
                    Endereco endereco = new Endereco();           //Objeto
                    EnderecoBo enderecoBo = new EnderecoBo();     //Metodo que preenche o objeto acima

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

                    Cliente cliente = new Cliente();       //Objeto
                    ClienteBo clienteBo = new ClienteBo();      //Metodo que preenche objeto acima

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

                    } else if (modalidadeConta == 2) {

                        contaCorrente = null;
                        contaPoupanca = contaBo.cadastraConta(contaPoupanca, cliente, ModalidadeConta.POUPANCA);
                        BancoDeDados.novoCliente(idCliente, contaCorrente, contaPoupanca, cliente);

                    } else if (modalidadeConta == 3) {

                        contaCorrente = contaBo.cadastraConta(contaCorrente, cliente, ModalidadeConta.CORRENTE);
                        contaPoupanca = contaBo.cadastraConta(contaPoupanca, cliente, ModalidadeConta.POUPANCA);
                        BancoDeDados.novoCliente(idCliente, contaCorrente, contaPoupanca, cliente);
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
                        /*
                        System.out.println("       ============ MENU DO CLIENTE =============");
                        System.out.println("        1 - Ver Saldo                            ");
                        System.out.println("        2 - Depositar                            ");
                        System.out.println("        3 - Transfeir                            ");
                        System.out.println("       99 - Sair                                 ");
                        System.out.println("       ==========================================");
                         */
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
        do{
        menu.menuDoCliente();

        opcao = utils.lerInteiro("Digite sua opção");
        switch (opcao) {
            case 1: {
                contaBo.consultaSaldo(contaCorrente, contaPoupanca);

            }
            break;
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
            break;
            case 3: {
//------------------------DEBITANDO TRANSFERENCIA OU DE CORRENTE OU DE POUPANCA ----------------------------------------
                int idContaDestino = utils.lerInteiro("Digite o Numero da conta destino");
                do {
                    opcao1 = utils.lerInteiro("Qual a modalidade da conta destino?" +
                            "\n1 - Conta corrente" +
                            "\n2 - Conta Poupanca" +
                            "\nDigite uma opção:");
                    if (opcao != 1 && opcao != 2) {
                        System.out.println("Opcao invalida Digite novamente...");
                    }
                } while (opcao != 1 && opcao != 2);
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
                    if (opcao != 1 && opcao != 2) {
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
            break;
            case 4: {
                menuPix(contaCorrente, contaPoupanca);
            }
            break;
            case 99: {
                System.out.println("Vlw por usar o NEXT");
            }
            break;

        }
        }while (opcao != 99);
//----------------------------------------------------------------------------------------------------------------------

    }

    public static void menuPix(Conta contaCorrente, Conta contaPoupanca) {
        Menu menu = new Menu();
        Pix pix = new Pix();
        contaCorrente.setPix(pix);
        TipoChavePix tipoChavePix;
        ContaBo contaBo = new ContaBo();
        BancoDeDados bancoDeDados = new BancoDeDados();
        Utils utils = new Utils();
        int opcao = -1;

        menu.menuPix();
        System.out.println("==========Menu PIX ==============");
        System.out.println(" 1 - Cadastrar Pix");
        System.out.println(" 2 - Realizar Pix");
        System.out.println("99 - Sair");
        System.out.println("=================================");
        opcao = utils.lerInteiro("Digite sua opção:");

        switch (opcao) {
            case 1: {
                menuCadastraPix(contaCorrente, pix);
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


    }

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
                    do {
                        conteudoPix = utils.lerSring("Digite seu CPF:");
                        if (conteudoPix.length() != 11 || !conteudoPix.matches("[0-9]*")) {
                            System.out.println("CPF invalido digite novamente");
                        }
                    } while (conteudoPix.length() != 11 || !conteudoPix.matches("[0-9]*"));
                    contaCorrente = contaBo.cadastroPixContaCorrente(opcao-1, contaCorrente, conteudoPix);

                }
                break;
                case 2: {
                    conteudoPix = utils.lerSring("Digite seu Email :");
                    contaCorrente = contaBo.cadastroPixContaCorrente(opcao-1, contaCorrente, conteudoPix);

                }
                break;
                case 3: {
                    conteudoPix = utils.lerSring("Digite seu Celular :");
                    contaCorrente = contaBo.cadastroPixContaCorrente(opcao-1, contaCorrente, conteudoPix);

                }
                break;
                case 4: {
                    conteudoPix = UUID.randomUUID().toString();
                    contaCorrente = contaBo.cadastroPixContaCorrente(opcao-1, contaCorrente, conteudoPix);
                    System.out.println("Seu pix aleatorio é :" + contaCorrente.getPix().getConteudoChavePix()[opcao-1]);

                }
                break;
                case 99: {
                    System.out.println("eu ja saí");

                }
                break;

            }
        }while (opcao != 99);

    }
}
