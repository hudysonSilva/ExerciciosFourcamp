package ExerciciosFixacao;

import java.util.Scanner;


public class Exercicio4Java {
    public static void main(String[] args) {

        /*
        4. Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede)
         precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo)
         e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima
         quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
         */
        Scanner Scan = new Scanner(System.in);
        double alturaParede;
        double larguraParede;
        double alturaAzulejo;
        double larguraAzulejo;
        double quantidade;

        System.out.print("\nDigite a altura da parede");
        alturaParede = Scan.nextDouble();
        System.out.print("\nDigite a Largura da parede");
        larguraParede = Scan.nextDouble();
        //=================================================================
        System.out.print("\nDigite a altura ddo azulejo");
        alturaAzulejo = Scan.nextDouble();
        System.out.print("\nDigite a altura do zulejo");
        larguraAzulejo = Scan.nextDouble();

        quantidade = (alturaParede * larguraParede)/(alturaAzulejo * larguraAzulejo) ;
        System.out.println("A quantidade de Azulejo necessaria para cobrir a parede é :"+ (quantidade));

    }
}
