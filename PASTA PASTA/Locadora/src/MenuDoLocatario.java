public class MenuDoLocatario {
    Utils ajuda = new Utils();

    int i               = 0;
    Fita[] produtox  = new Fita[10];
    Cliente[] cliente     = new Cliente[10];



    public MenuDoLocatario (int opcao ){
        /*

        Digite Id do Produto :0
        Digite ID :0
        Digite Nome :A lagoa Azul
        Digite Faixa Etaria :18
        Digite Filme ou jogo ? :Filme
        Digite Quantidade :2

        */

        /*
        //===============CLIENTE=======================================
        cliente[0].setCpf("12345678911");
        cliente[0].setNome("Hudyson Silva");
        cliente[0].setIdade(27);
        //=============================================================

        //===============CLIENTE=======================================
        cliente[1].setCpf("12345678912");
        cliente[1].setNome("Artrue False");
        cliente[1].setIdade(26);
        //=============================================================

        //================FILME========================================
        produtox[0].nome = "lagoa azul";
        produtox[0].quantidade = 2;
        produtox[0].idProduto = 1;
        produtox[0].tipo = "filme";
        //=============================================================

        //================FILME========================================
        produtox[1].nome = "007";
        produtox[1].quantidade = 1;
        produtox[1].idProduto = 2;
        produtox[1].tipo = "filme";
        //=============================================================
*/
        int i = 2;
        Fita produtoxx = new Fita();
        do {
            System.out.println("MENU BlockGhosts");
            System.out.println("" +
                    "\n1 - Cadastrar cliente" +
                    "\n2 - Cadastrar Fita" +
                    "\n3 - Filmes Disponiveis" +
                    "\n4 - Alugar" +
                    "\n5 - Sair");
            opcao = ajuda.lerInteiro("sua Opção");
            switch (opcao) {
                case 1:
                    if(i == 10) {
                        System.out.println("A locadora está lotada");
                    break;
                    }
                    else {
                        Cliente.cadastraCLiente(cliente[i]); //Cliente esta sendo cadastrado no vetor "cliente[]" indice "i"
                    }

                    i++;
                    break;
                case 2:

                    Fita.cadastraFita(produtoxx);

                    break;
                case 3:


                    break;
                case 4:

                    break;
            }
        }while (opcao != 4);

    }
}
