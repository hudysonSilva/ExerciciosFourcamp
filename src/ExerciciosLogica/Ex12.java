package ExerciciosLogica;/*
Crie um programa que receba dois valores do usuário
e exiba a o resultado de sua divisão
*/
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args){
    Scanner Scan = new Scanner(System.in);
    float valorA;
    float valorB;

        System.out.println("==Digite dois Valores Para Divisão==");
        System.out.println("Digite o primeiro valor :");
        valorA = Scan.nextFloat();
        System.out.println("Digite o Segundo valor :");
        valorB = Scan.nextFloat();
        System.out.println("O valor da divisão é :"+(valorA+valorB));

    }
}
