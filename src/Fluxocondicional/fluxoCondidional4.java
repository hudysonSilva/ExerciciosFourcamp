package Fluxocondicional;/*
4. As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.
 */
import java.util.Scanner;
import java.lang.Math;
public class fluxoCondidional4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double valor1 = 0.30 ;
        double valor2 = 0.25 ;
        int maca = 0;

        System.out.print("Digite a quantidade de macas a serem compradas :");
        maca = scan.nextInt();

        if (maca >= 12){
            System.out.printf("Preço Maçãs: %.2f", maca * valor2);

        }
        else {
            System.out.println("R$"+(maca * valor1));
        }

    }
}
