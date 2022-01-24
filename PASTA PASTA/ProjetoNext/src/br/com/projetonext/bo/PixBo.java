package br.com.projetonext.bo;
import br.com.projetonext.beans.*;
public class PixBo {


    public Pix cadastraEmailPix(String email){
        Pix pix = new Pix();
        pix.setChaveEmail(email);
        return pix;
    }

    public Pix cadastraCelularPix (Pix pix,Conta conta,String celular){
        System.out.println("Digite um numero de celular");

        return pix;
    }

    public Pix cadastraCpfPix(Pix pix, String cpf){
        if(cpf.length() != 11 || !cpf.matches("[a-zA-Z]*")){
            System.out.println("CPF invalido digite novamente");
            return null;
        }
        else {
            pix.setChaveCpf(cpf);
            return pix;
        }
    }
}
