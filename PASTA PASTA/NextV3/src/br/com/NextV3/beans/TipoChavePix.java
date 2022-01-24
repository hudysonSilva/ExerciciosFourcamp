package br.com.NextV3.beans;

public enum TipoChavePix {
    CPF(1),EMAIL(2),TELEFONE(3),ALEATORIO(4);

    int id;
    TipoChavePix(int id){
        id = this.id;
    }

    public int getId(){
        return this.id;
    }
}
