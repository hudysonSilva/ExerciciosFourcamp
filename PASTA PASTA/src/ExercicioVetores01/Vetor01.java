package ExercicioVetores01;
import java.util.Scanner;
public class Vetor01 {
    public static void main(String[] args) {
        /*
        1.	Escreva um algoritmo que solicite ao usuário a entrada de 5 números, e que exiba o somatório desses números
        na tela. Após exibir a soma, o programa deve mostrar também os números que o usuário digitou, um por linha.
         */
        Scanner scan = new Scanner(System.in);
        double[] vetor = new double[5];
        double soma = 0;
        for(int i = 0; i < vetor.length; i ++){
            System.out.printf("Digite o %dº numero :", (i+1));
            vetor[i] = scan.nextDouble();
            soma = vetor[i]+soma;
        }

        for(int i = 0; i < vetor.length; i ++){
            System.out.printf("\nVetor[%d]%.2f", i ,vetor[i]);
        }
        System.out.printf("\nA soma desses numeros é :%.2f", soma);



    }
}
