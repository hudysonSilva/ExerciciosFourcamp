/*
6.	Modifique novamente o programa anterior
-   de modo a não exibir na saída os números zero que são mostrados para todas
as posições que não receberam nenhum valor durante a atribuição (e portanto estão vazias).
 */
package ExercicioVetores01;
import java.util.Scanner;
public class Vetor06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numeroPar = new double[3];
        double[] numeroImpar = new double[3];
        double testador;

        System.out.println("Digite '10' numeros kkk 10 é uma pnoia digita 3 e ja era.");
        for(int i = 0; i < numeroImpar.length;i ++){
            do {
                System.out.printf("Digite o %d numero :", (i+1));
                testador = scan.nextDouble();
                if(testador == 0){
                    System.out.println("nesse exercicio a professora pediu pra não digitar 0 digita outro numero");
                }
            }while (testador == 0);
            if(testador % 2 == 1){
                numeroImpar[i] = testador;
                numeroPar[i] = 0;
            }
            else{
                numeroPar[i] = testador;
                numeroImpar[i] = 0;
            }


        }

        for (int i = 0;i < numeroImpar.length;i++){
            if(numeroPar[i]  == 0){
                System.out.println(numeroImpar[i]+" Impar");
            }
            else{
                System.out.println(numeroPar[i]+" Par");
            }
        }
    }
}
