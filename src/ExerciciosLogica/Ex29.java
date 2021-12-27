package ExerciciosLogica;/*
A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia
de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela
de hambúrguer pesa 100 gramas, faça um programa em que o dono forneça a quantidade de sanduíches a fazer, e a máquina
informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.
 */
import java.util.Scanner;
import java.lang.Math;
public class Ex29 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int pesoQue = 50;
        int pesoPre = 50;
        int pesoHam = 100;
        int qtdHam;

        System.out.println("Digite a quantidade de hamburgueres a serem produzidos :");
        qtdHam = Scan.nextInt();
        System.out.println("A quantidade de ingredientes necessarias é :");
        System.out.println("Peso de Queijo:"+((pesoQue*qtdHam))+" Gramas ");
        System.out.println("Peso de Presunto:"+(pesoPre*qtdHam)+" Gramas");
        System.out.println("Peso de Hamburguer:"+(pesoHam*qtdHam)+" Gramas");

    }
}
