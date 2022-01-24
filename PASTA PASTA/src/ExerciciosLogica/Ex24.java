package ExerciciosLogica;/*
Crie um programa que leia três notas de um aluno,
calcule e escreva a média final deste aluno. Considerar que
a média é ponderada e que o peso das notas é 2, 3 e 5.
Fórmula para o cálculo da média final é
 */
import java.util.Scanner;
import java.lang.Math;
public class Ex24 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        float n1, n2, n3;

        System.out.println("Digite a primeira segunda e terceira nota do aluno :");
        System.out.println("N1 peso 2:");
        n1 = Scan.nextFloat();
        System.out.println("N2 peso 3:");
        n2 = Scan.nextFloat();
        System.out.println("N3 peso 5:");
        n3 = Scan.nextFloat();

        System.out.println("A media final é"+((n1*2)+(n2*3)+(n3*5))/10);

    }
}
