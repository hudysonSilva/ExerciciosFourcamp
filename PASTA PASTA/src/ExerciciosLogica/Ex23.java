package ExerciciosLogica;/*
Crie um programa para ler uma temperatura em graus
Fahrenheit, calcular e escrever o valor correspondente em
graus Celsius
 */
import java.util.Scanner;
import java.lang.Math;
public class Ex23 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        float far = 0;
        float cel = 0;

        System.out.println("Digite graus Fahrenheit :");
        far = Scan.nextFloat();
        System.out.println("A conversão para celcius é :"+((far-32)/1.8));


    }
}
