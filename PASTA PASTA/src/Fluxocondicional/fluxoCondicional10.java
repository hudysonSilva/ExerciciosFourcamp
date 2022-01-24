package Fluxocondicional;/*
10. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
− Triângulo Equilátero: possui os 3 lados iguais.
− Triângulo Isóscele: possui 2 lados iguais.
− Triângulo Escaleno: possui 3 lados diferentes.
 */
import java.util.Scanner;
import java.lang.Math;
public class fluxoCondicional10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ladoA;
        double ladoB;
        double ladoC;

        System.out.printf("Digite o tamado dos 3 lados de um triangulo");
        System.out.println("Lado A");
        ladoA = scan.nextDouble();
        System.out.println("Lado B");
        ladoB = scan.nextDouble();
        System.out.println("Lado C");
        ladoC = scan.nextDouble();

        if(ladoA == ladoB && ladoA == ladoC) {
            System.out.println("Equilatero");
        }
        else if(ladoA == ladoB || ladoB == ladoC || ladoB == ladoC){
            System.out.println("isoceles");
        }
        else{
            System.out.println("Escaleno");
        }

    }
}
