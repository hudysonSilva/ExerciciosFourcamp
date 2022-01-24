
/*
4.	Crie um programa que
- armazene 10 números digitados pelo usuário em dois vetores:
-um somente para números pares
-e outro somente para números ímpares.
-Após, exiba os valores dos dois vetores na tela, em sequência.
-As posições que não receberem valores exibirão o número zero.

 */
package ExercicioVetores01;
import java.util.Scanner;
public class Vetor04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numeroPar = new double[3];
        double[] numeroImpar = new double[3];
        double testador;

        System.out.println("Digite '10' numeros kkk 10 é uma pnoia digita 3 e ja era.");
        for(int i = 0; i < numeroImpar.length;i ++){
            System.out.printf("Digite o %d numero :", (i+1));
            testador = scan.nextDouble();
            if(testador % 2 == 1){
                numeroImpar[i] = testador;
                numeroPar[i] = 0;
            }
            else{
                numeroPar[i] = testador;
                numeroImpar[i] = 0;
            }


        }
        System.out.println("\nImpar       Par");

        for (int i = 0;i < numeroImpar.length;i++){
            System.out.println(numeroImpar[i]+"        "+numeroPar[i]);

        }

    }
}
