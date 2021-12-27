package EstudoDeCaso;

import java.util.Scanner;

public class EscolaDeCursos {

    public static void main(String[] args) {



        Pessoa novaPessoa = new Pessoa (lerString() ,lerString() );

        //com GET ele 'busca' o nome setado no objeto 'novaPessoa'
        System.out.println(novaPessoa.getNome());

        //Metodo Setter ou "SetNome" para o objeto 'novaPessoa'
        novaPessoa.setNome(lerString());






        /*
        String n1 = "a" , n2 = "b";

        //CLICA NO BOTÂO CADASTRAR NOVA PESSOA para construir uma pessoa atraves do metodo construtor
        Pessoa novaPessoa = new Pessoa (n1 ,n2 );
        */

// ========================= TO DO==================================
        //cadastro da secretaria

        //lista de alunos

        //lista de cursos

        //
//====================================================================

    }
    public static String lerString() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }
}
