package ExerciciosFixacao;

import java.util.Scanner;
public class Exercicio6Java {

    public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    /*
    6. Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa de m
    quilogramas a uma altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999
     */

    double massa;
    double altura;
    double segundos;
    double cavalos;

        System.out.print("\nDigite o Peso ou massa :");
        massa  = Scan.nextDouble();

        System.out.print("\nDigite a Altura:");
        altura = Scan.nextDouble();

        System.out.print("\nDigite o Tempo em segundos:");
        segundos = Scan.nextDouble();

        cavalos = (massa * altura / segundos);
        System.out.print("\nA quantidade de cavalos necessaria é :"+ cavalos);

    }
}
