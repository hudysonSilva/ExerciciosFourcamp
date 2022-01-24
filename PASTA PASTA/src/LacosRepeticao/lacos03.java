package LacosRepeticao;/*
3.	Faça um programa que leia um valor inteiro inserido pelo usuário e resulte na tabuada de 1 a 10 do valor lido.
Aceitar somente valores entre 1 e 10.
*/
import java.util.Scanner;

public class lacos03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(double i = 1, tabuada = 0; i <=10; i++){

            if (tabuada == 1) {
                System.out.printf("Digite um valor para tabuada :");
                tabuada = scan.nextDouble();
            }
            if (i < 10) {
                System.out.printf("%.1f ,",(tabuada * i));
            }
            else {
                System.out.printf("%.1f",(tabuada * i));
            }
        }
    }
}