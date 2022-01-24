package br.com.NextV3.beans;

public class ContaCorrente extends Conta {
    private double taxa = 0.45;
    String chavesPix[] = new String[4];
    int index;

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String[] getChavesPix() {
        return chavesPix;
    }

    public void setChavesPix(String[] chavesPix) {
        this.chavesPix = chavesPix;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
