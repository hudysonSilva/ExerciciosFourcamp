public class Fita {


    private String tipo; //// Filme ou JooJ
    private Filme filme = new Filme();
    private int quantidade;
    private Estoque estoque;
//=============GETTER & SETTER=========================


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getIdProduto(int idProduto) {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
//=================================================

//============METODO CONSTRUTOR====================
    public static Fita cadastraFita(Fita produto) {
        //                                            ↑
        //Cadastro                                 produto
        Utils ajuda = new Utils();


        produto.getIdProduto(ajuda.lerInteiro("Id do Produto"));
        produto.filme.gravaFilme(produto.filme);
        produto.tipo = ajuda.lerSring("Filme ou jogo ?");
        produto.quantidade = ajuda.lerInteiro("Quantidade");
        return produto;
    }
//=================================================
//===============ALUGAR FITA=======================
public static Fita alugarFita(Fita produto, Cliente cliente) {
    Utils ajuda = new Utils();
    cliente.getCpf();

    produto.setPosse();
    return produto  ;
}
//=================================================
}


