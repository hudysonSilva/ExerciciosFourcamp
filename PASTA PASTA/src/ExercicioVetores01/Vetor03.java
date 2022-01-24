

/*
3.	Crie um programa que solicite a entrada de 10 números pelo usuário, armazenando-os em um vetor, e então monte outro
vetor com os valores do primeiro multiplicados por 5. Exiba os valores dos dois vetores na tela, simultaneamente, em
duas colunas (um em cada coluna), uma posição por linha
 */
package ExercicioVetores01;
import java.util.Scanner;
public class Vetor03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numeros = new double[3];
        double[] numerosX5 = new double[3];

        System.out.println("Digite 10 numeros a seguir");
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("\nDigite o %dº numero :",i);
            numeros[i] = scan.nextDouble();
        }
        for(int i = 0; i < numeros.length; i++){
            numerosX5[i] = numeros[i]*5;
            System.out.println(numeros[i]+"        "+numerosX5[i]);
        }



    }

}
