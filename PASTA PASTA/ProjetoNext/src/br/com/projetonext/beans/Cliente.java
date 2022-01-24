package br.com.projetonext.beans;

public class Cliente {

    private int         idCliente;
    private String      cpf;
    private String      nome;
    private String      dataDeNascimento;
    private Endereco    endereco;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

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

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  "\n     ===Cliente===" +
                "\ncpf              =" + cpf  +
                "\nnome             =" + nome +
                "\ndataDeNascimento =" + dataDeNascimento +
                "\nendereco         =" + endereco ;

    }
}
