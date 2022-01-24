package br.com.NextV3.bo;

import br.com.NextV3.beans.Endereco;

public class EnderecoBo {



    public Endereco cadastraEndereco (String cep,String uf,String cidade,String bairro,String logradouro,int numero){
        Endereco endereco = new Endereco();

        endereco.setCep(cep);
        endereco.setUf(uf);
        endereco.setCidade(cidade);
        endereco.setBairro(bairro);
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);


        return endereco;

    }
}
