package LacosRepeticao;/*
6.	Utilizando a estrutura de repetição for, faça um programa que receba 10 números e conte quantos deles estão
    no intervalo [10, 20] e quantos deles estão fora do intervalo, escrevendo estas informações.
 */
import java.util.Scanner;

public class lacos06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numero = new int[10];
        int intervalo = 0;

        System.out.println("digite 10 numeros");
        for(int i = 1;  i<=10; i++){
            System.out.printf("Digite o %dº numero :", i);
            numero[i-1]= scan.nextInt();

            if(numero[i-1] <=20 && numero[i-1] >=10) {
                intervalo = intervalo+1;
            }


        }
        System.out.printf("Existem %d numeros dentro do intervalo de 10-20", intervalo);
    }
}

