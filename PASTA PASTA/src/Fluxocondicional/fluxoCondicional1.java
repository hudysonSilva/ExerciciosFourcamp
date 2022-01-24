package Fluxocondicional;/*
1. Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.
 */
import java.util.Scanner;
import java.lang.Math;
public class fluxoCondicional1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int v1;
        int v2;

        System.out.println("Digite um valor");
        v1 = Scan.nextInt();
        do{
            System.out.println("Digite outro valor");
            v2 = Scan.nextInt();
            if( v1 == v2){
                System.out.println("Valor igual digite novamente");
            }

        }while ( v1 == v2);
    }
}
