package ExerciciosLogica;/*
Crie um programa que receba dois valores do usuário
e exiba a o resultado de sua soma
 */
import java.util.Scanner;

public class Ex9 {
    public static void main (String[] args){
        Scanner Scan = new Scanner(System.in);
        float valorA;
        float valorB;
        System.out.println("===Digite dois valores para soma===");
        System.out.println("Digite o primeiro valor :");
        valorA = Scan.nextFloat();
        System.out.println("Digite o segundo valor :");
        valorB = Scan.nextFloat();
        System.out.println("A soma é :"+(valorA+valorB));



    }
}
