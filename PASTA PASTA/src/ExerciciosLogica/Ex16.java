package ExerciciosLogica;/*
Crie um programa para ler base e altura de um retangulo(atravez do teclado) e calcular sua area
 */
import java.util.Scanner;

import java.lang.Math;
public class Ex16 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        float b;
        float h;
        System.out.println("Descubra a area de um retangulo");

        System.out.println("Digite a medida da base :");
        b = Scan.nextFloat();
        System.out.println("Digite a altura :");
        h = Scan.nextFloat();
        System.out.println("A area do Retangulo é :"+(b*h));

    }

}
