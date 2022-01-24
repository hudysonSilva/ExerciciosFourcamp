package br.com.projetonext.beans;

public class Endereco {

    private String cep;
    private String uf;
    private String cidade;
    private String bairro;
    private String logradouro;
    private int numero;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\n=======Endereco=======" +
                "\ncep          =" + cep +
                "\nuf           =" + uf +
                "\ncidade       =" + cidade +
                "\nbairro       =" + bairro +
                "\nlogradouro   =" + logradouro +
                "\nnumero       =" + numero;
    }
}
