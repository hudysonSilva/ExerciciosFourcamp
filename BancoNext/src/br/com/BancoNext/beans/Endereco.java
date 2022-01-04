package br.com.BancoNext.beans;

import java.util.SplittableRandom;

public class Endereco {
    String logradouro;
    int numero;
    String cep;
    String uf;
    String cidade;
    String bairro;
    String complemento;

    @Override
    public String toString() {
        return  " Endereco:" +
                "\n logradouro          ='" + logradouro + '\'' +
                "\n numero              =" + numero +
                "\n cep                 ='" + cep + '\'' +
                "\n uf                  ='" + uf + '\'' +
                "\n cidade              ='" + cidade + '\'' +
                "\n bairro              ='" + bairro + '\'' +
                "\n complemento         ='" + complemento + '\'' ;
    }
}
