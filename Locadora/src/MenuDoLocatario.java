public class MenuDoLocatario {




    public MenuDoLocatario (int opcao ){
        Utils ajuda = new Utils();
        Produto produto = new Produto();

        do {
            System.out.println("MENU BlockGhosts");
            System.out.println("" +
                    "\n1 - Cadastrar cliente" +
                    "\n2 - Cadastrar produto" +
                    "\n3 - Alugar" +
                    "\n4 - Sair");
            opcao = ajuda.lerInteiro("sua Opção");
            switch (opcao) {
                case 1:

                    Cliente cliente = new Cliente();
                    Cliente.cadastraCLiente(cliente);

                    break;
                case 2:


                    produto = Produto.cadastraProdutos(produto);

                    break;
                case 3:
                    produto = Produto.alugarProdutos(produto);


                    break;
                case 4:
                    System.out.println("Obrigado Por usar o BlockGhosts");

                    break;
            }
        }while (opcao != 4);
    }
}
