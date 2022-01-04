package br.com.BancoNext.beans;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();
        Utils ajuda = new Utils();
        int opcao;

        do {
            System.out.println("MENU NEXT");
            System.out.println("" +
                    "\n1 - Cadastrar cliente" +
                    "\n2 - Cadastrar conta" +
                    "\n3 - Loguin" +
                    "\n4 - Sair");
            opcao = ajuda.lerInteiro("sua Opção");
            switch (opcao) {
                case 1:
                    Cliente cadastraCliente = new Cliente();
                    Cliente.cadastraCLiente(cliente);
                    break;
                case 2:
                    conta.cadastrarConta(cliente);
                    break;
                case 3:
                        if(conta.loguin() == true){
                            do {
                            System.out.println("OPÇÕES" +
                                    "\n1 - Saque" +
                                    "\n2 - Deposito" +
                                    "\n3 - Consultar Saldo" +
                                    "\n4 - Sair");
                                opcao = ajuda.lerInteiro("opção");
                                switch (opcao){
                                    case 1:
                                        conta.saque();
                                        break;
                                    case 2:
                                        conta.deposito();
                                        break;
                                    case 3:
                                        System.out.println("Seu saldo R$"+conta.saldo);

                                        break;
                                    case 4:
                                        System.out.println("O next agradece sua visita até breve !");
                                }
                            }while(opcao !=4);
                            opcao = 0;
                        }
                        break;

                case 4 :
                    System.out.println("Obrigado Por usar o NEXT");

                    break;
            }
        }while (opcao !=4 );
    }
}

