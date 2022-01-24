public class Filme {
    Utils ajuda = new Utils();

    private String nome;
    private int id;
    private int faixaEtaria;
//============GETTER & SETTER===============================
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
//==========================================================

//============METODO CONSTRUTRUTOR==========================
    public Filme gravaFilme(Filme filme){
        this.setId(ajuda.lerInteiro("ID"));
        this.setNome(ajuda.lerSring("Nome"));
        this.setFaixaEtaria(ajuda.lerInteiro("Faixa Etaria"));
        return null;
    }
//==========================================================


}
