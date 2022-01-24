
public class Cliente {
    private String cpf;
    private String nome;
    private Endereco endereco;
    private int idade;
    private Fita[] produtos = new Fita[3];


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Fita[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Fita[] produtos) {
        this.produtos = produtos;

    }
    public static Cliente cadastraCLiente(Cliente cliente) {
        //                                            ↑
        //Cadastro                                 cliente
        Utils ajuda = new Utils();
        do {
            cliente.setCpf(ajuda.lerSring("CPF"));
            if(cliente.getCpf().length() != 11){
                System.out.println("CPF invalido o CPF possui 11 digitos");
            }

        }while(cliente.getCpf().length() != 11 );
        cliente.setNome(ajuda.lerSring("Nome"));
        cliente.setIdade(ajuda.lerInteiro("Idade"));
        return cliente;
    }
    public static Cliente alugaFita(Fita fita){

        return null;
    }












}


