/*
6. Faça   um   Programa   que
FEITO -peça   as   quatro   notas   de   10   alunos,
FEITO -calcule   e   armazene num   vetor   a   média   de   cada   aluno,
-imprima   o   número   de   alunos   com   média   maior ou igual a 7.0.

 */
package ExercicioVetores02;
import java.util.Scanner;
public class Vetor06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeDeNotas = 4;
        int quantidadeAlunos = 3;
        int aprovados = 0;
        double[] media = new double[quantidadeAlunos];

        //FOR PARA QUANTIDADE DE ALUNOS
        for (int j = 0; j < quantidadeAlunos; j++) {
            media[j] = 0;

            double[] nota = new double[quantidadeDeNotas];
            //FOR PARA QUANTIDADE DE NOTAS
            for (int i = 0; i < nota.length; i++) {
                System.out.printf("\nDigite a %dª nota do %dº aluno:", (i + 1), (j + 1));
                nota[i] = scan.nextDouble();
                media[j] = media[j] + nota[i];
            }
            //PROCESSAMENTO DA MEDIA DO ALUNO E ARMAZENAMENTO NO VETOR  DE MEDIA
            media[j] = (media[j] / nota.length);
            if(media[j] >= 7){
                //PROCESSAMENTO DA QUANTIDADE DE ALUNOS COM MEDIA > 7
                aprovados = aprovados+1;
            }

        }
        System.out.println("A quantidade de alunos com a 7 ou maior é:"+aprovados);

    }
}