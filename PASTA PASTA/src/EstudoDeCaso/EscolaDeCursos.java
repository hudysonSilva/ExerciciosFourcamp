package EstudoDeCaso;

import java.util.Scanner;

public class EscolaDeCursos {

    public static void main(String[] args) {

        //Variavel novaPessoa          Parametro(1), Parametro(2)
        Pessoa novaPessoa = new Pessoa (lerString() ,lerString(), lerString());

        //com GET ele 'busca' o nome setado no objeto 'novaPessoa'
        System.out.println(novaPessoa.getNome());

        //Metodo Setter ou "SetNome" para o objeto 'novaPessoa'
        novaPessoa.setNome(lerString());
        novaPessoa.setCurso("Inglês");


    }
    public static String lerString() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }
}

// ========================= TO DO==================================
        //cadastro da secretaria

        //lista de alunos

        //lista de cursos

        //
//====================================================================

