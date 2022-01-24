package br.com.NextV3.beans;

public enum TipoCliente {
    COMUM(1),PREMIUM(2),SUPER(3);

    private int id;

    TipoCliente(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}
