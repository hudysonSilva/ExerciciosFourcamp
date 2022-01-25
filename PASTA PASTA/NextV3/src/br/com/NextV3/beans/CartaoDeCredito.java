package br.com.NextV3.beans;

public class CartaoDeCredito extends Cartao{
        private double limite;
        private double valorDaFatura;



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
