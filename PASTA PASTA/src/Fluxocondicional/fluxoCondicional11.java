package Fluxocondicional;/*
11. Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:
− Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)
 */
import java.util.Scanner;
import java.lang.Math;
public class fluxoCondicional11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double anguloA;
        double anguloB;
        double anguloC;

        System.out.println("Digite 3 angulos internos de 1 triangulo");
        for(int i = 1; i<=3; i++){
            System.out.printf("Digite o %dº :", i);
            anguloA = scan.nextDouble();

            System.out.printf("Digite o %dº :", i);
            anguloB = scan.nextDouble();

            System.out.printf("Digite o %dº :", i);
            anguloC = scan.nextDouble();

        }
    }
}
