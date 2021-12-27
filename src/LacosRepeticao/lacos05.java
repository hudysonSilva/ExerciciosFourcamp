package LacosRepeticao;/*
5.	Faça um programa que leia 10 números inseridos pelo usuário e imprimir quantos deles são pares e quantos são ímpares
*/
import java.util.Scanner;

public class lacos05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 10 numeros ");
        int par = 0;
        int impar =0 ;
        int[] numero = new int[10];

        for (int i = 0; i <=9; i++){

            System.out.printf("Digite o %dº numero :", (i+1));

            numero[i]= scan.nextInt();

            if((numero[i] % 2) == 0){
                par = par +1;
            }
            else{
                impar= impar +1;
            }
        }

        System.out.printf("\nA quantidade de impares é :%d", impar);
        System.out.printf("\nA quantidade de pares é :%d", par);

    }
}

