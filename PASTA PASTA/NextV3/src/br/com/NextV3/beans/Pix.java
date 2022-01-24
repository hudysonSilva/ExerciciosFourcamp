package br.com.NextV3.beans;

import java.util.Date;

public class Pix {

    private int idPix;
    private TipoChavePix tipoChavePix;
    private String conteudoChavePix[] = new String[4];
    private Date data;
    private Boolean isAtive;

    public String[] getConteudoChavePix() {
        return conteudoChavePix;
    }

    public void setConteudoChavePix(String[] conteudoChavePix) {
        this.conteudoChavePix = conteudoChavePix;
    }

    public int getIdPix() {
        return idPix;
    }

    public void setIdPix(int idPix) {
        this.idPix = idPix;
    }

    public TipoChavePix getTipoChavePix() {
        return tipoChavePix;
    }

    public void setTipoChavePix(TipoChavePix tipoChavePix) {
        this.tipoChavePix = tipoChavePix;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Boolean getAtive() {
        return isAtive;
    }

    public void setAtive(Boolean ative) {
        isAtive = ative;
    }

}
