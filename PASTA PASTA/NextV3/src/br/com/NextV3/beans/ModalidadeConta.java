package br.com.NextV3.beans;

public enum ModalidadeConta {
    CORRENTE(1), POUPANCA(2);

    int id;

    ModalidadeConta(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
