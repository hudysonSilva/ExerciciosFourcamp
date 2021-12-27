/*
7. Faça   um   Programa   que   leia   um   vetor   de   5   números   i inteiros,   mostre   a   soma,   a multiplicação e os números.
 */
package ExercicioVetores02;
import java.util.Scanner;
public class Vetor07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inteiros = new int[]{1,2,3};

        //LEITURA E PROCESSAMENTO SOMA
        System.out.println("\nEsse é o Resultado da soma entre os numeros desse vetor");
        for(int i = 0; i < inteiros.length; i++) {
            for (int j = 0; j < inteiros.length; j++) {
                if (j == 2 && i== 2){
                System.out.print(inteiros[i] + inteiros[j]+". ");
            }
                else
                System.out.print(inteiros[i] + inteiros[j]+", ");
            }
        }
        //LEITURA E PROCESSAMENTO Multiplicação
        System.out.println("\nEsse é o Produto da multiplicação entre os numeros desse vetor");
        for(int i = 0; i < inteiros.length; i++) {
            for (int j = 0; j < inteiros.length; j++) {
                if (j == 2 && i== 2){
                    System.out.print(inteiros[i] * inteiros[j]+". ");
                }
                else
                    System.out.print(inteiros[i] * inteiros[j]+", ");
            }
        }
    }
}