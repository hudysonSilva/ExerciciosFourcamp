package br.com.NextV3.beans;

import java.util.Date;
import java.util.List;

public class Seguro {
    private double valor;
    private Date Carencia;
    private int id;
    private String nome;
    private List<String> regras;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getCarencia() {
        return Carencia;
    }

    public void setCarencia(Date carencia) {
        Carencia = carencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getRegras() {
        return regras;
    }

    public void setRegras(List<String> regras) {
        this.regras = regras;
    }
}
