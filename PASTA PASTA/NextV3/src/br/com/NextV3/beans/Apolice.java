package br.com.NextV3.beans;

import java.util.Date;
import java.util.List;

public class Apolice {
    private Date dataAssinatura;
    private Date dataCarencia;
    private int id;
    private List<Seguro> seguro;
    private double valor;

    public Date getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(Date dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public Date getDataCarencia() {
        return dataCarencia;
    }

    public void setDataCarencia(Date dataCarencia) {
        this.dataCarencia = dataCarencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Seguro> getSeguro() {
        return seguro;
    }

    public void setSeguro(List<Seguro> seguro) {
        this.seguro = seguro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
