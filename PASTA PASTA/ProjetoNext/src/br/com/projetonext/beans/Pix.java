package br.com.projetonext.beans;

public class Pix {
    private int    idPix;
    private String chaveEmail;
    private String chaveCpf;
    private String chaveCelular;
    private String aleatorio;

    public int getIdPix() {
        return idPix;
    }

    public void setIdPix(int idPix) {
        this.idPix = idPix;
    }

    public String getChaveEmail() {
        return chaveEmail;
    }

    public void setChaveEmail(String chaveEmail) {
        this.chaveEmail = chaveEmail;
    }

    public String getChaveCpf() {
        return chaveCpf;
    }

    public void setChaveCpf(String chaveCpf) {
        this.chaveCpf = chaveCpf;
    }

    public String getChaveCelular() {
        return chaveCelular;
    }

    public void setChaveCelular(String chaveCelular) {
        this.chaveCelular = chaveCelular;
    }

    public String getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(String aleatorio) {
        this.aleatorio = aleatorio;
    }
}
