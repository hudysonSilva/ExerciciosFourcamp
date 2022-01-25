package br.com.NextV3.beans;

import java.util.ArrayList;

public class Conta {


    private int IdConta;
    private int NumeroConta;
    private double saldo;
    private Cliente cliente;
    private ModalidadeConta modalidadeConta;
    private Pix pix;
    private Cartao cartao[] = new Cartao[2];
    //private static ArrayList<Cartao> ListaDeCartoes             = new ArrayList<>();

    public Cartao getCartao() {
        return cartao[2];
    }

    public void setCartao(Cartao cartao) {
        this.cartao[2] = cartao;
    }

    public Pix getPix() {
        return pix;
    }

    public void setPix(Pix pix) {
        this.pix = pix;
    }

    public ModalidadeConta getModalidadeConta() {
        return modalidadeConta;
    }

    public void setModalidadeConta(ModalidadeConta modalidadeConta) {
        this.modalidadeConta = modalidadeConta;
    }

    public int getIdConta() {
        return IdConta;
    }

    public void setIdConta(int idConta) {
        IdConta = idConta;
    }

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        NumeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
