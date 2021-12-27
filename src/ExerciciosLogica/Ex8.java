package ExerciciosLogica;/*
Crie um programa para que receba do usuário o salário e vale-refeição e exiba no console;
 */
import java.util.Scanner;

public class Ex8 {
    public static void main (String[] args){
        float salario;
        float vR;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Digite salario :");
        salario = Scan.nextFloat();
        System.out.println("Digite Vale refeição :");
        vR = Scan.nextFloat();
        System.out.println("Salario : "+salario+"\nVale refeição :"+vR);
        System.out.println("Total :"+(salario+vR));
    }
}
