package Fluxocondicional;/*
5. Escreva um programa para ler 3 valores inteiros (considere que não serão
lidos valores iguais) e escrevê-los em ordem crescente.
 */
import java.util.Scanner;
import java.lang.Math;
public class fluxoCondicional5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = {5,4,3,2,1};
        int organizador;
        int i;
        System.out.println("Vetor desorganizado");

        for(i=0;i<5;i++) {
            System.out.print(vetor[i]+", ");
        }

            for(i=0;i<5;i++){
                for(int j=0;j<4;j++){
                    if (vetor[j] > vetor[j+1]){
                    organizador = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = organizador;
                    }
                }
            }
        System.out.println("\nVetor Organizado");
        for(i=0;i<5;i++) {
            System.out.print(vetor[i]+", ");
        }
    }
}
