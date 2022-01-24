package ExerciciosLogica;/*
Crie um programa para ler a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dia. Considerar ano com 365 dias
e mês com 30 dias
 */
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int idadeDia;
        int idadeMes;
        int idadeAno;

        System.out.println("Escreva sua idade Anos, Meses  e Dias ");
        System.out.println("Quantos anos você tem :");
        idadeAno = Scan.nextInt();
        System.out.println("Quantos anos Mêses :");
        idadeMes = Scan.nextInt();
        System.out.println("Quantos dias :");
        idadeDia = Scan.nextInt();

        System.out.println("Você tem "+((idadeAno*365)+idadeMes*30+idadeDia));
        }
}
