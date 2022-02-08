package br.com.NextV3.beans;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito extends Cartao{
        private double limite;
        private double valorDaFatura;
        private List<Double> fatura  = new ArrayList<>();

    @Override
    public List<Double> getFatura() {
        return fatura;
    }

    public void setFatura(List<Double> fatura) {
        this.fatura = fatura;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getValorDaFatura() {
        return valorDaFatura;
    }

    public void setValorDaFatura(double valorDaFatura) {
        this.valorDaFatura = valorDaFatura;
    }
}
