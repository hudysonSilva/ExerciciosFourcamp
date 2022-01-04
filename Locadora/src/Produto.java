public class Produto {
    String nome;
    String idProduto;
    String tipo; //Filme ou JooJ
    int quantidade;

    public static Produto cadastraProdutos(Produto produto) {
        //                                            ↑
        //Cadastro                                 produto
        Utils ajuda = new Utils();

        produto.idProduto = ajuda.lerSring("Id do Produto");
        produto.nome = ajuda.lerSring("Nome");
        produto.tipo = ajuda.lerSring("Filme ou jogo ?");
        produto.quantidade = ajuda.lerInteiro("Quantidade");
        return produto;
    }

    public static Produto alugarProdutos(Produto produto){

        if (produto.quantidade > 0){

            System.out.println("Produto disponivel");
            produto.quantidade = produto.quantidade-1;
            System.out.println("Produto quantidade"+ produto.quantidade);
        }

        return produto;
    }
}

