package ExerciciosLogica;/*
Crie um programa que receba dois valores do usuário
e exiba a o resultado de sua subtração
*/
import java.util.Scanner;
public class Ex10 {
    public static void main (String[] args){
        Scanner Scan = new Scanner(System.in);
        float valorA;
        float valorB;

        System.out.println("===Digite 2 valores para subtração===");
        System.out.println("Digite o valor 1 :");
        valorA = Scan.nextFloat();
        System.out.println("Digite o valor2 :");
        valorB = Scan.nextFloat();
        System.out.println("O valor da subtração :"+(valorA-valorB));

    }
}
