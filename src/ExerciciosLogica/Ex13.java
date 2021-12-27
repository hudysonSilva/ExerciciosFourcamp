package ExerciciosLogica;/*
Crie um programa com uma ou duas variáveis atribuindo valores iniciais e exiba a o resultado de sua exponenciação;
 */

import java.util.Scanner;
import java.lang.Math;

public class Ex13 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        float valorA = 2;
        float valorB = 3;
        System.out.println("Valor A ao quadrado ="+Math.pow(valorA,2));
        System.out.println("valor B ao quadrado ="+Math.pow(valorB,2));
    }
}
