package LacosRepeticao;/*
7.	Crie um programa que imprima 11 vezes a frase " Hello World!" utilizando uma 
    estrutura sequencial e uma estrutura de repetição while
*/
import java.util.Scanner;
public class lacos07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1;
        do{ System.out.printf("\n%d Hello World", i);
            i = i+1;
        }while(i <= 10);   }}