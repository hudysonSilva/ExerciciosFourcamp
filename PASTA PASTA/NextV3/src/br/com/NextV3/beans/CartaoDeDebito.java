package br.com.NextV3.beans;

public class CartaoDeDebito extends Cartao{
    private double limiteDeTranzaçoes;

    public double getLimiteDeTranzaçoes() {
        return limiteDeTranzaçoes;
    }

    public void setLimiteDeTranzaçoes(double limiteDeTranzaçoes) {
        this.limiteDeTranzaçoes = limiteDeTranzaçoes;
    }
}
