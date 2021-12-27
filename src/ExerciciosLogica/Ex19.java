package ExerciciosLogica;/*
Crie um programa para ler o salário mensal atual de
um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário
 */
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        float salario;
        float reajuste;

        System.out.println("Digite o salario :");
        salario = Scan.nextFloat();
        System.out.println("Digite o reajuste em %");
        reajuste = Scan.nextFloat();

        System.out.println("O Salario com reajuste será :"+(salario*(1+(reajuste/100))));
    }
}
