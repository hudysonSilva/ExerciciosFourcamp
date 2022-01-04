package EstudoDeCaso;


public class Pessoa {

    //=================================================================
    //Planta da casa (Objeto)
    Livro livro = new Livro();
    private String nome;
    private String email;
    private String rg;
    private String curso;
    private String mimos;
    private String formaDePagamento;
    //private String voucher;           <--- Isso entra em mimos
    //=================================================================

    //Empresa que constroi a casa (metodo construtor).
    public  Pessoa(String nome, String email, String s){
    // this  se refere ao                nome se refere ao parametro
    // local da classe principal          recebido no metodo construtor;
        this.                             nome = nome;
        this.                             email = email;
    }



    //Metodo que seta nome 'Definir' o nome na classe principal SET ou SETTER
    //Metodo que traz 'Pega' nome que é dado na classe principal GET OU GETTER


    @Override
    public String toString() {
        return "Pessoa{" +
                "livro=" + livro +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", rg='" + rg + '\'' +
                ", curso='" + curso + '\'' +
                ", mimos='" + mimos + '\'' +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                '}';
    }


    public Pessoa(String rg, String email){

    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMimos() {
        return mimos;
    }

    public void setMimos(String mimos) {
        this.mimos = mimos;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }


    public Pessoa() {
        setEmail(email);
        setNome(nome);
        setRg(rg);

    }


}