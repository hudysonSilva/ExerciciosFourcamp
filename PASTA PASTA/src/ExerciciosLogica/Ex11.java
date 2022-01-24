package ExerciciosLogica;/*
Crie um programa que receba dois valores do usuário
e exiba a o resultado de sua multiplicação
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        float valorA;
        float valorB;

        System.out.println("==Digite 2 valores para multiplicação==");
        System.out.println("Digite o primeiro valor :");
        valorA = Scan.nextFloat();
        System.out.println("Digite o Segundo valor :");
        valorB = Scan.nextFloat();
        System.out.println("O resuldado da multiplicação é :"+(valorA*valorB));


    }
}
