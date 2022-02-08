package br.com.NextV3.beans;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private int id;
    private String numero;
    private String bandeira;
    private int senha;
    private boolean isAtivo;
    private ArrayList<Double> fatura;
    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<Double> getFatura() {
        return fatura;
    }

    public void setFatura(ArrayList<Double> fatura) {
        this.fatura = fatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return isAtivo;
    }

    public void setAtivo(boolean ativo) {
        isAtivo = ativo;
    }
}
