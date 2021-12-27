package EstudoDeCaso;


import java.util.Scanner;

public class Pessoa {

    //Planta da casa (Objeto)
    private String nome;
    private String email;


    //Empresa que constroi a casa (metodo construtor)
    public  Pessoa (String nome, String email){

    //  this  se refere ao                nome se refere ao parametro
    // local da classe principal          recebido no metodo construtor;
        this.                            nome = nome;
        this.email = email;
    }
    //Metodo que seta nome 'Definir' o nome na classe principal
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodo que traz 'Pega' nome que é dado na classe principal
    public String getNome() {
        return nome;

    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}