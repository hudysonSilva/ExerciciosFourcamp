package LacosRepeticao;/*
2.	Escreva um programa para encontrar todos os números pares entre 1 e 100. Para saber se um número é par,
é necessário consultar se o resto da divisão deste número por 2 é igual à 0 (Operador Java para resto de divisão: %).

*/
import java.util.Scanner;

public class lacos02 {
    public static void main(String[] args) {
        for(int i = 1; i <=100; i++){
            if( i%2 == 0){
                System.out.printf("%d ,", i);
            }
        }
    }
}
