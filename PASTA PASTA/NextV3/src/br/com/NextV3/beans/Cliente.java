package br.com.NextV3.beans;

import java.lang.ref.PhantomReference;

public class Cliente {

    private int      idCliente;
    private String      cpf;
    private String      nome;
    private String      dataDeNascimento;
    private Endereco    endereco;
    private TipoCliente tipoCliente;
    private int         senha;

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getSenha() {
        return senha;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
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

}
