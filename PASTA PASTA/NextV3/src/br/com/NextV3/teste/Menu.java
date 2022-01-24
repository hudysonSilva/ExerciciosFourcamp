package br.com.NextV3.teste;

public class Menu {


    public void MenuPrincipal() {

        System.out.println("============= MENU NEXT =============");
        System.out.println("| 1 - Cadastro novos clientes        |");
        System.out.println("| 2 - Loguin                         |");
        System.out.println("| 3 - Deposito                       |");
        System.out.println("|99 - Sair                           |");
        System.out.println("=====================================");
    }

    public void menuDoCliente() {

        System.out.println("       ============ MENU DO CLIENTE =============");
        System.out.println("        1 - Ver Saldo                            ");
        System.out.println("        2 - Depositar                            ");
        System.out.println("        3 - Transfeir                            ");
        System.out.println("        4 - Pix                                  ");
        System.out.println("       99 - Sair                                 ");
        System.out.println("       ==========================================");

    }
    public void menuPix(){
        System.out.println("==========Menu PIX ==============");
        System.out.println(" 1 - Cadastrar Pix");
        System.out.println(" 2 - Realizar Pix");
        System.out.println("99 - Sair");
        System.out.println("=================================");

    }
    public void menuCadastraPix(){
        System.out.println("==========Menu PIX ==============");
        System.out.println(" 1 - Chave CPF ");
        System.out.println(" 2 - Chave EMAIL");
        System.out.println(" 3 - Chave TELEFONE");
        System.out.println(" 4 - Chave Aleatoria");
        System.out.println("99 - Sair");
        System.out.println("=================================");


    }
}